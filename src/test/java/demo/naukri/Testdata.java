package demo.naukri;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Testdata {

 @Test
 
 public void Testread() throws Exception {
	 FileInputStream input = new FileInputStream("D:\\Selenium Software\\Workspace\\demo\\Testdata\\EMP Data.xlsx");
	 XSSFWorkbook workbook = new XSSFWorkbook(input);
	 XSSFSheet sheet = workbook.getSheet("Sheet1");
	 
	 int row = sheet.getPhysicalNumberOfRows();
	 System.out.println(row);
	 
	 int columns = sheet.getRow(0).getPhysicalNumberOfCells();
	 System.out.println(columns);
	   
	 for (int i = 0; i < row; i++) {
		 for(int j=0; j<columns; j++)
		 {
			 String Data = sheet.getRow(i).getCell(j).getStringCellValue();
			 System.out.println(Data);
		 }

	 }
}
 
}
