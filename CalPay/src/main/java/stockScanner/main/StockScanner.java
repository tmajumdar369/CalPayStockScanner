package stockScanner.main;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class StockScanner {
	
	private Stock stock;
	private LoginInfo login;
	private String ADMIN = "admin";
	private String PASSWORD = "abc123";
	private String LOGIN_SUCCESS = "Login Successful";
	private String LOGIN_FAILED = "Login Failed";
	private String LOCATION = "D:/Projects/CalPay/src/main/resources/StockDeets/";
	
	public StockScanner(LoginInfo login) {
		if(StringUtils.equals(confirmLogin(login), LOGIN_SUCCESS)){
			String __location = LOCATION + login.getUsername() + ".xlsx";
			StockScannerUtils.getStockDetails(__location, login.getUsername());
			StockScannerUtils.putToDB(StockMap.getInstance().getMap());
		}
	}

	private String confirmLogin(LoginInfo login) {
		if(StringUtils.equals(login.getUsername(), ADMIN) && StringUtils.equals(login.getPassword(), PASSWORD)) {
		    return LOGIN_SUCCESS;
		}
		return LOGIN_FAILED;
	}
}
