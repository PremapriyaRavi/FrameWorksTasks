package org.utility;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.utility.BaseClass;

public class SampleForExcel {
	@DataProvider(name="data")
	public Object[][] data() throws Throwable {
	return getData();
	}
	
	public static Object[][] getData() throws Throwable {
		String value=null;
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\ExcelSheets\\FbData.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(0);
		int rowCount = s.getPhysicalNumberOfRows();
		int cellCount = r.getPhysicalNumberOfCells();
		//Array initialize
		//to get the datas from the excel sheet
		Object[][] objArray=new Object[rowCount][cellCount];
		for(int i=0;i<rowCount;i++)
		{
			Row row = s.getRow(i);
			for(int j=0;j<cellCount;j++)
			   {
				Cell c= row.getCell(j);
				int type = c.getCellType();
				if(type==1)
				  {
					 value = c.getStringCellValue();
				  }
			    else
				  {
					 if(DateUtil.isCellDateFormatted(c)){
					 Date date = c.getDateCellValue();
					 SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
					  value = sim.format(date);
					  }else {
						double d = c.getNumericCellValue();
						long l=(long)d;
						value = String.valueOf(l);
					  }
				  }
				objArray[i][j]=value;
			   }
			
		  }
      return objArray;
	}

}




