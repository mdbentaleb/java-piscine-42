import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("-- Enter the numbers --");
		Scanner scn = new Scanner(System.in);
		int nbr = 0;
		int count = 0;
		while (true) {
			nbr = scn.nextInt();
			if (nbr == 42)
				break;
			if (is_sum_prime(nbr))
				count++;
		}
		System.out.format("Count of coffee-request - %d\n", count);
	}
	public static boolean is_sum_prime(int nbr) {
		int tmp = 0;
		while (nbr != 0) {
			tmp += nbr % 10;
			nbr /= 10;
		}
		if (tmp <= 1)
			return false;
		int i = 2;
		while (i * i <= tmp) {
			if (tmp % i == 0)
				return false;
			i++;
		}
		return true;
	}
}