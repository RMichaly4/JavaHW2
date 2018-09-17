import java.util.List;

//Создать класс User c полями id, firstName, lastName, address, email, List<String>phoneNumbers, List<User> friends.
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private List <Address> addresses;
    private String email;
    private List <String> phoneNumbers;
    private List <User> friends;

    //конструктор
    User(String id, String firstName, String lastName, List <Address> addresses, String email, List <String> phoneNumbers, List<User> friends) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.friends = friends;
    }
}
