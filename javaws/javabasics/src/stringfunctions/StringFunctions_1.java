package stringfunctions;

public class StringFunctions_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string literal
		String course = "Java MVC";
		// char array
		char coursechar[]={'J','a','v','a'};
		String coursenew = new String(coursechar);
		System.out.println("String literal "+course);
		System.out.println("Char array with new "+coursechar);
		String course1 = "Java MVC";
		System.out.println("course1 "+course1);
		System.out.println("String length "+course.length());
		System.out.println("Upper "+course.toUpperCase());
		System.out.println("indexOf string "+course.indexOf("Java"));
		System.out.println("indexOf a char "+course.indexOf("v"));
		System.out.println("substring "+course.substring(5));
		System.out.println("substring - va "+course.substring(2,4));
		
		
		
		
		

	}

}
