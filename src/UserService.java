import java.util.Arrays;
import java.util.Random;

public class UserService {

    public static void main(String[] args) {

        Address Address01 = new Address("Minsk","Belarus","Kalinovskogo 49-58","220103");
        Address Address02 = new Address("Minsk","Belarus","Sedykh 41-81","220104");

        final String ID = String.valueOf(new Random().nextInt(9999));
        User User01 = new User("id" + ID,"John", "Smith", Arrays.asList(Address01, Address02), "user1@x.xx", Arrays.asList("+998877","+112233"),Arrays.asList(), Arrays.asList("admin","manager"));
    }
}
