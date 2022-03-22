package account;

import insurance.Insurance;
import user.User;

import java.util.ArrayList;

public class IndividualAccount extends Account {

    public IndividualAccount(User user) {
        super(user);
    }

    public IndividualAccount(User user, ArrayList<Insurance> insuranceList) {
        super(user, insuranceList);
    }

    @Override
    void addInsurance(Insurance insurance) {
        this.getInsuranceList().add(insurance);
    }

    @Override
    public int compareTo(Object o) {
        return this.getUser().getUserId();
    }
}
