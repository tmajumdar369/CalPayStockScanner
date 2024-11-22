package stockScanner.main;

public class FirstClass {

	public static void run() {
		LoginInfo login = new LoginInfo("admin", "abc123");
		
		StockScanner stock = new StockScanner(login);
	}

}
