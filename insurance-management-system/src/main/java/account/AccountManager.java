package account;

import address.Address;
import address.BusinessAddress;
import address.HomeAddress;
import insurance.CarInsurance;
import insurance.Insurance;
import user.User;

import java.util.ArrayList;
import java.util.TreeSet;

public class AccountManager {

    private static TreeSet<Account> accounts = new TreeSet<>();

    static {
        // User 1
        Address[] userOneAddresses = {new HomeAddress(), new BusinessAddress()};
        ArrayList<Insurance> insuranceListOne = new ArrayList<>();
        insuranceListOne.add(new CarInsurance());
        User user1 = new User(1, "Name-1", "Surname-1", "user1@mail.com", "123", "Baker", 23, userOneAddresses);
        accounts.add(new IndividualAccount(user1, insuranceListOne));

        // User 2
        Address[] userTwoAddresses = {new HomeAddress(), new BusinessAddress()};
        User user2 = new User(2, "Name-2", "Surname-2", "user2@mail.com", "abc", "Engineer", 43, userTwoAddresses);
        accounts.add(new IndividualAccount(user2));

        // User 3
        Address[] userThreeAddresses = {new BusinessAddress()};
        User user3 = new User(3, "Name-3", "Surname-3", "user3@mail.com", "test", "Accountant", 56, userThreeAddresses);
        accounts.add(new IndividualAccount(user3));
    }

    public static Account login(String email, String password) {
        for (Account account : accounts) {
            if (email.equals(account.getUser().getEmail()) && password.equals(account.getUser().getPassword())) {
                account.login();
                return account;
            }
        }
        return null;
    }
}
