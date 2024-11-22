package stockScanner.main;

public class LoginInfo {
	
	private String username;
	private String password;
	
	LoginInfo(String userName, String password){
		this.username = userName;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
}
