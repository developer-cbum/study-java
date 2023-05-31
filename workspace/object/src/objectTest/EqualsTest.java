package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Student student = new Student(1, "이종문");
		boolean isSame = student.equals(new Student(2, "이종문"));
		System.out.println(isSame);
	}
}
