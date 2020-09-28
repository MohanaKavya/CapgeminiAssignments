package AssignmentOne.Service;

import AssignmentOne.CompanyEmpWage;

public interface ComputeEmployeeWage {
	
			// constants
			public static final int IS_FULL_TIME = 1;
			public static final int IS_PART_TIME = 2;
			
			 public void addCompany(String company_name, int emp_wage_per_hour, int workdays_per_month, int workhours_per_month);
			 public void computeEmployeeWage();
			 public void computeEmployeeWage(CompanyEmpWage company);



}
