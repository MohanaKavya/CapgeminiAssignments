package AssignmentOne;

public class EmpWageBuilderArray {
			// constants
			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME = 2;
			
			private int numOfCompany = 0;
			private CompanyEmpWage[] companyEmpWageArray;
			
			public  EmpWageBuilderArray() {
				companyEmpWageArray = new CompanyEmpWage[5];
			}
			 public void addCompany(String company_name, int emp_wage_per_hour, int workdays_per_month, int workhours_per_month) {
				 companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company_name, emp_wage_per_hour, workdays_per_month, workhours_per_month);
				 numOfCompany++;
			 }
			 
			 public void computeEmployeeWage()
			 {
				 for(int i=0; i<numOfCompany; i++)
				 {
					 computeEmployeeWage(companyEmpWageArray[i]);
					 System.out.println("Employee Wage for Company "+companyEmpWageArray[i].getCompany_name()+" for Maximum Hours or Days is "+companyEmpWageArray[i].getTotal_wage());
				 }
			 }

			 // Re-factor to Compute Employee Wage Method in Class
			public void computeEmployeeWage(CompanyEmpWage company) {
				// variables
				int empWage = 0;
				int dayCount = 0;
				int hoursWorked = 0;
				int totalWage = 0;
				int emp_hours_per_day = 0;
				
				System.out.println("Company "+company.getCompany_name());
				
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
							
					}
				
				// Calculation of Daily Employee Wage
				empWage = emp_hours_per_day * company.getEmp_wage_per_hour();
							
				// Tabular Display of Employee Details for Maximum Monthly Hours or Days
				System.out.println("Day\tHours Worked\tTotal Wage");
				while((hoursWorked+emp_hours_per_day)<=company.getWorkhours_per_month() && dayCount<company.getWorkdays_per_month())
					{	
							dayCount++;
							hoursWorked += emp_hours_per_day;
							totalWage += empWage;
							System.out.println(" "+dayCount+"  \t"+hoursWorked+"  \t\t"+totalWage);
								
					}
							
				// Calculations of Employee Wage for Hours left out of Maximum Hours
				if(hoursWorked<company.getWorkhours_per_month() && dayCount<company.getWorkdays_per_month())
				{
							dayCount++;
							totalWage += (company.getWorkhours_per_month() - hoursWorked) * company.getEmp_wage_per_hour();
							hoursWorked = hoursWorked + (company.getWorkhours_per_month() - hoursWorked);
							System.out.println(" "+dayCount+"  \t"+hoursWorked+"  \t\t"+totalWage);
				}	
				company.setTotal_wage(totalWage);
				}
			
	public static void main(String[] args) {
			
			// Welcome Message		
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			
			EmpWageBuilderArray empWagebuilder = new EmpWageBuilderArray();
			empWagebuilder.addCompany("A", 20, 20, 100);
			empWagebuilder.addCompany("B", 10, 15, 80);
			empWagebuilder.addCompany("C", 30, 25, 140);
			empWagebuilder.computeEmployeeWage();


			
	}
}
