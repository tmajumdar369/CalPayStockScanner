package stockScanner.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMap {

	private static StockMap instance;
	private Map<String, List<Stock>> stockMap;
	
	private StockMap() {
		stockMap = new HashMap<>();
	}
	
	public static synchronized StockMap getInstance() {
        if (instance == null) {
            instance = new StockMap();
        }
        return instance;
    }

    public Map<String, List<Stock>> getMap() {
        return stockMap;
    }

	public void put(String userName, List<Stock> stockList) {
		stockMap.put(userName, stockList);
		
	}
}
