package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public String excel(int row, int col) throws Throwable {
		
		
		FileInputStream fis =  new FileInputStream(".\\src\\test\\resources\\orange.xlsx");
		
		
	Workbook  wo = 	WorkbookFactory.create(fis);
	
	String value = wo.getSheet("Orange").getRow(row).getCell(col).getStringCellValue();
	
	return value;
	
	
		
		
	}

}
