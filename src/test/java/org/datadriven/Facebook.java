package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utility.SampleForExcel;

public class Facebook {
	@Test(dataProvider="data",dataProviderClass=SampleForExcel.class)
	private void test2(String s1,String s2) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\Drivers\\chromedriver.exe ");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s2);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement errMsg = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String text = errMsg.getText();
		System.out.println(text);
		File loc=new File("C:\\Users\\PREMA\\eclipse-workspace\\Maven_11AM\\ExcelSheets\\FbData.xlsx");
		FileOutputStream out=new FileOutputStream(loc);
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet2");
		Row r = s.createRow(4);
		Cell c = r.createCell(2);
		c.setCellValue(text);
		w.write(out);
		
	}
	
}