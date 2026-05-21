package java_module_00.ex02;

import java.util.Scanner;


public class Program {

	private static int	digitSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	private static boolean isPrime(int nbr) {

		int i = 2;
		while (i < nbr) {
			if (nbr % i == 0)
				return false;
			i++;
		}

		return true;
	}

    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;

        while (true) {
			System.out.print("-> ");
			int nbr = scan.nextInt();

			if (nbr == 42)
				break;

			int sum = digitSum(nbr);

			if (isPrime(sum))
				count++;
        }

		System.out.println("Count of coffee-request : " + count);
    }
}
