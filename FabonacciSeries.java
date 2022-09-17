package week1.day2;

public class FabonacciSeries {

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for (int p=1; p<=10; p++) {
			num3 = num1 + num2;
			System.out.println(num3);
			
			//swap the numbers
			//num1 =1, num2 =1, num3=2
			num1 = num2; // num1 = 1
			num2 = num3; // num2 = 2
		}
			
		
	}

}
