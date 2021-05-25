package builderdesignpattern;

public class StudentBuilder {
	private Student student;

	public StudentBuilder() {
		student = new Student();
	}

	public StudentBuilder(int rollNo) {
		student = new Student();
		student.setRollNo(rollNo);
	}

	public StudentBuilder(int rollNo, String name) {
		student = new Student();
		student.setRollNo(rollNo);
		student.setName(name);
	}

	public StudentBuilder(int rollNo, String name, String branch) {
		student = new Student();
		student.setRollNo(rollNo);
		student.setName(name);
		student.setBranch(branch);
	}

	public StudentBuilder(int rollNo, String name, String branch, long phoneNo) {
		student = new Student();
		student.setRollNo(rollNo);
		student.setName(name);
		student.setBranch(branch);
		student.setPhoneNo(phoneNo);
	}

	public void setRollNo(int rollNo) {
		student.setRollNo(rollNo);
	}

	public void setName(String name) {
		student.setName(name);
	}

	public void setPhoneNo(long phoneNo) {
		student.setPhoneNo(phoneNo);
	}

	public void setBranch(String branch) {
		student.setBranch(branch);
	}

	public Student getStudent() {
		return student;
	}
}
