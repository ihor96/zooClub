import java.lang.reflect.Array;
import java.util.*;

public class main {
    public static void main(String[] args) {
Person person1 = new Person("Ihor",26);
Person person2 = new Person("Max",36);
Person person3 = new Person("Petro",56);
Person person4 = new Person("Vasya",23);


Pet pet1 = new Pet("Dog","Rex",1);
Pet pet2 = new Pet("Cat","Mika",5);
Pet pet3 = new Pet("Parrot","Kusha",30);
Pet pet4 = new Pet("Fish","Karas",3);
Pet pet5 = new Pet("Cat","Kolobok",11);
Pet pet6 = new Pet("Dog","Jack",8);
Pet pet7 = new Pet("Snake","Snip",12);
Pet pet8 = new Pet("Pig","Meyson",2);
        ArrayList<Pet>Pet1=new ArrayList<>();
        Pet1.add(pet1);
        Pet1.add(pet2);
        ArrayList<Pet>Pet2=new ArrayList<>();
        Pet2.add(pet3);
        Pet2.add(pet4);
        ArrayList<Pet>Pet3=new ArrayList<>();
        Pet3.add(pet5);
        Pet3.add(pet6);
        ArrayList<Pet>Pet4=new ArrayList<>();
        Pet4.add(pet7);
        Pet4.add(pet8);
        HashMap<Person,List<Pet>>all = new HashMap<>();
        all.put(person1,Pet1);
        all.put(person2,Pet2);
        all.put(person3,Pet3);
        all.put(person4,Pet4);

        ZooClub zooClub = new ZooClub(all);
            System.out.println("1) додати учасника в клуб;\n" +
                    "2) додати тваринку до учасника клубу.\n" +
                    "3) видалити тваринку з власника.\n" +
                    "4) видалити учасника клубу.\n" +
                    "5) видалити конкретну тваринку з усіх власників.\n" +
                    "6) вивести на екран зооклуб.");
            Scanner scanner = new Scanner(System.in);
            int s = scanner.nextInt();

            switch (s){
                    case 1:
                            System.out.println("1)Додати учасника до клубу");
                            zooClub.addPersonToClub();
                            System.out.println("Так виглядає Зооклуб:");
                            System.out.println(zooClub);
                            break;
                    case 2:
                            System.out.println("2)Додати тваринку до учасника  клубу");
                            zooClub.addPetToPersonFromClub();
                            System.out.println("Так виглядає Зооклуб:");
                            System.out.println(zooClub);
                            break;
                    case 3:
                            System.out.println("3)Видалити тваринку від учасника  клубу");
                            zooClub.deletPetFromPerson();
                            System.out.println("Так виглядає Зооклуб:");
                            System.out.println(zooClub);
                            break;
                    case 4:
                            System.out.println("4)Видалити учасника  клубу");
                            zooClub.DeletPerson();
                            System.out.println("Так виглядає Зооклуб:");
                            System.out.println(zooClub);
                            break;
                    case 5:
                            System.out.println("5)Видалити конкретну тваринку з усіх власників.");
                            zooClub.DeleteTheConcretPetfromEverybody();
                            System.out.println("Так виглядає Зооклуб:");
                            System.out.println(zooClub);
                            break;
                    case 6:
                            System.out.println("6)Вивести весь зооклуб");
                            System.out.println("Так виглядає Зооклуб:");
                            zooClub.AllClubSout();
                            break;

            }
//
// zooClub.addPetToPersonFromClub();
// zooClub.deletPetFromPerson();
// zooClub.DeletPerson();
//zooClub.DeleteTheConcretPetfromEverybody();
//zooClub.AllClubSout();
    }
}
