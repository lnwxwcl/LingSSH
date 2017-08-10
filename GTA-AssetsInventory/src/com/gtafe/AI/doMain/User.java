package com.gtafe.AI.doMain;

public class User {
private long Userid;
private String Username;
private String Password;
private Integer isAdmin;
private String Userdesc;
public String getUserdesc() {
	return Userdesc;
}
public void setUserdesc(String userdesc) {
	Userdesc = userdesc;
}
public Integer getIsAdmin() {
	return isAdmin;
}
public void setIsAdmin(Integer isAdmin) {
	this.isAdmin = isAdmin;
}
public long getUserid() {
	return Userid;
}
public void setUserid(long userid) {
	Userid = userid;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}

}
