package AssignmentOne;

public class EmployeeWage {
	
	        // constants
			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME = 2;
			public static final int EMP_WAGE_PER_HOUR = 20;
			public static final int WORKDAYS_PER_MONTH = 20;
			public static final int WORKHOURS_PER_MONTH = 100;
			
			// Refactor to Compute Employee Wage Method in Class
			public int computeEmployeeWage(int empHours) {
			// variables
			int empWage = 0;
			int dayCount = 0;
			int hoursWorked = 0;
			int totalWage = 0;
			
			// Calculation of Daily Employee Wage
			empWage = empHours * EMP_WAGE_PER_HOUR;
						
			// Tabular Display of Employee Details for Maximum Monthly Hours or Days
			System.out.println("Day\tHours Worked\tTotal Wage");
			while((hoursWorked+empHours)<=WORKHOURS_PER_MONTH && dayCount<WORKDAYS_PER_MONTH)
				{	
						dayCount++;
						hoursWorked += empHours;
						totalWage += empWage;
						System.out.println(" "+dayCount+"  \t"+hoursWorked+"  \t\t"+totalWage);
							
				}
						
			// Calculations of Employee Wage for Hours left out of Maximum Hours
			if(hoursWorked<WORKHOURS_PER_MONTH && dayCount<WORKDAYS_PER_MONTH)
			{
						dayCount++;
						totalWage += (WORKHOURS_PER_MONTH - hoursWorked) * EMP_WAGE_PER_HOUR;
						hoursWorked = hoursWorked + (WORKHOURS_PER_MONTH - hoursWorked);
						System.out.println(" "+dayCount+"  \t"+hoursWorked+"  \t\t"+totalWage);
			}	
			return totalWage;
			}

	public static void main(String[] args) {
		
			// variables 
			int empHours = 0;
			
			// Welcome Message		
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			
			// Computation
			int empCheck = (int)(Math.floor(Math.random()*10)%3);
			
			// if-else changed to Switch to Check and Display Employee is Present or Absent 
			switch(empCheck)
			{ case IS_FULL_TIME : System.out.println("Employee Present - Full Time");
								  empHours = 8;
								  break;
			  case IS_PART_TIME : System.out.println("Employee Present - Part Time");
			  					  empHours = 4;
			  					  break;
			  default           : System.out.println("Employee Absent");
			
			}
			
			EmployeeWage employee = new EmployeeWage();
			
			int totalWage = employee.computeEmployeeWage(empHours);
			
			// Display of Employee Total Wage
			System.out.println("The Employee Total Wage for Maximum Hours or Days : "+totalWage);
			
	}
}
