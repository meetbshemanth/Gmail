package gmailLoginFunction;



import org.testng.annotations.Test;

import pages.DataDrivernFromExcel;

public class TotestExcel 

{
	DataDrivernFromExcel dfExcle;
	@Test
	public void drawdatafromExcle() throws Exception
	{
		dfExcle = new  DataDrivernFromExcel();		
		dfExcle.dataFromExcle(1,1);
	 	
	}

}
