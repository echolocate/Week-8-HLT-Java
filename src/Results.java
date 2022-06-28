
public class Results {
		
		// instantiate the 5 variables (/ attributes?)
		// set to private to keep internal to this class
		private int physics;
		private int chemistry;
		private int biology;
		private int total;
		private int percentage;
		
		// Create constructor for Results object, with the parameters 
		// needed from the Task2.java class which calls it
		public Results(int physics, int chemistry, int biology) {
			// References private attributes from this class
			this.physics = physics; 
			this.chemistry = chemistry;
			this.biology = biology;
		}
		
		// Create the two methods to calculate and display
		// required for the instances in Task2.java calling class
		public void totalMark() {
			total = physics + biology + chemistry;
			System.out.println("Physics: " + this.physics + " / 150");
			System.out.println("Chemistry: " + this.chemistry  + " / 150");
			System.out.println("Biology: " + this.biology + " / 150");
			System.out.println("Total Marks (all subjects): " + this.total);
		}
		
		public void percentOverall() {
			percentage = ((total * 100)/450);
			System.out.println("Overall Grade: " + percentage + " %");
		}
		

}
