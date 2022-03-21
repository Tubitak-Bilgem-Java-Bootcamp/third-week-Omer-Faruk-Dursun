package user;

import address.Address;

import java.util.Date;

public class User {
    private int userId;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String profession;
    private int age;
    private Address[] listOfAddress;
    private Date lastLogin;

    public User(int userId, String name, String surname, String email, String password, String profession, int age, Address[] listOfAddress) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        this.listOfAddress = listOfAddress;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }

    public Address[] getListOfAddress() {
        return listOfAddress;
    }

    public void addAddress(Address address) {

    }
}
