package java_module_01.ex01;


public class Program {
	public static void main(String[] args) {
		User u1 = new User("Mohamed", 500);
		User u2 = new User("Lm3ti", 250);
		User u3 = new User("ch3ayba", 937);

		System.out.println(u1.showInfo());
		System.out.println(u2.showInfo());
		System.out.println(u3.showInfo());
	}
}
