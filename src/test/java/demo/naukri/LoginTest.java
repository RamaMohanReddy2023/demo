package demo.naukri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends LoginApplication{
	
    @Test(dataProvider = "login")
	public void TestLog(String username,String password) {
    	browserInitialization();
    	loginApp(username,password);
    	
	}
    @DataProvider(name="login")
    public String[][] getData() throws Exception{
    String[][] test = null;
    FileInputStream input = new FileInputStream("D:\\Selenium Software\\Workspace\\demo\\Testdata\\EMP Data.xlsx");
	 XSSFWorkbook workbook = new XSSFWorkbook(input);
	 XSSFSheet sheet = workbook.getSheet("Sheet2");
	 
	 int row = sheet.getPhysicalNumberOfRows();
	 System.out.println(row);
	 
	 int columns = sheet.getRow(0).getPhysicalNumberOfCells();
	 System.out.println(columns);
	 
	 test = new String[row-1][columns];
	   
	 for (int i = 1; i < row; i++) {
		 for(int j=0; j<columns; j++)
		 {
		XSSFRow excelrow = sheet.getRow(i);
		Cell cell = excelrow.getCell(j);
		test[i-1][j]= cell.getStringCellValue();
		
		 }

	 }
	return test;

    }
}
