import java.util.List;

//Создать класс User c полями id, firstName, lastName, address, email, List<String>phoneNumbers, List<User> friends.
public class User {
    public String id;
    public String firstName;
    public String lastName;
    public Address address;
    public String email;
    public List <String> phoneNumbers;
    public List <User> friends;
    public List <String> roles;

    //конструктор
    User(String id, String firstName, String lastName, Address address, String email, List <String> phoneNumbers, List<User> friends,  List <String> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address =address;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.friends = friends;
        this.roles = roles;
    }
}
