package builderdesignpattern;

public class Main {
	public static void main(String[] args) {
		StudentBuilder stuB = new StudentBuilder(82, "Harsh SHarma", "CSE");
//		stuB.setBranch("CSE");
//		stuB.setName("Harsh SHarma");
		Student student = stuB.getStudent();
		System.out.println(student);
	}
}
