package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String getExcelData(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\SWAPNIL\\Documents\\Textdata.xlsx");
		
	String value =	WorkbookFactory.create(file).getSheet("Creds").getRow(1).getCell(0).getStringCellValue();
		
	//System.out.println(value);
	
	return value;
	}
	
	

}

	
	
		
		
	
	
	
	
	
	
	
	


