import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Person {
   @NotNull
private String PersonName;
    @NotNull
private int PersonAge;
}
