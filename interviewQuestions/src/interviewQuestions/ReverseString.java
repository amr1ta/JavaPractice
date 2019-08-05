package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Selenium";
		
		//!. using StringBuilder
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
		
		//2. using StringBuffer
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}

}
