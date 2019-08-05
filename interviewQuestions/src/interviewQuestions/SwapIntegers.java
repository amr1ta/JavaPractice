package interviewQuestions;

public class SwapIntegers {

	public static void main(String[] args) {
		
		int x=10;
		int y = 5;
		
		System.out.println("Before swap value of x: "+x);
		System.out.println("Before swap value of y: "+y);
		
		//-----Using 3rd variable-----
		
		int t = 0;
		t = x;
		x = y;
		y = t;
		
		System.out.println("After swap value of x: "+x);
		System.out.println("After swap value of y: "+y);

		
		//----without using 3rd variable
		x = x*y;
		y = x/y;
		x= x/y;
		
		System.out.println("After swap value of x: "+x);
		System.out.println("After swap value of y: "+y);
	}

}
