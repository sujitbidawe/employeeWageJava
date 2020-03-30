class EmployeeWage{
	
	public void computeWage( String compName, int EMP_RATE_PER_HOUR, int MAX_NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH ){
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
	
		System.out.println("Welcome to "+ compName +"'s data");

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
		System.out.println("In " + compName + ", total salary of given employee is: " + totalEmpWage );
		
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program!");

		EmployeeWage employee = new EmployeeWage();

		employee.computeWage("bridgelabz", 20, 20, 100);
		System.out.println();
		employee.computeWage("google", 25, 20, 120);
		
	}

}