package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {

	
	@Test(priority=2)
	public void sum() {
		int a=1;
		int b=3;
		int c= a+b;
		System.out.println("Sum is= " +c);
				
	}
	
	@Test(dependsOnMethods= {"sum","multiply"})
	public void result() {
		System.out.println("The numbers are added");
		System.out.println("The numbers are multiplied");
		
	}
	
	
	@Test(invocationCount= 5, priority=1)
	public void multiply() {
		int a= 2;
		int b= 3;
		int c = a*b;
		
		System.out.println("The multiplication result= " +c);
	}
	
}
