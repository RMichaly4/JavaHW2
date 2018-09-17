import java.util.Arrays;
import java.util.Random;

public class UserService {

    public static void main(String[] args) {

        Address Address01 = new Address("Minsk","Belarus","Kalinovskogo 49-58","220103");

        final String ID = String.valueOf(new Random().nextInt(9999));
        User User01 = new User("id" + ID,"John", "Smith", Address01, "user1@x.xx", Arrays.asList("+998877","+112233"),Arrays.asList(), Arrays.asList("admin","manager"));

        System.out.println(User01.id +" "+ User01.firstName +" "+ User01.lastName +" "+ User01.address );
    }

}
