package calPayPackage;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class CalPayRunner {
	
	private CalPay calPay;
	private int amt;
	private int date;
	
	public CalPay CalPayRuner(CalPay calPay) {
		return this.calPay = calPay;	
	}
	
	public void run() {
		
		System.out.print("CalPay Is Running");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amt");
		amt = sc.nextInt();
		System.out.print("Enter date");
		date = sc.nextInt();
		calPay.insert(amt, date);
	}
}
