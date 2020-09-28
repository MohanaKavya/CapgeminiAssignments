package AssignmentOne;

public class EmployeeWage {
	
			
	public static void main(String[] args) {
			
			// Welcome Message		
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			
			System.out.println("Company A");
			Company companyA = new Company(20, 20, 100);
			int totalWageA = companyA.computeEmployeeWage();
			System.out.println("The Employee Total Wage for Company A : "+totalWageA);
			
			System.out.println("Company B");
			Company companyB = new Company(10, 15, 80);
			int totalWageB = companyB.computeEmployeeWage();
			System.out.println("The Employee Total Wage for Company B : "+totalWageB);
			
			System.out.println("Company C");
			Company companyC = new Company(30, 25, 140);
			int totalWageC = companyC.computeEmployeeWage();
			System.out.println("The Employee Total Wage for Company C : "+totalWageC);
			
	}
}
