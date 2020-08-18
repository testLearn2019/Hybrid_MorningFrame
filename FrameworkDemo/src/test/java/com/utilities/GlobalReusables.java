package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// This class reads external files
public class GlobalReusables {
	
	String keyValue;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow sheet_row;
	XSSFCell cell;
	String cellValue;
	public String readProperties(String key) {
		
		File input = new File("./ObjectRepository/objectRepo.properties");
		try {
			FileInputStream stream = new FileInputStream(input);
			Properties prop = new Properties();
			prop.load(stream);
			keyValue=prop.getProperty(key);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return keyValue;	
	}
	
	public String readExcel(String sheetName,int row, int col) {
		try {
			FileInputStream file = new FileInputStream("./TestData/TestDataSample.xlsx");
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheet(sheetName);
			//sheet = workbook.getSheetAt(0);
			cell = sheet.getRow(row).getCell(col);
			cellValue=cell.getStringCellValue();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return cellValue;
	}
	
	public void writeData(String result, int row, int col) {
		
		cell = sheet.getRow(row).getCell(col);
		cell.setCellValue(result);
		try {
			FileOutputStream fileout = new FileOutputStream(new File("./TestData/TestDataSample.xlsx"));
			workbook.write(fileout);
			fileout.flush();
			fileout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	 XSSFSheet ExcelWSheet;
	 XSSFWorkbook ExcelWBook;
	 XSSFCell Cell;
     XSSFRow Row;
	
	public String readData(String sheetName, int row, int col) throws Exception {
		
		 FileInputStream ExcelFile = new FileInputStream("./TestData/TestDataSample.xlsx");
		 ExcelWBook = new XSSFWorkbook(ExcelFile);
		 ExcelWSheet = ExcelWBook.getSheet(sheetName);
		 Cell = ExcelWSheet.getRow(row).getCell(col);
         String CellData = Cell.getStringCellValue();
         return CellData;
	}
	
	public void writeData (String result, int row, int col) throws Exception {

        Row = ExcelWSheet.getRow(row);
        Cell = Row.getCell(col);
        Cell.setCellValue(result);
        FileOutputStream fileOut = new FileOutputStream(new File("./TestData/TestDataSample.xlsx"));
        ExcelWBook.write(fileOut);
        fileOut.close();

	}*/
	
}
