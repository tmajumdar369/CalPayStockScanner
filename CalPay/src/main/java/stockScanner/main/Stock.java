package stockScanner.main;

public record Stock(int id, String symbol, String ISIN, String Name, double quantity, double amount, double target) {}
