package java_module_00.ex00;

public class Program {

	public static void main(String[] args) {
		int nbr = 479598;
		int sum = 0;

		while (nbr != 0) {
			sum += nbr % 10;
			nbr /= 10;
		}

		System.out.println(sum);
	}
}
