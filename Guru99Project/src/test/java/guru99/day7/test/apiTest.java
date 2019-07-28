package guru99.day7.test;

import org.testng.annotations.Test;

import guru99.com.test.utility.TestDataUtility;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.io.IOUtils;
import org.apache.http.ParseException;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;

public class apiTest {



  @DataProvider
	public Iterator<Object[]> getDetailsfromExcel() {
		
	ArrayList<Object[]> testData= TestDataUtility.getDetailsfromExcel();
	//System.out.println(testData);
		return testData.iterator();
	}
  
	
	@Test(dataProvider= "getDetailsfromExcel", priority=1)
	public void getURI(String customerId, String password,String accountNumber) throws ParseException, IOException {
//		String uri= "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID="+customerId+"&PASSWORD="+password+"&Account_No="+accountNumber;
		JSONObject response = new JSONObject(IOUtils.toString(new URL("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID="+customerId+"&PASSWORD="+password+"&Account_No="+accountNumber),Charset.forName("UTF-8")));
		System.out.println(response);
	}
	
	
	
}
  


