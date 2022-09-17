package week1.day2;

public class Calculator {

	public int sum (int num1, int num2) {
		return num1+ num2;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.sum(5, 3);
		System.out.println(sum);

	}

}
