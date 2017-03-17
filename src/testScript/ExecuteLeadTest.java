package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExecuteLeadTest extends Keyword {
	
	
	public static Logger log;
	ExtentReports report;
	ExtentTest logger; 
	
	 

	       
	
	public static Keyword keyword;
	
	 @BeforeMethod
	  public void setProperty() throws IOException
	  {
		
		 //String log4jConfPath = "C://Users//Prajakta//workspace//SageSurferDataDrivenFramework//log4j.properties";
		// PropertyConfigurator.configure("C://Users//Prajakta//workspace//SageSurferDataDrivenFramework//log4j.properties");

		 System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		 /*report=new ExtentReports("C:\\Users\\Prajakta\\workspace\\SageSurferDataDrivenFramework\\loggerreport.html");
		 logger=report.startTest("VerifyBlogIsWorkingProperly");*/
	  }
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		@Test(priority=0,enabled=true)
	
		public void Blogs() throws IOException, InterruptedException {
			
			keyword = new Keyword();
			@SuppressWarnings("rawtypes")
			ArrayList data = new ArrayList();
			FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
			@SuppressWarnings("resource")
			XSSFWorkbook workbook  = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Blogs");
			@SuppressWarnings("rawtypes")
			Iterator row = sheet.iterator();
			while (row.hasNext()) {
				
				Row rowIterator = (Row) row.next();
				@SuppressWarnings("rawtypes")
				Iterator cellItr = rowIterator.cellIterator();
				
				while (cellItr.hasNext()) {
					Cell cell = (Cell) cellItr.next();
					switch (cell.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						data.add(cell.getStringCellValue());
					    break;
					case Cell.CELL_TYPE_BOOLEAN:
						data.add(cell.getBooleanCellValue());
					    break;
					case Cell.CELL_TYPE_NUMERIC:
						data.add(cell.getNumericCellValue());
					    break;
					
					}
				}
				
			}
			System.out.println(data);
			for (int i=3;i<data.size();i++){
				
				if (data.get(i).equals("openbrowser")) {
					System.out.println(data.get(i));
					keyword.openbrowser();
									}
				if (data.get(i).equals("navigate")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					keyword.navigate(testData);
				}
				if (data.get(i).equals("input")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key);
					System.out.println(testData);
					System.out.println(objectName);
					keyword.input(testData,objectName);
					
				}
				if (data.get(i).equals("click")){
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key); 
					System.out.println(testData);
					System.out.println(objectName);	
					keyword.click(objectName);
					
				}
				if (data.get(i).equals("shutdown")) {
					System.out.println(data.get(i));
					keyword.shutdown();
				}
			
					if (data.get(i).equals("scroll")){
						System.out.println(data.get(i));
					  keyword.scroll();
						
					}
					if (data.get(i).equals("myframe")){
						System.out.println(data.get(i));
					  keyword.myframe();
						
					}
					if (data.get(i).equals("assertc")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.assertc(testData);
						
					}
					if (data.get(i).equals("screenshot")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.screenshot(testData);
						
					}
					if (data.get(i).equals("click1")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.click1(objectName);
					}
					if (data.get(i).equals("inputjavaScript")){
						System.out.println(data.get(i));
    					 keyword.inputjavaScript();
						
					}
					if (data.get(i).equals("assertm")){
						System.out.println(data.get(i));
					  keyword.assertm(stores12);
						
					}
					if (data.get(i).equals("autoitSelectImage")){
						System.out.println(data.get(i));
					  keyword.autoitSelectImage();
						
					}
					if (data.get(i).equals("clickMenubtnopen")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.clickMenubtnopen(objectName);
						
					}
					if(data.get(i).equals("logger")){
						System.out.println(data.get(i));
						String testData=(String)data.get(i+1);
						keyword.logger(testData);
						
					}
					 
	
			}
			}
		
		@SuppressWarnings({/* "deprecation", "unchecked",*/ "rawtypes", "unused" })
		@Test(priority=1,enabled=false)
		
		public void myWall() throws IOException, InterruptedException {
			
			keyword = new Keyword();
			ArrayList data = new ArrayList();
			FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
		
			
			XSSFWorkbook workbook  = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("my wall");
			Iterator row = sheet.iterator();
			while (row.hasNext()) {
				
				Row rowIterator = (Row) row.next();
				Iterator cellItr = rowIterator.cellIterator();
				while (cellItr.hasNext()) {
					Cell cell = (Cell) cellItr.next();
					switch (cell.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						data.add(cell.getStringCellValue());
					    break;
					case Cell.CELL_TYPE_BOOLEAN:
						data.add(cell.getBooleanCellValue());
					    break;
					case Cell.CELL_TYPE_NUMERIC:
						data.add(cell.getNumericCellValue());
					    break;
					    
					
					}
				}
				
			}
			System.out.println(data);
			for (int i=3;i<data.size();i++){
				
				if (data.get(i).equals("openbrowser")) {
					System.out.println(data.get(i));
					keyword.openbrowser();
				}
				if (data.get(i).equals("navigate")) {
					//String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					//String objectName = (String) data.get(i+2);
					keyword.navigate(testData);
				}
				if (data.get(i).equals("input")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key);
					System.out.println(testData);
					System.out.println(objectName);
					keyword.input(testData,objectName);
					
				}
				if (data.get(i).equals("click")){
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key); 
					System.out.println(testData);
					System.out.println(objectName);
					keyword.click(objectName);
					
				}
				if (data.get(i).equals("shutdown")) {
					System.out.println(data.get(i));
					keyword.shutdown();
				}
					if (data.get(i).equals("scroll")){
						System.out.println(data.get(i));
					  keyword.scroll();
						
					}
					if (data.get(i).equals("myframe")){
						System.out.println(data.get(i));
					  keyword.myframe();
						
					}
					if (data.get(i).equals("assertc")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.assertc(testData);
						
					}
					if (data.get(i).equals("screenshot")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.screenshot(testData);
						
					}
					if (data.get(i).equals("click1")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.click1(objectName);
						
					}
					if (data.get(i).equals("inputjavaScript")){
						System.out.println(data.get(i));
						
					 keyword.inputjavaScript();
						
					}
					if (data.get(i).equals("assertm")){
						System.out.println(data.get(i));
					  keyword.assertm(stores12);
						
					}
					if (data.get(i).equals("autoitSelectImage")){
						System.out.println(data.get(i));
					  keyword.autoitSelectImage();
						
					}
					if (data.get(i).equals("clickMenubtnopen")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.clickMenubtnopen(objectName);
						
					}
					if (data.get(i).equals("scrolldown")){
						System.out.println(data.get(i));
						String testData = (String) data.get(i+1);
					  keyword.scrolldown(testData);
						
					}
					if (data.get(i).equals("refresh")){
						System.out.println(data.get(i));
					  keyword.refresh();
						
					}
					if (data.get(i).equals("switchToAnotherTab")){
						System.out.println(data.get(i));
					  keyword.switchToAnotherTab();
						
					}
					if (data.get(i).equals("switchToPreviousTab")){
						System.out.println(data.get(i));
					  keyword.switchToPreviousTab();
						
					}
					if (data.get(i).equals("actionElements")){
						System.out.println(data.get(i));
						String testData=(String)data.get(i+1);
					  keyword.actionElements(testData);
						
					}
					
			}

			}
		
@Test(priority=2,enabled=false)
		public void myProfiles() throws IOException, InterruptedException {
			
			keyword = new Keyword();
			ArrayList data = new ArrayList();
			FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
			XSSFWorkbook workbook  = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("My profile");
			Iterator row = sheet.iterator();
			while (row.hasNext()) {
				
				Row rowIterator = (Row) row.next();
				Iterator cellItr = rowIterator.cellIterator();
				
				while (cellItr.hasNext()) {
					Cell cell = (Cell) cellItr.next();
					switch (cell.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						data.add(cell.getStringCellValue());
					    break;
					case Cell.CELL_TYPE_BOOLEAN:
						data.add(cell.getBooleanCellValue());
					    break;
					case Cell.CELL_TYPE_NUMERIC:
						data.add(cell.getNumericCellValue());
					    break;
					
					}
				}
				
			}
			System.out.println(data);
			for (int i=3;i<data.size();i++){
				
				if (data.get(i).equals("openbrowser")) {
					System.out.println(data.get(i));
					keyword.openbrowser();
				}
				if (data.get(i).equals("navigate")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					keyword.navigate(testData);
				}
				if (data.get(i).equals("input")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key);
					System.out.println(testData);
					System.out.println(objectName);
					keyword.input(testData,objectName);
					
				}
				if (data.get(i).equals("click")){
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key); 
					System.out.println(testData);
					System.out.println(objectName);
					keyword.click(objectName);
					
				}
				if (data.get(i).equals("shutdown")) {
					System.out.println(data.get(i));
					keyword.shutdown();
				}
					if (data.get(i).equals("scroll")){
						System.out.println(data.get(i));
					  keyword.scroll();
						
					}
					
					if (data.get(i).equals("assertc")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.assertc(testData);
						
					}
					if (data.get(i).equals("screenshot")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.screenshot(testData);
						
					}
					if (data.get(i).equals("click1")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.click1(objectName);
						
					}
					
					if (data.get(i).equals("assertm")){
						System.out.println(data.get(i));
					  keyword.assertm(stores12);
						
					}
					
					if (data.get(i).equals("clickMenubtnopen")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.clickMenubtnopen(objectName);
						
					}
					if (data.get(i).equals("scrolldown")){
						System.out.println(data.get(i));
						String testData=(String)data.get(i+1);
					    keyword.scrolldown(testData);
						
					}
					
					if (data.get(i).equals("selectDropdown")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.selectDropdown(objectName, testData);
						
					}
					if (data.get(i).equals("generateNumber")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.generateNumber(objectName,testData);
						
					}
					if (data.get(i).equals("numbers")){
						System.out.println(data.get(i));
						String testData=(String)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.numbers(objectName, testData);
						
					}
					if (data.get(i).equals("randomEmails")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
						keyword.randomEmails(objectName);
						
					}
					
			}

			}
@Test(priority=3,enabled=false)

public void homeTaskList() throws IOException, InterruptedException {
	keyword = new Keyword();
	ArrayList data = new ArrayList();
	FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
	XSSFWorkbook workbook  = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Home Tasklist");
	Iterator row = sheet.iterator();
	while (row.hasNext()) {
		
		Row rowIterator = (Row) row.next();
		Iterator cellItr = rowIterator.cellIterator();
		
		while (cellItr.hasNext()) {
			Cell cell = (Cell) cellItr.next();
			switch (cell.getCellType()) {
			
			case Cell.CELL_TYPE_STRING:
				data.add(cell.getStringCellValue());
			    break;
			case Cell.CELL_TYPE_BOOLEAN:
				data.add(cell.getBooleanCellValue());
			    break;
			case Cell.CELL_TYPE_NUMERIC:
				data.add(cell.getNumericCellValue());
			    break;
			
			}
		}
		
	}
	System.out.println(data);
	for (int i=3;i<data.size();i++){
		
		if (data.get(i).equals("openbrowser")) {
			System.out.println(data.get(i));
			keyword.openbrowser();
		}
		if (data.get(i).equals("navigate")) {
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			//String objectName = (String) data.get(i+2);
			keyword.navigate(testData);
		}
		if (data.get(i).equals("input")) {
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			System.out.println(key);
			System.out.println(testData);
			System.out.println(objectName);
			keyword.input(testData,objectName);
			
		}
		if (data.get(i).equals("click")){
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			System.out.println(key); 
			System.out.println(testData);
			System.out.println(objectName);
			keyword.click(objectName);
			
		}
		if (data.get(i).equals("shutdown")) {
			System.out.println(data.get(i));
			keyword.shutdown();
		}
		
			if (data.get(i).equals("scroll")){
				System.out.println(data.get(i));
			  keyword.scroll();
				
			}
			if (data.get(i).equals("myframe")){
				System.out.println(data.get(i));
			  keyword.myframe();
				
			}
			if (data.get(i).equals("assertc")){
				System.out.println(data.get(i));
				
				String testData = (String) data.get(i+1);
			  keyword.assertc(testData);
				
			}
			if (data.get(i).equals("screenshot")){
				System.out.println(data.get(i));
				
				String testData = (String) data.get(i+1);
			  keyword.screenshot(testData);
			}
			if (data.get(i).equals("click1")){
				System.out.println(data.get(i));
				String objectName = (String) data.get(i+2);
			  keyword.click1(objectName);
			}
			if (data.get(i).equals("inputjavaScript")){
				System.out.println(data.get(i));
    			 keyword.inputjavaScript();
				
			}
			if (data.get(i).equals("assertm")){
				System.out.println(data.get(i));
			  keyword.assertm(stores12);
				
			}
			if (data.get(i).equals("autoitSelectImage")){
				System.out.println(data.get(i));
			  keyword.autoitSelectImage();
				
			}
			if (data.get(i).equals("clickMenubtnopen")){
				System.out.println(data.get(i));
				String objectName = (String) data.get(i+2);
			  keyword.clickMenubtnopen(objectName);
				
			}
			if (data.get(i).equals("scrolldown")){
				System.out.println(data.get(i));
				String testData=(String)data.get(i+1);
			    keyword.scrolldown(testData);
				
			}
			if (data.get(i).equals("refresh")){
				System.out.println(data.get(i));
			  keyword.refresh();
				
			}
			if (data.get(i).equals("switchToAnotherTab")){
				System.out.println(data.get(i));
			  keyword.switchToAnotherTab();
				
			}
			if (data.get(i).equals("switchToPreviousTab")){
				System.out.println(data.get(i));
			  keyword.switchToPreviousTab();
				
			}
			if (data.get(i).equals("actionElements")){
				System.out.println(data.get(i));
				String testData=(String)data.get(i+1);
			  keyword.actionElements(testData);
				
			}
			if (data.get(i).equals("selectDropdown")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.selectDropdown(objectName, testData);
				
			}
			if (data.get(i).equals("generateNumber")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.generateNumber(objectName,testData);
				
			}
			if (data.get(i).equals("DatePicker")){
				System.out.println(data.get(i));
				String testData = (String) data.get(i+1);
				keyword.DatePicker(testData);
				
			}
			if (data.get(i).equals("webelement")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName=(String)data.get(i+2);
				keyword.webelement(objectName,testData);
				
			}
			if (data.get(i).equals("assertfalse")){
				System.out.println(data.get(i));
			//	String testData = (String) data.get(i+1);
				keyword.assertfalse();
				
			}
			if (data.get(i).equals("Thread")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				keyword.Thread(testData);
				
			}
			
	}

	}
@Test(priority=4,enabled=false)

public void homeGallery() throws IOException, InterruptedException {
	keyword = new Keyword();
	ArrayList data = new ArrayList();
	FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
	XSSFWorkbook workbook  = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("home gallery");
	Iterator row = sheet.iterator();
	while (row.hasNext()) {
		
		Row rowIterator = (Row) row.next();
		Iterator cellItr = rowIterator.cellIterator();
		
		while (cellItr.hasNext()) {
			Cell cell = (Cell) cellItr.next();
			switch (cell.getCellType()) {
			
			case Cell.CELL_TYPE_STRING:
				data.add(cell.getStringCellValue());
			    break;
			case Cell.CELL_TYPE_BOOLEAN:
				data.add(cell.getBooleanCellValue());
			    break;
			case Cell.CELL_TYPE_NUMERIC:
				data.add(cell.getNumericCellValue());
			    break;
			
			}
		}
		
	}
	System.out.println(data);
	for (int i=3;i<data.size();i++){
		
		if (data.get(i).equals("openbrowser")) {
			System.out.println(data.get(i));
			keyword.openbrowser();
		}
		if (data.get(i).equals("navigate")) {
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			keyword.navigate(testData);
		}
		if (data.get(i).equals("input")) {
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			System.out.println(key);
			System.out.println(testData);
			System.out.println(objectName);
			keyword.input(testData,objectName);
			
		}
		if (data.get(i).equals("click")){
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			System.out.println(key); 
			System.out.println(testData);
			System.out.println(objectName);
			keyword.click(objectName);
			
		}
		if (data.get(i).equals("shutdown")) {
			System.out.println(data.get(i));
			keyword.shutdown();
		}
			if (data.get(i).equals("assertc")){
				System.out.println(data.get(i));
				
				String testData = (String) data.get(i+1);
			  keyword.assertc(testData);
				
			}
			if (data.get(i).equals("screenshot")){
				System.out.println(data.get(i));
				
				String testData = (String) data.get(i+1);
			  keyword.screenshot(testData);
				
			}
			if (data.get(i).equals("click1")){
				System.out.println(data.get(i));
				String objectName = (String) data.get(i+2);
			  keyword.click1(objectName);
				
			}
			
			if (data.get(i).equals("assertm")){
				System.out.println(data.get(i));
			  keyword.assertm(stores12);
				
			}
			
			if (data.get(i).equals("clickMenubtnopen")){
				System.out.println(data.get(i));
				String objectName = (String) data.get(i+2);
			  keyword.clickMenubtnopen(objectName);
				
			}
			if (data.get(i).equals("scrolldown")){
				System.out.println(data.get(i));
				String testData=(String)data.get(i+1);
			    keyword.scrolldown(testData);
				
			}
			
			
			if (data.get(i).equals("selectDropdown")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.selectDropdown(objectName, testData);
				
			}
			if (data.get(i).equals("generateNumber")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.generateNumber(objectName,testData);
				
			}
			
			if (data.get(i).equals("Thread")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				keyword.Thread(testData);
				
			}
			
	}
	}
@Test(priority=5,enabled=false)

public void homeCalendar() throws IOException, InterruptedException {
	keyword = new Keyword();
	ArrayList data = new ArrayList();
	FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
	XSSFWorkbook workbook  = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Home Calendar");
	Iterator row = sheet.iterator();
	while (row.hasNext()) {
		
		Row rowIterator = (Row) row.next();
		Iterator cellItr = rowIterator.cellIterator();
		
		while (cellItr.hasNext()) {
			Cell cell = (Cell) cellItr.next();
			switch (cell.getCellType()) {
			
			case Cell.CELL_TYPE_STRING:
				data.add(cell.getStringCellValue());
			    break;
			case Cell.CELL_TYPE_BOOLEAN:
				data.add(cell.getBooleanCellValue());
			    break;
			case Cell.CELL_TYPE_NUMERIC:
				data.add(cell.getNumericCellValue());
			    break;
			
			}
		}
		
	}
	System.out.println(data);
	for (int i=3;i<data.size();i++){
		
		if (data.get(i).equals("openbrowser")) {
			System.out.println(data.get(i));
			keyword.openbrowser();
		}
		if (data.get(i).equals("navigate")) {
			String testData = (String) data.get(i+1);
			keyword.navigate(testData);
		}
		if (data.get(i).equals("input")) {
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			System.out.println(key);
			System.out.println(testData);
			System.out.println(objectName);
			keyword.input(testData,objectName);
			
		}
		if (data.get(i).equals("click")){
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			System.out.println(key); 
			System.out.println(testData);
			System.out.println(objectName);
			keyword.click(objectName);
			
		}
		if (data.get(i).equals("shutdown")) {
			System.out.println(data.get(i));
			keyword.shutdown();
		}
		
			if (data.get(i).equals("assertc")){
				System.out.println(data.get(i));
				
				String testData = (String) data.get(i+1);
			  keyword.assertc(testData);
				
			}
			if (data.get(i).equals("screenshot")){
				System.out.println(data.get(i));
				
				String testData = (String) data.get(i+1);
			  keyword.screenshot(testData);
				
			}
			if (data.get(i).equals("click1")){
				System.out.println(data.get(i));
				String objectName = (String) data.get(i+2);
			  keyword.click1(objectName);
				
			}
			
			if (data.get(i).equals("assertm")){
				System.out.println(data.get(i));
			  keyword.assertm(stores12);
				
			}
			
			if (data.get(i).equals("clickMenubtnopen")){
				System.out.println(data.get(i));
				String objectName = (String) data.get(i+2);
			  keyword.clickMenubtnopen(objectName);
				
			}
			if (data.get(i).equals("scrolldown")){
				System.out.println(data.get(i));
				String testData=(String)data.get(i+1);
			    keyword.scrolldown(testData);
			}
			if (data.get(i).equals("refresh")){
				System.out.println(data.get(i));
			  keyword.refresh();
				
			}
		
			if (data.get(i).equals("selectDropdown")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.selectDropdown(objectName, testData);
				
			}
			if (data.get(i).equals("generateNumber")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.generateNumber(objectName,testData);
				
			}
			if (data.get(i).equals("DatePicker")){
				System.out.println(data.get(i));
				String testData = (String) data.get(i+1);
				keyword.DatePicker(testData);
				
			}
			if (data.get(i).equals("webelement")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName=(String)data.get(i+2);
				keyword.webelement(objectName,testData);
				
			}
			if (data.get(i).equals("assertfalse")){
				System.out.println(data.get(i));
			//	String testData = (String) data.get(i+1);
				keyword.assertfalse();
				
			}
			if (data.get(i).equals("Thread")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				keyword.Thread(testData);
				
			}
	}
	
	}

@Test(priority=6,enabled=false)

public void fileDownloader() throws IOException, InterruptedException {
	keyword = new Keyword();
	ArrayList data = new ArrayList();
	FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
	XSSFWorkbook workbook  = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("File Downloader");
	Iterator row = sheet.iterator();
	while (row.hasNext()) {
		
		Row rowIterator = (Row) row.next();
		Iterator cellItr = rowIterator.cellIterator();
		
		while (cellItr.hasNext()) {
			Cell cell = (Cell) cellItr.next();
			switch (cell.getCellType()) {
			
			case Cell.CELL_TYPE_STRING:
				data.add(cell.getStringCellValue());
			    break;
			case Cell.CELL_TYPE_BOOLEAN:
				data.add(cell.getBooleanCellValue());
			    break;
			case Cell.CELL_TYPE_NUMERIC:
				data.add(cell.getNumericCellValue());
			    break;
			
			}
		}
		
	}
	System.out.println(data);
	for (int i=3;i<data.size();i++){
		
		if (data.get(i).equals("openbrowser")) {
			System.out.println(data.get(i));
			keyword.openbrowser();
		}
		if (data.get(i).equals("navigate")) {
			
			String testData = (String) data.get(i+1);
			
			keyword.navigate(testData);
		}
		if (data.get(i).equals("input")) {
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			System.out.println(key);
			System.out.println(testData);
			System.out.println(objectName);
			keyword.input(testData,objectName);
			
		}
		if (data.get(i).equals("click")){
			String key = (String) data.get(i);
			String testData = (String) data.get(i+1);
			String objectName = (String) data.get(i+2);
			System.out.println(key); 
			System.out.println(testData);
			System.out.println(objectName);
			keyword.click(objectName);
			
		}
		if (data.get(i).equals("shutdown")) {
			System.out.println(data.get(i));
			keyword.shutdown();
		}
		
			if (data.get(i).equals("scroll")){
				System.out.println(data.get(i));
			  keyword.scroll();
				
			}
			if (data.get(i).equals("myframe")){
				System.out.println(data.get(i));
			  keyword.myframe();
				
			}
			if (data.get(i).equals("assertc")){
				System.out.println(data.get(i));
				
				String testData = (String) data.get(i+1);
			  keyword.assertc(testData);
				
			}
			if (data.get(i).equals("screenshot")){
				System.out.println(data.get(i));
				
				String testData = (String) data.get(i+1);
			  keyword.screenshot(testData);
				
			}
			if (data.get(i).equals("click1")){
				System.out.println(data.get(i));
				String objectName = (String) data.get(i+2);
			  keyword.click1(objectName);
				
			}
			if (data.get(i).equals("inputjavaScript")){
				System.out.println(data.get(i));
				
			 keyword.inputjavaScript();
				
			}
			if (data.get(i).equals("assertm")){
				System.out.println(data.get(i));
			  keyword.assertm(stores12);
				
			}
			if (data.get(i).equals("autoitSelectImage")){
				System.out.println(data.get(i));
			  keyword.autoitSelectImage();
				
			}
			if (data.get(i).equals("clickMenubtnopen")){
				System.out.println(data.get(i));
				String objectName = (String) data.get(i+2);
			  keyword.clickMenubtnopen(objectName);
				
			}
			if (data.get(i).equals("scrolldown")){
				System.out.println(data.get(i));
				String testData=(String)data.get(i+1);
			    keyword.scrolldown(testData);
				
			}
			if (data.get(i).equals("refresh")){
				System.out.println(data.get(i));
			  keyword.refresh();
				
			}
			if (data.get(i).equals("switchToAnotherTab")){
				System.out.println(data.get(i));
			  keyword.switchToAnotherTab();
				
			}
			if (data.get(i).equals("switchToPreviousTab")){
				System.out.println(data.get(i));
			  keyword.switchToPreviousTab();
				
			}
			if (data.get(i).equals("actionElements")){
				System.out.println(data.get(i));
				String testData=(String)data.get(i+1);
			  keyword.actionElements(testData);
				
			}
			if (data.get(i).equals("selectDropdown")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.selectDropdown(objectName, testData);
				
			}
			if (data.get(i).equals("generateNumber")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.generateNumber(objectName,testData);
				
			}
			if (data.get(i).equals("DatePicker")){
				System.out.println(data.get(i));
				String testData = (String) data.get(i+1);
				keyword.DatePicker(testData);
				
			}
			if (data.get(i).equals("webelement")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				String objectName=(String)data.get(i+2);
				keyword.webelement(objectName,testData);
				
			}
			if (data.get(i).equals("assertfalse")){
				System.out.println(data.get(i));
			//	String testData = (String) data.get(i+1);
				keyword.assertfalse();
				
			}
			if (data.get(i).equals("Thread")){
				System.out.println(data.get(i));
				double testData= (double)data.get(i+1);
				keyword.Thread(testData);
			}
	}
}

	@Test(priority=6,enabled=false)

	public void addNote() throws IOException, InterruptedException {
		keyword = new Keyword();
		ArrayList data = new ArrayList();
		FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
		XSSFWorkbook workbook  = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Add note");
		Iterator row = sheet.iterator();
		while (row.hasNext()) {
			
			Row rowIterator = (Row) row.next();
			Iterator cellItr = rowIterator.cellIterator();
			
			while (cellItr.hasNext()) {
				Cell cell = (Cell) cellItr.next();
				switch (cell.getCellType()) {
				
				case Cell.CELL_TYPE_STRING:
					data.add(cell.getStringCellValue());
				    break;
				case Cell.CELL_TYPE_BOOLEAN:
					data.add(cell.getBooleanCellValue());
				    break;
				case Cell.CELL_TYPE_NUMERIC:
					data.add(cell.getNumericCellValue());
   		    break;
				
				}
			}
			
		}
		System.out.println(data);
		for (int i=3;i<data.size();i++){
			
			if (data.get(i).equals("openbrowser")) {
				System.out.println(data.get(i));
				keyword.openbrowser();
			}
			if (data.get(i).equals("navigate")) {
				
				String testData = (String) data.get(i+1);
				
				keyword.navigate(testData);
			}
			if (data.get(i).equals("input")) {
				String key = (String) data.get(i);
				String testData = (String) data.get(i+1);
				String objectName = (String) data.get(i+2);
				System.out.println(key);
				System.out.println(testData);
				System.out.println(objectName);
				keyword.input(testData,objectName);
				
			}
			if (data.get(i).equals("click")){
				String key = (String) data.get(i);
				String testData = (String) data.get(i+1);
				String objectName = (String) data.get(i+2);
				System.out.println(key); 
				System.out.println(testData);
				System.out.println(objectName);
				keyword.click(objectName);
				
			}
			if (data.get(i).equals("shutdown")) {
				System.out.println(data.get(i));
				keyword.shutdown();
			}
			
				if (data.get(i).equals("scroll")){
					System.out.println(data.get(i));
				  keyword.scroll();
					
				}
				
				if (data.get(i).equals("assertc")){
					System.out.println(data.get(i));
					
					String testData = (String) data.get(i+1);
				  keyword.assertc(testData);
					
				}
				if (data.get(i).equals("screenshot")){
					System.out.println(data.get(i));
					
					String testData = (String) data.get(i+1);
				  keyword.screenshot(testData);
					
				}
				if (data.get(i).equals("click1")){
					System.out.println(data.get(i));
					String objectName = (String) data.get(i+2);
				  keyword.click1(objectName);
					
				}
				if (data.get(i).equals("inputjavaScript")){
					System.out.println(data.get(i));
					
				 keyword.inputjavaScript();
					
				}
				if (data.get(i).equals("assertm")){
					System.out.println(data.get(i));
				  keyword.assertm(stores12);
					
				}
				
				if (data.get(i).equals("clickMenubtnopen")){
					System.out.println(data.get(i));
					String objectName = (String) data.get(i+2);
				  keyword.clickMenubtnopen(objectName);
					
				}
				if (data.get(i).equals("scrolldown")){
					System.out.println(data.get(i));
					String testData=(String)data.get(i+1);
				    keyword.scrolldown(testData);
					
				}
				if (data.get(i).equals("selectDropdown")){
					System.out.println(data.get(i));
					double testData= (double)data.get(i+1);
					String objectName = (String) data.get(i+2);
					keyword.selectDropdown(objectName, testData);
					
				}
				if (data.get(i).equals("generateNumber")){
					System.out.println(data.get(i));
					double testData= (double)data.get(i+1);
					String objectName = (String) data.get(i+2);
					keyword.generateNumber(objectName,testData);
					
				}
				if (data.get(i).equals("DatePicker")){
					System.out.println(data.get(i));
					String testData = (String) data.get(i+1);
					keyword.DatePicker(testData);
				}
				if (data.get(i).equals("webelement")){
					System.out.println(data.get(i));
					double testData= (double)data.get(i+1);
					String objectName=(String)data.get(i+2);
					keyword.webelement(objectName,testData);
					
				}
				if (data.get(i).equals("Thread")){
					System.out.println(data.get(i));
					double testData= (double)data.get(i+1);
					keyword.Thread(testData);
				}
				if (data.get(i).equals("actionElementstestData")){
					System.out.println(data.get(i));
					String testData= (String)data.get(i+1);
					String objectName=(String)data.get(i+2);
					keyword.actionElementstestData(testData, objectName);
				}
		}
	}
		
		@Test(priority=7,enabled=false)

		public void selfCareUploader() throws IOException, InterruptedException {
			keyword = new Keyword();
			ArrayList data = new ArrayList();
			FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
			XSSFWorkbook workbook  = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Uploader(self care)");
			Iterator row = sheet.iterator();
			while (row.hasNext()) {
				
				Row rowIterator = (Row) row.next();
				Iterator cellItr = rowIterator.cellIterator();
				
				while (cellItr.hasNext()) {
					Cell cell = (Cell) cellItr.next();
					switch (cell.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						data.add(cell.getStringCellValue());
					    break;
					case Cell.CELL_TYPE_BOOLEAN:
						data.add(cell.getBooleanCellValue());
					    break;
					case Cell.CELL_TYPE_NUMERIC:
						data.add(cell.getNumericCellValue());
					    break;
					
					}
				}
				
			}
			System.out.println(data);
			for (int i=3;i<data.size();i++){
				
				if (data.get(i).equals("openbrowser")) {
					System.out.println(data.get(i));
					keyword.openbrowser();
				}
				if (data.get(i).equals("navigate")) {
					
					String testData = (String) data.get(i+1);
					
					keyword.navigate(testData);
				}
				if (data.get(i).equals("input")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key);
					System.out.println(testData);
					System.out.println(objectName);
					keyword.input(testData,objectName);
					
				}
				if (data.get(i).equals("click")){
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key); 
					System.out.println(testData);
					System.out.println(objectName);
					keyword.click(objectName);
					
				}
				if (data.get(i).equals("shutdown")) {
					System.out.println(data.get(i));
					keyword.shutdown();
				}
				
					if (data.get(i).equals("scroll")){
						System.out.println(data.get(i));
					  keyword.scroll();
						
					}
					if (data.get(i).equals("assertc")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.assertc(testData);
						
					}
					if (data.get(i).equals("screenshot")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.screenshot(testData);
						
					}
					if (data.get(i).equals("click1")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.click1(objectName);
						
					}
					
					if (data.get(i).equals("assertm")){
						System.out.println(data.get(i));
					  keyword.assertm(stores12);
						
					}
					
					if (data.get(i).equals("clickMenubtnopen")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.clickMenubtnopen(objectName);
						
					}
					if (data.get(i).equals("scrolldown")){
						System.out.println(data.get(i));
						String testData=(String)data.get(i+1);
					    keyword.scrolldown(testData);
						
					}
					if (data.get(i).equals("selectDropdown")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.selectDropdown(objectName, testData);
						
					}
					if (data.get(i).equals("generateNumber")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.generateNumber(objectName,testData);
						
					}
					if (data.get(i).equals("DatePicker")){
						System.out.println(data.get(i));
						String testData = (String) data.get(i+1);
						keyword.DatePicker(testData);
					}
					if (data.get(i).equals("webelement")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName=(String)data.get(i+2);
						keyword.webelement(objectName,testData);
						
					}
					if (data.get(i).equals("Thread")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						keyword.Thread(testData);
					}
					if (data.get(i).equals("actionElementstestData")){
						System.out.println(data.get(i));
						String testData= (String)data.get(i+1);
						String objectName=(String)data.get(i+2);
						keyword.actionElementstestData(testData, objectName);
					}
					if (data.get(i).equals("switchToAnotherTab")){
						System.out.println(data.get(i));
					  keyword.switchToAnotherTab();
						
					}
					if (data.get(i).equals("switchToSecondtab")){
						System.out.println(data.get(i));
					  keyword.switchToSecondtab();
						
					}

	}

		}

		
		@Test(priority=8,enabled=false)

		public void TeamsContact_Story_Message() throws IOException, InterruptedException {
			keyword = new Keyword();
			ArrayList<Comparable> data = new ArrayList();
			FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
			XSSFWorkbook workbook  = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Team(contacts,myStory,postMsg)");
			Iterator row = sheet.iterator();
			while (row.hasNext()) {
				
				Row rowIterator = (Row) row.next();
				Iterator cellItr = rowIterator.cellIterator();
				
				while (cellItr.hasNext()) {
					Cell cell = (Cell) cellItr.next();
					switch (cell.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						data.add(cell.getStringCellValue());
					    break;
					case Cell.CELL_TYPE_BOOLEAN:
						data.add(cell.getBooleanCellValue());
					    break;
					case Cell.CELL_TYPE_NUMERIC:
						data.add(cell.getNumericCellValue());
					    break;
					
					}
				}
				
			}
			System.out.println(data);
			for (int i=3;i<data.size();i++){
				
				if (data.get(i).equals("openbrowser")) {
					System.out.println(data.get(i));
					keyword.openbrowser();
				}
				if (data.get(i).equals("navigate")) {
					
					String testData = (String) data.get(i+1);
					
					keyword.navigate(testData);
				}
				if (data.get(i).equals("input")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key);
					System.out.println(testData);
					System.out.println(objectName);
					keyword.input(testData,objectName);
					
				}
				if (data.get(i).equals("click")){
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key); 
					System.out.println(testData);
					System.out.println(objectName);
					keyword.click(objectName);
					
				}
				if (data.get(i).equals("shutdown")) {
					System.out.println(data.get(i));
					keyword.shutdown();
				}
				
					if (data.get(i).equals("scroll")){
						System.out.println(data.get(i));
					  keyword.scroll();
						
					}
					if (data.get(i).equals("assertc")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.assertc(testData);
						
					}
					if (data.get(i).equals("screenshot")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.screenshot(testData);
						
					}
					if (data.get(i).equals("click1")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.click1(objectName);
						
					}
					
					if (data.get(i).equals("assertm")){
						System.out.println(data.get(i));
					  keyword.assertm(stores12);
						
					}
					
					if (data.get(i).equals("clickMenubtnopen")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.clickMenubtnopen(objectName);
						
					}
					if (data.get(i).equals("scrolldown")){
						System.out.println(data.get(i));
						String testData=(String)data.get(i+1);
					    keyword.scrolldown(testData);
						
					}
					if (data.get(i).equals("selectDropdown")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.selectDropdown(objectName, testData);
						
					}
					if (data.get(i).equals("generateNumber")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.generateNumber(objectName,testData);
						
					}
					if (data.get(i).equals("DatePicker")){
						System.out.println(data.get(i));
						String testData = (String) data.get(i+1);
						keyword.DatePicker(testData);
					}
					if (data.get(i).equals("webelement")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName=(String)data.get(i+2);
						keyword.webelement(objectName,testData);
						
					}
					if (data.get(i).equals("Thread")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						keyword.Thread(testData);
					}
					if (data.get(i).equals("actionElementstestData")){
						System.out.println(data.get(i));
						String testData= (String)data.get(i+1);
						String objectName=(String)data.get(i+2);
						keyword.actionElementstestData(testData, objectName);
					}
					if (data.get(i).equals("switchToAnotherTab")){
						System.out.println(data.get(i));
					  keyword.switchToAnotherTab();
						
					}
					if (data.get(i).equals("switchToSecondtab")){
						System.out.println(data.get(i));
					  keyword.switchToSecondtab();
						
					}
					if (data.get(i).equals("randomEmails")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
						keyword.randomEmails(objectName);
						
					} 
					if (data.get(i).equals("assertfalse")){
						System.out.println(data.get(i));
						keyword.assertfalse();						
					} 
					
					if (data.get(i).equals("inputjavaScript")){
						System.out.println(data.get(i));
					 keyword.inputjavaScript();
						
					}
	}
		}

		@Test(priority=9,enabled=false)

		public void TeamTaskListAndUploadVideo() throws IOException, InterruptedException {
			keyword = new Keyword();
			ArrayList<Comparable> data = new ArrayList();
			FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
			XSSFWorkbook workbook  = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Team TaskList");
			Iterator row = sheet.iterator();
			while (row.hasNext()) {
				
				Row rowIterator = (Row) row.next();
				Iterator cellItr = rowIterator.cellIterator();
				
				while (cellItr.hasNext()) {
					Cell cell = (Cell) cellItr.next();
					switch (cell.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						data.add(cell.getStringCellValue());
					    break;
					case Cell.CELL_TYPE_BOOLEAN:
						data.add(cell.getBooleanCellValue());
					    break;
					case Cell.CELL_TYPE_NUMERIC:
						data.add(cell.getNumericCellValue());
					    break;
					
					}
				}
				
			}
			System.out.println(data);
			for (int i=3;i<data.size();i++){
				
				if (data.get(i).equals("openbrowser")) {
					System.out.println(data.get(i));
					keyword.openbrowser();
				}
				if (data.get(i).equals("navigate")) {
					
					String testData = (String) data.get(i+1);
					
					keyword.navigate(testData);
				}
				if (data.get(i).equals("input")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key);
					System.out.println(testData);
					System.out.println(objectName);
					keyword.input(testData,objectName);
					
				}
				if (data.get(i).equals("click")){
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key); 
					System.out.println(testData);
					System.out.println(objectName);
					keyword.click(objectName);
					
				}
				if (data.get(i).equals("shutdown")) {
					System.out.println(data.get(i));
					keyword.shutdown();
				}
				
					if (data.get(i).equals("scroll")){
						System.out.println(data.get(i));
					  keyword.scroll();
						
					}
					if (data.get(i).equals("assertc")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.assertc(testData);
						
					}
					if (data.get(i).equals("screenshot")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.screenshot(testData);
						
					}
					if (data.get(i).equals("click1")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.click1(objectName);
						
					}
					
					if (data.get(i).equals("assertm")){
						System.out.println(data.get(i));
					  keyword.assertm(stores12);
						
					}
					
					if (data.get(i).equals("clickMenubtnopen")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.clickMenubtnopen(objectName);
						
					}
					if (data.get(i).equals("scrolldown")){
						System.out.println(data.get(i));
						String testData=(String)data.get(i+1);
					    keyword.scrolldown(testData);
						
					}
					if (data.get(i).equals("selectDropdown")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.selectDropdown(objectName, testData);
						
					}
					if (data.get(i).equals("generateNumber")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName = (String) data.get(i+2);
						keyword.generateNumber(objectName,testData);
						
					}
					if (data.get(i).equals("DatePicker")){
						System.out.println(data.get(i));
						String testData = (String) data.get(i+1);
						keyword.DatePicker(testData);
					}
					if (data.get(i).equals("webelement")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						String objectName=(String)data.get(i+2);
						keyword.webelement(objectName,testData);
						
					}
					if (data.get(i).equals("Thread")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						keyword.Thread(testData);
					}
					if (data.get(i).equals("actionElementstestData")){
						System.out.println(data.get(i));
						String testData= (String)data.get(i+1);
						String objectName=(String)data.get(i+2);
						keyword.actionElementstestData(testData, objectName);
					}
					if (data.get(i).equals("switchToAnotherTab")){
						System.out.println(data.get(i));
					  keyword.switchToAnotherTab();
						
					}
					if (data.get(i).equals("switchToSecondtab")){
						System.out.println(data.get(i));
					  keyword.switchToSecondtab();
						
					}
					if (data.get(i).equals("randomEmails")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
						keyword.randomEmails(objectName);
						
					} 
					if (data.get(i).equals("assertfalse")){
						System.out.println(data.get(i));
						keyword.assertfalse();						
					} 
					
					if (data.get(i).equals("inputjavaScript")){
						System.out.println(data.get(i));
					 keyword.inputjavaScript();
						
					}
					
	}
			
		}

		@Test(priority=10,enabled=false)

		public void TeamPostStrength() throws IOException, InterruptedException {
			keyword = new Keyword();
			ArrayList<Comparable> data = new ArrayList();
			FileInputStream file = new FileInputStream("E://Prajakta//leadsuite1.xlsx");
			XSSFWorkbook workbook  = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Teams");
			Iterator row = sheet.iterator();
			while (row.hasNext()) {
				
				Row rowIterator = (Row) row.next();
				Iterator cellItr = rowIterator.cellIterator();
				
				while (cellItr.hasNext()) {
					Cell cell = (Cell) cellItr.next();
					switch (cell.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						data.add(cell.getStringCellValue());
					    break;
					case Cell.CELL_TYPE_BOOLEAN:
						data.add(cell.getBooleanCellValue());
					    break;
					case Cell.CELL_TYPE_NUMERIC:
						data.add(cell.getNumericCellValue());
					    break;
					
					}
				}
				
			}
			System.out.println(data);
			for (int i=3;i<data.size();i++){
				
				if (data.get(i).equals("openbrowser")) {
					System.out.println(data.get(i));
					keyword.openbrowser();
				}
				if (data.get(i).equals("navigate")) {
					String testData = (String) data.get(i+1);
					keyword.navigate(testData);
				}
				if (data.get(i).equals("input")) {
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key);
					System.out.println(testData);
					System.out.println(objectName);
					keyword.input(testData,objectName);
					
				}
				if (data.get(i).equals("click")){
					String key = (String) data.get(i);
					String testData = (String) data.get(i+1);
					String objectName = (String) data.get(i+2);
					System.out.println(key); 
					System.out.println(testData);
					System.out.println(objectName);
					keyword.click(objectName);
					
				}
				if (data.get(i).equals("shutdown")) {
					System.out.println(data.get(i));
					keyword.shutdown();
				}
					if (data.get(i).equals("scroll")){
						System.out.println(data.get(i));
					  keyword.scroll();
						
					}
					if (data.get(i).equals("assertc")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.assertc(testData);
						
					}
					if (data.get(i).equals("screenshot")){
						System.out.println(data.get(i));
						
						String testData = (String) data.get(i+1);
					  keyword.screenshot(testData);
						
					}
					if (data.get(i).equals("click1")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.click1(objectName);
						
					}
					if (data.get(i).equals("assertm")){
						System.out.println(data.get(i));
					  keyword.assertm(stores12);
						
					}
					if (data.get(i).equals("clickMenubtnopen")){
						System.out.println(data.get(i));
						String objectName = (String) data.get(i+2);
					  keyword.clickMenubtnopen(objectName);
					}
					if (data.get(i).equals("scrolldown")){
						System.out.println(data.get(i));
						String testData=(String)data.get(i+1);
					    keyword.scrolldown(testData);
					}
					if (data.get(i).equals("Thread")){
						System.out.println(data.get(i));
						double testData= (double)data.get(i+1);
						keyword.Thread(testData);
					}
					if (data.get(i).equals("actionElementstestData")){
						System.out.println(data.get(i));
						String testData= (String)data.get(i+1);
						String objectName=(String)data.get(i+2);
						keyword.actionElementstestData(testData, objectName);
					}
			}
		}
}	