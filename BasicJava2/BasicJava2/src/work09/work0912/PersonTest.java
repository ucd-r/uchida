package work09.work0912;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("rie", "uchida");
		Person p2 = new Person("rie","uchida");

		System.out.println(p1.equals(p2));
	}

}
