package AssignmentOne;

public class CompanyEmpWage {
	
		// variables 
		private String company_name;
		private final int emp_wage_per_hour;
		private final int workdays_per_month;
		private final int workhours_per_month;
		private int total_wage;
		private int daily_wage;
		
		//Constructor
		public CompanyEmpWage(String company_name, int emp_wage_per_hour, int workdays_per_month, int workhours_per_month)
		{	this.company_name = company_name;
			this.emp_wage_per_hour = emp_wage_per_hour;
			this.workdays_per_month = workdays_per_month;
			this.workhours_per_month = workhours_per_month;
		}

		public String getCompany_name() {
			return company_name;
		}

		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}

		public int getEmp_wage_per_hour() {
			return emp_wage_per_hour;
		}

		public int getWorkdays_per_month() {
			return workdays_per_month;
		}

		public int getWorkhours_per_month() {
			return workhours_per_month;
		}

		public int getTotal_wage() {
			return total_wage;
		}

		public void setTotal_wage(int total_wage) {
			this.total_wage = total_wage;
		}

		public int getDaily_wage() {
			return daily_wage;
		}

		public void setDaily_wage(int daily_wage) {
			this.daily_wage = daily_wage;
		}
}
