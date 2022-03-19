package basicsdemo;
public class Calculator_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator_2 calc = new Calculator_2();
		calc.add(100,200);
		calc.subtract(200,100);
		Calculator_2.subtract(300, 150);
		subtract(300,50);
	}
	public void add(int num1,int num2) {
		int result = 0;
		result = num1 + num2;
		System.out.println("Result of addition "+result);
	}
	public static void subtract(int num1,int num2) {
		int result = 0;
		result = num1 - num2;
		System.out.println("Result of subtraction "+result);
	}

}
