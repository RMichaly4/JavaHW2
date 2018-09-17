import java.util.Arrays;
import java.util.Random;

public class UserService {

    public static void main(String[] args) {

        Address Address01 = new Address("Minsk","Belarus","Kalinovskogo 49-58","220103");
        Address Address02 = new Address("Lida","Belarus","Sovetskaya 13-1","104099");

        //final String ID = String.valueOf(new Random().nextInt(9999));
        User UserA = new User("id" + (String.valueOf(new Random().nextInt(9999))),"John", "Smith", Address01, "userA@x.xx", Arrays.asList("+998877","+112233"),Arrays.asList(), Arrays.asList("admin","manager"));
        User UserB = new User("id" + (String.valueOf(new Random().nextInt(9999))),"Bob", "Johnes", Address02, "userB@x.xx", Arrays.asList("+554433","+778899"),Arrays.asList(UserA), Arrays.asList("manager"));
        User UserC = new User("id" + (String.valueOf(new Random().nextInt(9999))),"Andy", "Rey", Address02, "userC@x.xx", Arrays.asList("+668877","+123456"),Arrays.asList(UserA, UserB), Arrays.asList("manager"));


        System.out.println(UserA);
        System.out.println(UserB);
        System.out.println(UserC);
    }

}
