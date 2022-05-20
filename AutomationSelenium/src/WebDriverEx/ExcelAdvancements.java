package WebDriverEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAdvancements {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file;
	file=new
			FileInputStream("C:\\Users\\ACER\\Desktop\\ACCOUNT DETAILS.xlsx");
	String username= WorkbookFactory.create(file).getSheet("ACCOUNT DETAILS").getRow(1).getCell(0).getStringCellValue();
	System.out.println(username);
	
	
	file=new
			FileInputStream("C:\\Users\\ACER\\Desktop\\ACCOUNT DETAILS.xlsx");
	String accountno= WorkbookFactory.create(file).getSheet("ACCOUNT DETAILS").getRow(1).getCell(1).getStringCellValue();
	System.out.println(accountno);
	
	ArrayList al = new ArrayList();
	
	for(int i=0;i<=11;i++)
	{
		file=new
				FileInputStream("C:\\Users\\ACER\\Desktop\\ACCOUNT DETAILS.xlsx");
		String data= WorkbookFactory.create(file).getSheet("ACCOUNT DETAILS").getRow(i).getCell(0).getStringCellValue();
		System.out.println(data);
		al.add(data);
		
	}
	System.out.println("The size of Arraylist is "+al.size());
	
	
	
}
}
