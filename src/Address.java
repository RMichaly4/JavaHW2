//Создать класс Address с полями city, country, street, postalCode
public class Address {
    private String city;
    private String country;
    private String street;
    private String postalCode;

    //конструктор
    Address(String city, String country, String street, String postalCode) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.postalCode = postalCode;
    }

}