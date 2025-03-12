import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int nbr = scn.nextInt();

		int i = 2;
		boolean isprime = true;
		if (nbr > 1)
		{
			while (i * i <= nbr)
			{
				if (nbr % i == 0) {
					isprime = false;
					break;
				}
				i++;
			}
		}
		else
		{
			System.err.println("Illegal Argument");
			System.exit(-1);
		}
		System.out.format("%b %d\n", isprime, i - 1);
	}
}