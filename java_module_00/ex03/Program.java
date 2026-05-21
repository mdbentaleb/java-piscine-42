package java_module_00.ex03;

import java.util.Scanner;

public class Program {

	private static long reverse(long n) {

    long rev = 0;

    while (n != 0) {
        rev = (rev * 10) + (n % 10);
        n /= 10;
    }

    return rev;
}


	private static void	printGraph(long storage) {
		int		week = 1;
		long	tmp = reverse(storage);


		while (tmp != 0) {
			int grade = (int)(tmp % 10);

			System.out.print("Week " + week + " ");

			for (int i = 0; i < grade; i++)
				System.out.print("=");

			System.out.println(">");

			tmp /= 10;
			week++;
		}
	}

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
		int		expectedWeek = 1;
		long	storage = 0;

        for (int i = 0; i < 18; i++) {
			System.out.print("-> ");

			String	week = scan.next();

			if (week.equals("42"))
				break;

			if (!week.equals("Week")) {
				System.err.println("IllegalArgument");
				System.exit(-1);
			}

			int		weekNbr = scan.nextInt();

			if (weekNbr != expectedWeek) {
				System.err.println("IllegalArgument");
				System.exit(-1);
			}

			int min = 9;

			System.out.print("-> ");
			for (int j = 0; j < 5; j++) {
				int	testGrade = scan.nextInt();

				if (testGrade < min)
					min = testGrade;
			}

			storage = (storage * 10) + min;

			expectedWeek++;
        }

		printGraph(storage);
    }
}
