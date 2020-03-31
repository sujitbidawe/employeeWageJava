class EmployeeWage{
	// Constants
	final int IS_PART_TIME = 1;
	final int IS_FULL_TIME = 2;
	
	public int computeWageBridgelabz( String compName ){
		System.out.println( "Welcome to "+ compName );
		
		// Constants 
		int EMP_RATE_PER_HOUR = 20;
		int MAX_NUM_OF_WORKING_DAYS = 20;
		int MAX_HRS_IN_MONTH = 100;
		
		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
	
		//computation
		while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < MAX_NUM_OF_WORKING_DAYS ) {
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
			System.out.println("Day# " + totalWorkingDays + "--> Emp Hr: " +  empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		return totalEmpWage;
	}

	public int computeWageGoogle( String compName ){		
		System.out.println( "Welcome to "+ compName );

		// Constants 
		int EMP_RATE_PER_HOUR = 25;
		int MAX_NUM_OF_WORKING_DAYS = 20;
		int MAX_HRS_IN_MONTH = 80;

		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		//computation
		while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < MAX_NUM_OF_WORKING_DAYS ) {
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
			System.out.println("Day# " + totalWorkingDays + "--> Emp Hr: " +  empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		return totalEmpWage;		
	}

	public static void main(String[] args) {
		
		System.out.println( "Welcome to Employee Wage Computation Program!" );

		EmployeeWage employee = new EmployeeWage();

		int bridgelabzTotalEmpWage = employee.computeWageBridgelabz( "bridgelabz" );
		System.out.println( "Total salary of employee in bridgelabz is: " + bridgelabzTotalEmpWage );

		System.out.println();

		int googleTotalEmpWage = employee.computeWageGoogle( "google" );
		System.out.println( "Total salary of employee in google is: " + googleTotalEmpWage );
	}
}