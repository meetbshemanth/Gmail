package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivernFromExcel 

{
	
	File file;
	public void dataFromExcle(int rvalue, int cvalue) throws IOException
	{
	
		file = new File("C:\\Users\\user\\Desktop\\interview_Assignment\\gmaillogin\\src\\main\\resources\\DataFromExcle.xlsx");		
		FileInputStream fstream =new FileInputStream(file);	
		XSSFWorkbook wbook = new XSSFWorkbook(fstream);
	    XSSFSheet Sheet1=	wbook.getSheetAt(0);	    
	    String str =   Sheet1.getRow(rvalue).getCell(cvalue).toString();
	    System.out.println(str);
		
		
	
      }

}
