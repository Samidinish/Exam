package oop.design;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	public static void main(String[] args) {





		EmployeeInfo s = new EmployeeInfo("Mohd Mohtashim", 1,3600.00);
		EmployeeInfo e = new EmployeeInfo("John Adams",2, 2400.00);

		System.out.println(s.employeeName());
		System.out.println(s.calculateSalary());
		System.out.println(s.getEmployeeMonthlyTotalPay());


		
		

	}

}
