package AssignmentOne;

import java.util.ArrayList;
import AssignmentOne.Service.*;

public class EmpWageBuilderArrayList implements ComputeEmployeeWage {
			
			private ArrayList<CompanyEmpWage> companyEmpWageList;
			
			public  EmpWageBuilderArrayList() {
				companyEmpWageList = new ArrayList<CompanyEmpWage>();
			}
			 public void addCompany(String company_name, int emp_wage_per_hour, int workdays_per_month, int workhours_per_month) {
				 CompanyEmpWage companyEmpWage = new CompanyEmpWage(company_name, emp_wage_per_hour, workdays_per_month, workhours_per_month);
				 companyEmpWageList.add(companyEmpWage);
			 }
			 
			 public void computeEmployeeWage()
			 {
				 for(CompanyEmpWage company : companyEmpWageList)
				 {
					 computeEmployeeWage(company);
					 System.out.println("Employee Daily Wage for Company "+company.getCompany_name()+" is "+company.getDaily_wage());
					 System.out.println("Employee Wage for Company "+company.getCompany_name()+" for Maximum Hours or Days is "+company.getTotal_wage());
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
				company.setDaily_wage(empWage);
							
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
			
			EmpWageBuilderArrayList empWagebuilder = new EmpWageBuilderArrayList();
			empWagebuilder.addCompany("A", 20, 20, 100);
			empWagebuilder.addCompany("B", 10, 15, 80);
			empWagebuilder.addCompany("C", 30, 25, 140);
			empWagebuilder.computeEmployeeWage();


			
	}
}
