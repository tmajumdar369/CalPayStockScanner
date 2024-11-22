package excelReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import stockScanner.main.Stock;

public class ReadExcelSheet {

	public static List<Stock> readFromExcel(String __path) {
		List<Stock> list = new LinkedList<>();
		try (FileInputStream fis = new FileInputStream(new File(__path))) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0); // Get the first sheet
            
            int count = 1;
			for (Row row : sheet) {
				int counter = 0;
				Stock stock = new Stock(count++, row.getCell(counter++).getStringCellValue(),
						row.getCell(counter++).getStringCellValue(), row.getCell(counter++).getStringCellValue(),
						row.getCell(counter++).getNumericCellValue(), row.getCell(counter++).getNumericCellValue(),
						row.getCell(counter++).getNumericCellValue()); 
				list.add(stock);
			}
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return list;
	}

}