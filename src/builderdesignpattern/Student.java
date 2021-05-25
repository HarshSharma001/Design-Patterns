package builderdesignpattern;

public class Student {
	private int rollNo;
	private String name, branch;
	private long phoneNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", phoneNo=" + phoneNo + "]";
	}
	
}
