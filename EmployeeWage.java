package AssignmentOne;

public class EmployeeWage {
	
	        //constants
			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME = 2;
			public static final int EMP_WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		
			// variables
			int empWage = 0;
			int empHours = 0;
		
			// Welcome Message		
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			
			// Computation
			double empCheck = Math.floor(Math.random()*10)%3;
			
			// if-else to Check and Display Employee is Present or Absent 
			if(empCheck == IS_FULL_TIME) {
				System.out.println("Employee Present");
				empHours = 8;
			}	
			else 
				if(empCheck == IS_PART_TIME){
				System.out.println("Employee Present - Part Time");
				empHours = 4;	
			}
			else 
				System.out.println("Employee Absent");	
			
			// Calculation of Daily Employee Wage
			empWage = empHours * EMP_WAGE_PER_HOUR;
			System.out.println("Employee Wage : "+empWage);
	}
}
