import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Sample {

	public static void main(String[] args) throws IOException {
		String excelfilePath = System.getProperty("user.dir")+ "\\files\\employees.xlsx";
		File excelfile = new File(excelfilePath);
		FileInputStream fis = new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
	    for(int i=0; i <= 4; i++) {
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(i).getCell(i));
	    }
		/*Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		*/
		}
}
		/*
		XSSFSheet sheet =workbook.getSheet("one");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			
			for(int c = 0; r < cols; c++) {
				
				XSSFCell cell = row.getCell(c);
				CellType celltype =cell.getCellType();
				
				switch(celltype) {
				case STRING :
							System.out.print(cell.getStringCellValue());
							break;
				case NUMERIC:
							System.out.println(cell.getNumericCellValue());
							break;
				case BOOLEAN:
							System.out.println(cell.getBooleanCellValue());
							break;
				}
				
			}
			
		}
		
		*/


