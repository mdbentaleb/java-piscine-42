package java_module_00.ex00;

public class Program {

	public static void main(String[] args) {
		int nbr = 479598;
		int cont = 0;
		int tmp = 1;

		while (nbr != 0) {
			tmp = nbr % 10;

			if (tmp > 0) {
				cont += tmp;
				nbr /= 10;
			}
		}

		System.out.println(cont);
	}
}
