package AssignmentOne;

public class EmployeeWage {
	
	        //constants
			public static final int IS_FULL_TIME = 1;

	public static void main(String[] args) {
		
			// Welcome Message		
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			
			// Computation
			double empCheck = Math.floor(Math.random()*10)%2;
			
			// if-else to Check and Display Employee is Present or Absent 
			if(empCheck == IS_FULL_TIME)
				System.out.println("Employee Present");
				
			else 
				System.out.println("Employee Absent");	
	}
}
