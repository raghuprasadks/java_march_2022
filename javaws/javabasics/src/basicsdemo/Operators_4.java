package basicsdemo;

public class Operators_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unary operator");
		
		int num=10;
		System.out.println("Unaray operator "+num++);
		System.out.println(num++);
		int num1=50;
		//int result =++num1;
		int result = num1++;
		System.out.println("Result "+result);
		System.out.println("num1 "+num1);
		
		System.out.println("Binary operator");
		System.out.println("Arithmetic operator");
		// +,-,*,/,%
		// Relational >,<.>=,==,!=
		// logical operator &&,||,!
		// assignment
		// ternary operator
		
		num1=300;
		int num2=100;
		int num3=250;
		boolean isTrue = (num1>num2) && (num3 < num2);
		System.out.println("&& : "+isTrue);
		
		int greatest = (num1>num2)?num1:num2;
		System.out.println("greatest "+greatest);
		
		

	}

}
