package stockScanner.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import excelReader.ReadExcelSheet;

public class StockScannerUtils {

	//Read data from File Location and put it in a Hashmap 
	public static void getStockDetails(String __location, String userName) {
		StockMap stockMap = StockMap.getInstance();
		stockMap.put(userName, getStockList(__location));
	}

	private static List<Stock> getStockList(String __location) {
		List<Stock> list = ReadExcelSheet.readFromExcel(__location);
		list.stream().forEach(System.out::println);
		return list;
	}

	public static void putToDB(Map<String, List<Stock>> stockList) {
		
	}

}
