package interviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		
	//------using mathematical logic------
		int num = 12345;
		int r = 0;
		
		while(num!=0)
		{
			r= r*10 + num%10;
			num = num/10;
		}

		System.out.println("The reverse number: " + r);
		
	//------ Using string reverse-----
	int num1 = 23456;
	String s = String.valueOf(num1);
	StringBuilder sb = new StringBuilder(s);
	System.out.println("The reverse number: " + sb.reverse());
	
}

}