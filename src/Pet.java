import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Pet {
    @NotNull
    private String PetType;
    @NotNull
    private String PetName;
    @NotNull
    private int PetAge;
}
