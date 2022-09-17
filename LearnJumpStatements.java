package week1.day2;

public class LearnJumpStatements {

	public static void main(String[] args) {
		
		for (int i =1; i<=5; i++) {
			if(i==4) {
				System.out.println("Four");
				//break; // breaking the entire loop
				continue; // particular iteration will be skipped
				// Both Break and Continue are Jumping Statements
			}
                System.out.println(i);	
		}
		 
		System.out.println("End of Program");

	}

}
