package org.excelbase;

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

public class BaseClassExcel {
	public static String getData(int row,int cell) throws Throwable {
		String value=null;
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\ExcelSheets\\DatasForExcel.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r = s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			{
				Cell c = r.getCell(j);
				int type = c.getCellType();
				//System.out.println(type);
				if(type==1) 
				{
					System.out.println(c.getStringCellValue());

				}else if(type==0)
				{
					if(DateUtil.isCellDateFormatted(c))
					{
						Date date = c.getDateCellValue();
						SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
						value = sim.format(date);

					}else
					{
						double d = c.getNumericCellValue();
						long l=(long)d;
						value=String.valueOf(l);
					}
				}
			}
	  }
		return value;
}

}
