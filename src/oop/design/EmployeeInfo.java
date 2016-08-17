package oop.design;

public class EmployeeInfo extends AbstractEmployee{
    public static final int FIVE_PERCENT = 5;
    public static final int TEN_PERCENT = 10;
    public static final int FIFTEEN_PERCENT=15;
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		super(employeeId);

	}
    public EmployeeInfo(String name, int employeeId){
        super(employeeId,name);
    }
    public EmployeeInfo(String name, int employeeId, double salary){
        super(employeeId,name,salary);
    }


    public double getEmployeeMonthlyTotalPay(){
        return calculateSalary()+EmployeeInfo.calculateEmployeBonus(FIVE_PERCENT,calculateSalary());
    }
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeBonus(double bonusPercentage, double salary){
		return (bonusPercentage/100)*salary;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployePension( int numberOfYears, double salary){
		switch(numberOfYears) {
            case 1:
                return calculateEmployeBonus(FIVE_PERCENT, salary);
            case 2:
                return calculateEmployeBonus(TEN_PERCENT, salary);
            case 3:
                return calculateEmployeBonus(FIFTEEN_PERCENT, salary);
            //....
            default:
                return calculateEmployeBonus(80, salary);
        }
	}


}
