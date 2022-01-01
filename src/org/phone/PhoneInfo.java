package org.phone;

public class PhoneInfo {
public void phoneName() {
System.out.println("phone name realme");
}
public void phoneEmiNumber() {
System.out.println("Phone emi number 311129520036");
}
public void camera() {
System.out.println("phone camer 64 mega pixeal");
}
public void storage() {
System.out.println("storage 128 GB");
}
public void osName() {
System.out.println("os name colouros v11");
}
public static void main(String[] args) {
	PhoneInfo my = new PhoneInfo ();
	
	my.phoneName();
	my.phoneEmiNumber();
	my.camera();
	my.storage();
	my.osName();
	
}
}
