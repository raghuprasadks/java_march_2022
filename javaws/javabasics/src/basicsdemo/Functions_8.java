package basicsdemo;
public class Functions_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greet("Ravi");
		float si = simpleInterest(10000,6,1);
		System.out.println("Si is "+si);
		int num = 100;
		callByValue(num);
		System.out.println("value of num in main function "+num);
		int marks[]= {30,20,33,44};
		callByReference(marks);
		System.out.println("value of marks[3] in main function "+marks[3]);
	}
	public static void greet(String name) {
		System.out.println(name + " Welcome to Java");
	}
	// call by value and call by reference
	public static float simpleInterest(float p,float roi,float t) {
		return p*roi*t/100;
	}
	public static void callByValue(int num) {
		num +=100;
		System.out.println("num inside function "+num);
	}
	public static void callByReference(int marks[]) {
		marks[3]=100;
		System.out.println("marks[3] "+marks[3]);
		
	}
}
