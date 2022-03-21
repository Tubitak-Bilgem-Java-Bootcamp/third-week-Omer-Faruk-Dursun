package insurance;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double cost;
    private Date startDate;
    private Date endDate;

    abstract void calculate();
}
