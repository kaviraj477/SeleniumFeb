package week6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	
	public static void main (String [] args) throws IOException {
		
		//Creating excel file:
		File F1    = new File ("E:\\JAVA\\ExcelFile.xlsx");
		boolean B1 = F1.createNewFile();
		System.out.println("Whether the file is created? " + B1);
		
		//2.Establishing connection to write:
		FileOutputStream FOut = new FileOutputStream(F1);
		
		//Workbook creation:
		XSSFWorkbook WB = new XSSFWorkbook();
		
		//Sheet creation:
		XSSFSheet SH = WB.createSheet("DemoFile");
		
		//Row creation:
	    XSSFRow Row1 = SH.createRow(0); //value inside parentheses indicates row value
	    XSSFRow Row2 = SH.createRow(1);
	    
	    //Cell Creation:
	    XSSFCell Cell1 = Row1.createCell(0);  //value inside parentheses indicates column value
	    XSSFCell Cell2 = Row2.createCell(1);
	    
	    //Providing values:
	    Cell1.setCellValue("Java-Selenium");
	    Cell2.setCellValue("February Batch");
	    
	    //To write the file:
	    WB.write(FOut);
	    WB.close();
	    FOut.close();
	    
	    //To read the file :
	    FileInputStream Finp = new FileInputStream(F1);
	    XSSFRow Rowinput         = SH.getRow(1);
	    XSSFCell Cellinput       = Rowinput.getCell(1);
	    
	    //Printing:
	    String CellValue    = Cellinput.getStringCellValue();
	    System.out.println("the asked value is "+ CellValue);
	    
	    		
		
	}

}
