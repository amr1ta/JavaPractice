package guru99.com.test.utility;

import java.util.ArrayList;

import excel.utility.Xls_Reader;

public class TestDataUtility {
	
static Xls_Reader reader =new Xls_Reader("C:\\Users\\Amrita\\eclipse-workspace\\Guru99Project\\src\\test\\java\\com\\testdata\\TestData.xlsx");


public static ArrayList<Object[]> getDataFromExcel(){
	
	ArrayList<Object[]> myData= new ArrayList<Object[]>();
		for(int row=2;row<=reader.getRowCount("LoginCreds");row++) {
		String userId= reader.getCellData("LoginCreds", "userId", row);
		String password= reader.getCellData("LoginCreds", "Password", row);
		
		Object[] ob= {userId,password};
		myData.add(ob);
		}
	
	return myData;
	
}

public static ArrayList<Object[]> getDetailsfromExcel() {
	ArrayList<Object[]> myData= new ArrayList<Object[]>();
	String customerId;
	String password;
	String accountNumber;
	for (int i=2;i<=reader.getRowCount("APItest");i++) {
		customerId=reader.getCellData("APItest", "CustomerId", i);
		password=reader.getCellData("APItest", "Password", i);
		accountNumber=reader.getCellData("APItest", "AccountNumber", i);
		customerId= customerId.replaceAll("\\.0*$", "");
		accountNumber=accountNumber.replaceAll("\\.0*$", "");
		System.out.println(accountNumber);
		Object[] ob= {customerId,password,accountNumber};
		myData.add(ob);
	}
	
	return myData;
}
public static void main(String[] args) {
	//TestDataUtility obj= new TestDataUtility();
	getDetailsfromExcel();
}

}
