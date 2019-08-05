package interviewQuestions;

public class SwapStrings {

	public static void main(String[] args) {
		
		String x = "hello";
		String y = "world";
		
		System.out.println("Before swap value of x: "+x);
		System.out.println("Before swap value of y: "+y);
		
		//-----Using 3rd variable-----
		
		String t = "";
		t = x;
		x = y;
		y = t;
		
		System.out.println("After swap value of x: "+x);
		System.out.println("After swap value of y: "+y);

		
		//----without using 3rd variable
		x = x+y;
		y = x.substring(0, x.length()-y.length());
		x = x.substring(y.length());
		
		System.out.println("After swap value of x: "+x);
		System.out.println("After swap value of y: "+y);
	}


	}


