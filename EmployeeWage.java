package AssignmentOne;

public class EmployeeWage {
	
			
	public static void main(String[] args) {
		
			// variables 
			int emp_wage_per_hour = 0;
			int workdays_per_month = 0;
			int workhours_per_month = 0; 
			
			// Welcome Message		
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			
			// Modified : Computation to Select Company
			int company_check = (int)(Math.floor(Math.random()*10)%3);
			
			// Switch Case to Select a Company 
			switch(company_check)
			{ 			case 0 :  System.out.println("Company A");
								  emp_wage_per_hour = 20;
								  workdays_per_month = 20;
								  workhours_per_month = 100;
								  break;
			            case 1 :  System.out.println("Company B");
						  		  emp_wage_per_hour = 10;
						  		  workdays_per_month = 15;
						  		  workhours_per_month = 80;
			  					  break;
			            case 2 :  System.out.println("Company C");
			            		  emp_wage_per_hour = 30;
			            		  workdays_per_month = 25;
			            		  workhours_per_month = 140;	
			}
			
			// Instantiation of Company Class
			Company company = new Company(emp_wage_per_hour, workdays_per_month, workhours_per_month);
			company.employeeAttendance();
			
			int totalWage = company.computeEmployeeWage();
		
			// Display of Employee Total Wage
			System.out.println("The Employee Total Wage for Maximum Hours or Days : "+totalWage);
			
	}
}
