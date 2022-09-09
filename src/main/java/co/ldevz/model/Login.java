package co.ldevz.model;

public class Login {
private	String isLogin;
private	String isLogout;
public String getIsLogin() {
	return isLogin;
}
public void setIsLogin(String isLogin) {
	this.isLogin = isLogin;
}
public String getIsLogout() {
	return isLogout;
}
public void setIsLogout(String isLogout) {
	this.isLogout = isLogout;
}
public Login() {
	
}
public Login(String isLogin, String isLogout) {
	super();
	this.isLogin = isLogin;
	this.isLogout = isLogout;
}


}
