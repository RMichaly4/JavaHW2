import java.util.Random;

public class UserService {

    public static void main(String[] args) {

        Address Address01 = new Address("Minsk","Belarus","Kalinovskogo 49-58","220103");

        final String ID = String.valueOf(new Random().nextInt(9999));
        User User01 = new User("id" + ID,"John", "Smith", Address01, "user1@x.xx", ("+998877");
    }
}
