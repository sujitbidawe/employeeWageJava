class EmployeeWage{
	
public static void main(String[] args) {
		int IS_FULL_TIME = 1;

		System.out.println("Welcome to Employee Wage Computation Program!");
		double empCheck = Math.floor( Math.random() * 10 ) % 2;
		if ( empCheck == IS_FULL_TIME )
			System.out.println("Present");
		else
			System.out.println("Absent");	

	}

}