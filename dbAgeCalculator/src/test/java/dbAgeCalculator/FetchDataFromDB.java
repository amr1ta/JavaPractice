package dbAgeCalculator;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromDB {
	static WebDriver driver;

	public static void main(String[] args) throws Exception
	{
		
	getdata();
	}
	
	public static Connection getConnection() throws Exception
	{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/python";
			String username = "root";
			String password = "1234";
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("successfully connected");
			return connection;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public static ArrayList<Object[]> getdata() throws Exception
	{
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		
		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement("Select * from age_cal");
		ResultSet result = statement.executeQuery();
		
		while (result.next())
		{
		
			String name = result.getString("name");
			Date dob = result.getDate("dob");
			String strDate = new SimpleDateFormat("ddMMyyyy").format(dob);
			int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(dob));
//			
			Object[] ob = {name,strDate,year};
			myData.add(ob);
			
		}
		System.out.println(myData);
		return myData;
	}
		
	
	}
	

