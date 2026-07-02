package java_module_01.ex00;


public class Program {
	public static void main(String[] args) {
		User u1 = new User("Mohamed", 500);
		User u2 = new User("Lm3ti", 250);

		System.out.println(u1.showInfo());
		System.out.println(u2.showInfo());

		Transaction transaction = new Transaction(u1, u2, 300);
		System.out.println(transaction.showTransaction());

		System.out.println(u1.showInfo());
		System.out.println(u2.showInfo());
	}
}
