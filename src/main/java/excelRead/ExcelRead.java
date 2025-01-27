package excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException  {
FileInputStream nputStream;
//XSSFWorkbook workBook = null;
//XSSFSheet Excelsheet = null ;
//XSSFRow row;
//XSSFCell cell;
// To open file create object of file class
File Efile= new File("C:\\Users\\Moreshwar\\Desktop\\MyStoreTestcases.xlsx");
// create obj of FileInputStream to read data from file
nputStream= new FileInputStream(Efile);
//To create object of XSSFWorkbook to handle xlsx file
XSSFWorkbook ExcelBook = new XSSFWorkbook(nputStream);
//To create 
XSSFSheet ExcelWBook = ExcelBook.getSheet("TestData");
int totalRow = ExcelWBook.getLastRowNum();

int totalCells = ExcelWBook.getRow(0).getLastCellNum();
for(int currentRow=0;currentRow<totalRow;currentRow++) {
	for(int currntCell=0;currntCell<totalCells;currntCell++) {
		System.out.println(ExcelWBook.getRow(currentRow).getCell(currntCell).toString());
	System.out.println("\t");	
	}
	System.out.println();
}

}}