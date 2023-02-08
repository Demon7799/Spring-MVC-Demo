package mvc.model;

public class FormData {

	// These fields name must be same as input box names in jsp form
	private String userName;
	private String userMail;
	private String userPhone;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	@Override
	public String toString() {
		return "FormData [userName=" + userName + ", userMail=" + userMail + ", userPhone=" + userPhone + "]";
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
}
