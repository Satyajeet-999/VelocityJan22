package WebDriverEx;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CheckedExceptionHandeling {
	public static void main(String[] args) {
		
	
	// checked Exception.
	
			// Example 1
			try {   
				 // we will write the risky code.
				Thread.sleep(2000);
			} catch (Exception e) {  // what error is occured. and we can also provide the aleternative solution if possible.
				e.printStackTrace();
			}
			
			// Example 2
				try {
					FileInputStream file = new FileInputStream("C:\\Users\\ACER\\Desktop\\ACCOUNT DETAILS.xlsx");
					String data = WorkbookFactory.create(file).getSheet("ACCOUNT DETAILS").getRow(0).getCell(0).getStringCellValue();
					System.out.println(data);
				}catch (Exception e) {  
					e.printStackTrace();
				}
		}
}
