package oop.design;

/**
 * Created by asus on 8/16/2016.
 */
public abstract class  AbstractEmployee implements Employee {

    public static final int NUMBER_OF_MONTHS_IN_A_YEAR = 12;
    private int id;
    private String name;
    private String address;
    private double  salary;
    private String department;

    public AbstractEmployee(int id) {
        this.id=id;
    }
    public AbstractEmployee(int id, String name) {
        this(id);
        this.name=name;
    }

    public AbstractEmployee(int id,String name,double  salary){
        this(id,name);
        this.salary=salary;
    }
    public AbstractEmployee(int id,String name, String address){
        this(id,name);
        this.address=address;
    }

    public AbstractEmployee(int id, String name, String address, double  salary)
    {
     this(id, name, address);
        this.salary=salary;
    }


    @Override
    public int employeeId() {
        return this.id;
    }

    @Override
    public String employeeName() {
        return this.name;
    }

    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    @Override
    public double calculateSalary() {
        return salary/ NUMBER_OF_MONTHS_IN_A_YEAR;
    }

    @Override
    public void benefitLayout() {

    }


}


