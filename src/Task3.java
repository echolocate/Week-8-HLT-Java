
public class Task3 {

	public static void main(String[] args) {
		System.out.println("Quarrybank School Exam Results 2021-22");
		System.out.println("**************************************");
		System.out.println("John Paul awarded:");
		// Create instance for John, passing through 
		// values for Physics, Chemistry and Biology
		Results John = new Results(80, 65, 100);
		// Call methods to display and calculate 
		// personal test results for each subject combined 
		John.totalMark();
		John.percentOverall();
		
		System.out.println("");
		
		// Same for George, can add as many students 
		// as you need, just change names and grades
		System.out.println("George Unringo awarded:");
		Results George = new Results(100, 100, 100);
		George.totalMark();
		George.percentOverall();
				
}
}
