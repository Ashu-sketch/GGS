package com.springDemoProgram;

import org.springframework.stereotype.Component;

@Component
public class Student {
private String sName;
private String sRoll;
private String sEmail;
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsRoll() {
	return sRoll;
}
public void setsRoll(String sRoll) {
	this.sRoll = sRoll;
}
public String getsEmail() {
	return sEmail;
}
public void setsEmail(String sEmail) {
	this.sEmail = sEmail;
}
@Override
public String toString() {
	return "Student [sName=" + sName + ", sRoll=" + sRoll + ", sEmail=" + sEmail + "]";
}

}
