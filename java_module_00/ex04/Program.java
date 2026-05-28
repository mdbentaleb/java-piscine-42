package java_module_00.ex04;

import java.util.Scanner;

/*
	main()
	├── read input
	├── count frequencies
	├── extract top10
	├── sort top10
	├── scale
	└── print histogram
 */
public class Program {

    private static char[] readInput(Scanner scan) {

		System.err.print("-> ");

		String	line = scan.nextLine();

        if (line == null || line.trim().isEmpty()) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        return line.toCharArray();
    }

	private static int[] countFrequencies(char[] inputArr) {
		int[]	freq = new int[65536];

		for (char c : inputArr) {

			freq[c]++;
		}

		return freq;
	}

	private static void sortTop10(int[] freq, char[] topChar, int[] topfreq) {

	}

    public static void main(String[] args) {
        if (args.length != 0) {
            return;
        }

        Scanner scan = new Scanner(System.in);

        char[] inputArr = readInput(scan);

		int	freq[] = countFrequencies(inputArr);

		// for (int i = 0; i < freq.length; i++) {
		// 	if (freq[i] != 0)
		// 		System.out.println(freq[i]);
		// }

		char[]	topChar = new char[10];
		int[]	topfreq = new int[10];

		sortTop10(freq, topChar, topfreq);

        scan.close();
    }
}
