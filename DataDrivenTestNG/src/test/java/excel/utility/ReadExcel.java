package excel.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ReadExcel(String path) {
		
		try {
			File src= new File(path);
			FileInputStream fis= new FileInputStream(src);
			try {
				wb= new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sheet1= wb.getSheetAt(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getRowCount(String sheetName){
		int index = wb.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else{
		sheet1 = wb.getSheetAt(index);
		int number=sheet1.getLastRowNum()+1;
		return number;
		}
		
	}
	
	public String xlsRead(String sheetName, int row, int column){
		int rowCount = sheet1.getLastRowNum();
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public static void main(String[] args) {
		

	}

}
