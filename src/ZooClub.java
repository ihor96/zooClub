import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
@AllArgsConstructor
@Data
public class ZooClub {
    @NotNull
    private Map<Person, List<Pet>> club;

public Object addPersonToClub(){
    System.out.println("Add new Person to zooClub ");
    System.out.println("Name person ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("Person Age");
    Scanner scanner1 = new Scanner(System.in);
    int age = scanner1.nextInt();
    return     getClub().put(new Person(name,age),new ArrayList<>());
}
    public Object addPetToPersonFromClub() {
        System.out.println("Add new Pet to Person from zooClub ");
        System.out.println("Name, who has new Pet ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Type your Pet :");
        Scanner scanner1 = new Scanner(System.in);
        String PetType = scanner1.next();

        System.out.println("Name your Pet :");
        Scanner scanner2 = new Scanner(System.in);
        String PetName = scanner2.next();
        System.out.println("Age your Pet :");
        Scanner scanner3 = new Scanner(System.in);
        int PetAge = scanner3.nextInt();


        Set<Map.Entry<Person, List<Pet>>> entries = getClub().entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();
            if (next.getKey().getPersonName().equals(name)){
                next.getValue().add(new Pet(PetType,PetName,PetAge));
            }

        }
    return getClub();}
   public Object deletPetFromPerson(){
       System.out.println("Delet  Pet From Person");
       System.out.println("Name, whose this Pet ");
       Scanner scanner = new Scanner(System.in);
       String name = scanner.next();
       System.out.println("Type your Pet :");
       Scanner scanner1 = new Scanner(System.in);
       String PetType = scanner1.next();

       System.out.println("Name your Pet :");
       Scanner scanner2 = new Scanner(System.in);
       String PetName = scanner2.next();



       Set<Map.Entry<Person, List<Pet>>> entries = getClub().entrySet();
       Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
       while (iterator.hasNext()) {
           Map.Entry<Person, List<Pet>> next = iterator.next();
           if (next.getKey().getPersonName().equals(name)){
               Iterator<Pet> iterator1 = next.getValue().iterator();
               while (iterator1.hasNext()){
                   Pet next1 = iterator1.next();
                  if (next1.getPetType().equals(PetType)&&next1.getPetName().equals(PetName)){
                      next.getValue().remove(next1);
                  }
               }

       }}
       return getClub();


    }
public Object DeletPerson() {
    System.out.println("Name,whose delete");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();

    Set<Map.Entry<Person, List<Pet>>> entries = getClub().entrySet();
    Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
    while(iterator.hasNext()){
        if (iterator.next().getKey().getPersonName().equals(name)){
            iterator.remove();
        }
    }


    return   getClub();   }

    public Object DeleteTheConcretPetfromEverybody(){
        System.out.println("Введіть який тип тварин видалити ");
    Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        Set<Map.Entry<Person, List<Pet>>> entries = getClub().entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
        while (iterator.hasNext()){
            List<Pet> value = iterator.next().getValue();
            Iterator<Pet> iterator1 = value.iterator();
            while(iterator1.hasNext()){
                Pet next = iterator1.next();
                if(next.getPetType().equals(type)){
                    iterator1.remove();
                }
            }
        }

   return getClub(); }
public void AllClubSout(){
    System.out.println(getClub());
}
}