package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOut {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\ExcelSheets\\DatasForExcel.xlsx");
	    FileOutputStream f=new FileOutputStream(loc);
	    Workbook w=new XSSFWorkbook();
	    Sheet s = w.createSheet("sheet2");
	    Row r = s.createRow(2);
	    Cell c = r.createCell(1);
	    c.setCellValue("selenium");
	    w.write(f);
	    System.out.println("done");
	
	}

}
