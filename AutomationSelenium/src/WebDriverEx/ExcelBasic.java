package WebDriverEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBasic {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\ACER\\Desktop\\ACCOUNT DETAILS.xlsx");
	String data= WorkbookFactory.create(file).getSheet("ACCOUNT DETAILS").getRow(1).getCell(0).getStringCellValue();
	
	System.out.println(data);
	
	
	
	
	
}
	
	
	
	
	
	
}
