package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ReadingExcel {
	public Object[][] readExcelData(String testDataFilePath,String sheetName) throws EncryptedDocumentException, IOException {

	
		File filepath=new File(testDataFilePath);
		FileInputStream fis=new FileInputStream(filepath);
		//WorkbookFatory is a replacement of XSSFWorkbook/or HSSFWorkbook
		Workbook workbook =WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		//row count
		int rowCount=sheet.getLastRowNum();
//		System.out.println("Row Count"+rowCount);
		//column count
		int colCount=sheet.getRow(0).getLastCellNum();
//		System.out.println("Column count"+colCount);
//		System.out.println("*******************************************");
		//Create a 2D array of the objects based on the size of the excel sheet
		Object[][]data=new Object[rowCount][colCount];
		
		//Iterate through each row in the sheet
		for(int row=0;row<rowCount;row++) {
			//iterate through cell column
			for(int col=0;col<colCount;col++) {
				//get the cell in the row
				Cell cell= sheet.getRow(row+1).getCell(col);
				
				//Determine the cell type the type of data to retrive the approprate cell data 
				//and store it in the 2D array
				
				switch(cell.getCellType() ) {
				case STRING:
					data[row][col]=cell.getStringCellValue();
					break;
				case NUMERIC: 
					data[row][col]=NumberToTextConverter.toText(cell.getNumericCellValue());
									break;
				case BLANK:
					data[row][col]="Blank Cell!";
					break;
				default:
					data[row][col]=cell.getStringCellValue();
				}
//				System.out.println(data[row][col]);
			}
			
		}
		
		
		return data;
		
	}
}

