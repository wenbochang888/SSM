package com.po;

public class Student {

	String sno;
	String sname;
	String phone;

	public Student() {
	}

	public Student(String sno, String sname, String p) {
		this.sname = sname;
		this.sno = sno;
		this.phone = p;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", phone=" + phone + "]";
	}
}
