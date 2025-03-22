import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lastWeek = 0;
		String result = "";

		while (true) {
			System.out.print("-> ");
			String input = scn.nextLine();

			if (input.equals("42"))
				break;

			if (!input.startsWith("Week "))  {
				System.out.println("IllegalArguments");
				System.exit(-1);
			}

			int curWeek = Integer.parseInt(input.substring(5));
			if (curWeek <= lastWeek || curWeek > 18) {
				System.out.println("IllegalArguments");
				System.exit(-1);
			}

			lastWeek = curWeek;

			System.out.print("-> ");
			String[] scores = scn.nextLine().split(" ");

			if (scores.length != 5) {
				System.out.println("IllegalArguments");
				System.exit(-1);
			}

			int minScore = 9;

			for (String i : scores) {

				int value = Integer.parseInt(i);

				if (value < 0 || value > 9) {
					System.out.println("IllegalArguments");
					System.exit(-1);
				}

				if (value < minScore)
					minScore = value;

				result = "Week " + curWeek + " " + "=".repeat(minScore) + ">\n";
			}
		}
		System.out.println(result);
		scn.close();
	}
}
