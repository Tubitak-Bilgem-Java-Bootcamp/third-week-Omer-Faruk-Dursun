package account;

import address.Address;
import insurance.Insurance;
import user.User;

import java.util.ArrayList;

public abstract class Account implements Comparable {

    private User user;
    private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;
    private ArrayList<Insurance> insuranceList;

    public Account(User user) {
        this.user = user;
        this.insuranceList = new ArrayList<>();
    }

    public Account(User user, ArrayList<Insurance> insuranceList) {
        this.user = user;
        this.insuranceList = insuranceList;
    }

    public User getUser() {
        return user;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    final void showUserInfo() {
    }

    public Account login(){
        authenticationStatus = AuthenticationStatus.SUCCESS;
        return this;
    }

    public void addNewAddress(Address address) {
        user.addAddress(address);
    }

    abstract void addInsurance();
}
