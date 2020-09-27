package AssignmentOne;

public class Company {
	
	 	// constants
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		// variables 
		private int emp_wage_per_hour;
		private int workdays_per_month;
		private int workhours_per_month;
		private int emp_hours_per_day;
		
		//Constructor
		public Company(int emp_wage_per_hour, int workdays_per_month, int workhours_per_month)
		{
			this.emp_wage_per_hour = emp_wage_per_hour;
			this.workdays_per_month = workdays_per_month;
			this.workhours_per_month = workhours_per_month;
		}
		
		public void employeeAttendance() {
			// Computation
			int empCheck = (int)(Math.floor(Math.random()*10)%3);
						
			// if-else changed to Switch to Check and Display Employee is Present or Absent 
			switch(empCheck)
				{ 		  case IS_FULL_TIME : System.out.println("Employee Present - Full Time");
											  emp_hours_per_day = 8;
											  break;
						  case IS_PART_TIME : System.out.println("Employee Present - Part Time");
						  					  emp_hours_per_day = 4;
						  					  break;
						  default           : System.out.println("Employee Absent");
						  					  emp_hours_per_day = 0;
						
				}
			}
			
			// Re-factor to Compute Employee Wage Method in Class
			public int computeEmployeeWage() {
						// variables
						int empWage = 0;
						int dayCount = 0;
						int hoursWorked = 0;
						int totalWage = 0;
						
						// Calculation of Daily Employee Wage
						empWage = emp_hours_per_day * emp_wage_per_hour;
									
						// Tabular Display of Employee Details for Maximum Monthly Hours or Days
						System.out.println("Day\tHours Worked\tTotal Wage");
						while((hoursWorked+emp_hours_per_day)<=workhours_per_month && dayCount<workdays_per_month)
							{	
									dayCount++;
									hoursWorked += emp_hours_per_day;
									totalWage += empWage;
									System.out.println(" "+dayCount+"  \t"+hoursWorked+"  \t\t"+totalWage);
										
							}
									
						// Calculations of Employee Wage for Hours left out of Maximum Hours
						if(hoursWorked<workhours_per_month && dayCount<workdays_per_month)
						{
									dayCount++;
									totalWage += (workhours_per_month - hoursWorked) * emp_wage_per_hour;
									hoursWorked = hoursWorked + (workhours_per_month - hoursWorked);
									System.out.println(" "+dayCount+"  \t"+hoursWorked+"  \t\t"+totalWage);
						}	
						return totalWage;
						}
			}
