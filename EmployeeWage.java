import java.util.ArrayList;

interface wageComputation {
	public void computeWage( CompanyEmpWage obj );
}

public class EmployeeWage implements wageComputation{
	// Constants
	final int IS_PART_TIME = 1;
	final int IS_FULL_TIME = 2;

	ArrayList<Integer> empDailyAndTotalWage = new ArrayList<Integer>();
	
	public void computeWage( CompanyEmpWage companyEmp ){
		System.out.println("Welcome to "+ companyEmp.getCompName() );
		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int empDailyWage = 0;
		int empTotalWage = 0;
	
		//computation
		while ( totalEmpHrs <= companyEmp.getMaxHoursInMonth() && totalWorkingDays < companyEmp.getMaxNumberOfWorkingDays() ) {
			totalWorkingDays++;
			int empCheck = (int)(( Math.random() * 10 ) % 3);
			switch (empCheck) {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			empDailyWage = empHrs * companyEmp.getEmpRatePerHour();
			empDailyAndTotalWage.add( empDailyWage );
			System.out.println( "Day# " + totalWorkingDays + "--> Emp Hr: " +  empHrs );
		}
		empTotalWage = totalEmpHrs * companyEmp.getEmpRatePerHour();
		empDailyAndTotalWage.add( empTotalWage );
		companyEmp.setTotalEmpWage( empTotalWage );
		System.out.println( "At " + companyEmp.getCompName() + " total wage of employee is " + companyEmp.getTotalEmpWage() );
	}

	public static void main(String[] args) {
		System.out.println( "Welcome to Employee Wage Computation Program!" );
		EmployeeWage employee = new EmployeeWage();
		//ArrayList of many CompanyEmpWage objects
		ArrayList<CompanyEmpWage> company = new ArrayList<CompanyEmpWage>();

		company.add( new CompanyEmpWage( "bridgelabz", 20, 20, 100 ));
		employee.computeWage( company.get(0) );

		company.add( new CompanyEmpWage( "google", 25, 20, 80 ));
		employee.computeWage( company.get(1) );
	}
}

class CompanyEmpWage{

	public String COMP_NAME;
	public int EMP_RATE_PER_HOUR;
	public int MAX_NUM_OF_WORKING_DAYS;
	public int MAX_HRS_IN_MONTH;

	public int totalEmpWage;

	//constructor
	public CompanyEmpWage( String COMP_NAME, int EMP_RATE_PER_HOUR, int MAX_NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH ){
		this.COMP_NAME = COMP_NAME;
		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.MAX_NUM_OF_WORKING_DAYS = MAX_NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
	}

	// GETTERS
	public String getCompName(){
		return COMP_NAME;
	}

	public int getEmpRatePerHour(){
		return EMP_RATE_PER_HOUR;
	}

	public int getMaxNumberOfWorkingDays(){
		return MAX_NUM_OF_WORKING_DAYS;
	}

	public int getMaxHoursInMonth(){
		return MAX_HRS_IN_MONTH;
	}

	public int getTotalEmpWage(){
		return totalEmpWage;
	}

	//SETTERS
	public void setTotalEmpWage( int totalEmpWage ){
		this.totalEmpWage = totalEmpWage ;
	}
}