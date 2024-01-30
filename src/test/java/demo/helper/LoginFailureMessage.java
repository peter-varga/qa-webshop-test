package demo.helper;

public enum LoginFailureMessage {
	MISSINGPASSWORD("Epic sadface: Password is required"),
	MISSINGUSERNAME("Epic sadface: Username is required"),
	LOCKEDOUTUSER("Epic sadface: Sorry, this user has been locked out."),
	INCORRECTUSERNAME("Epic sadface: Username and password do not match any user in this service"),
	INCORRECTPASSWORD("Epic sadface: Username and password do not match any user in this service");

	private String message;

	LoginFailureMessage(String messageType) {
		this.message = messageType;
	}

	public String getMessage() {
		return message;
	}
}
