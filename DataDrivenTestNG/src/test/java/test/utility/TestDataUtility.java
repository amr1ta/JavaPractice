package test.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import excel.utility.ReadExcel;
import excel.utility.Xls_Reader;

public class TestDataUtility {
	
static Xls_Reader reader ;
static ReadExcel read;


public static ArrayList<Object[]> getDataFromExcel(){
	
	try {
		reader = new Xls_Reader("C:\\Users\\Amrita\\eclipse-workspace\\DataDrivenTestNG\\src\\test\\java\\com\\testdata\\TestData.xlsx");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ArrayList<Object[]> myData= new ArrayList<Object[]>();
	for(int row=2; row<=reader.getRowCount("LoginCreds");row++) {
		String userName= reader.getCellData("LoginCreds", "UserName", row);
		String password= reader.getCellData("LoginCreds", "Password", row);
		
		Object[] ob= {userName,password};
		myData.add(ob);
		
	}
	return myData;
	
}

public static ArrayList<Object[]> getData() throws Exception{
	ArrayList<Object[]> myData= new ArrayList<Object[]>();
	File src = new File("src\\test\\java\\com\\testdata\\TestData.xlsx");
    FileInputStream fis = new FileInputStream(src);
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet1 = wb.getSheet("GetAge");
    int rowCount = sheet1.getLastRowNum();
    for(int i=1;i<=rowCount;i++) {
    	String name= sheet1.getRow(i).getCell(0).getStringCellValue();
    	//get date values from excel
        Date data0 = sheet1.getRow(i).getCell(1).getDateCellValue();
        //get date in mentioned format
        String date = new SimpleDateFormat("dd-MM-yyyy").format(data0);
        //get the year from the date
        int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(data0));
       // System.out.println(date);
    Object[] ob= {name,date,year};
	myData.add(ob);
    }
	return myData;
	
}

}
