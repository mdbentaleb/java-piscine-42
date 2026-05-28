package java_module_00.ex04;

import java.util.Scanner;

public class Program {

    private static char[] readInput(Scanner scan) {

        System.err.print("-> ");

        String line = scan.nextLine();

        if (line == null || line.trim().isEmpty()) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        return line.toCharArray();
    }

    private static int[] countFrequencies(char[] inputArr) {
        int[] freq = new int[65536];

        for (char c : inputArr) {
            freq[c]++;
        }

        return freq;
    }

    private static void sortTop10(int[] freq, char[] topChar, int[] topfreq) {

        for (int i = 0; i < 65536; i++) {
            if (freq[i] == 0) {
                continue;
            }

            char c = (char) i;
            int f = freq[i];

            int pos = -1;

            for (int j = 0; j < 10; j++) {
                if (topfreq[j] == 0) {
                    pos = j;
                    break;
                }
            }

            if (pos == -1) {
                int worst = 0;

                for (int j = 1; j < 10; j++) {
                    if (topfreq[j] < topfreq[worst]
                            || (topfreq[j] == topfreq[worst] && topChar[j] > topChar[worst])) {
                        worst = j;
                    }
                }

                if (f > topfreq[worst]
                        || (f == topfreq[worst] && c < topChar[worst])) {
                    pos = worst;
                }
            }

            if (pos != -1) {
                topChar[pos] = c;
                topfreq[pos] = f;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (topfreq[j] > topfreq[i] || (topfreq[j] == topfreq[i] && topChar[j] < topChar[i])) {
                    int tempF = topfreq[i];
                    topfreq[i] = topfreq[j];
                    topfreq[j] = tempF;

                    char tempC = topChar[i];
                    topChar[i] = topChar[j];
                    topChar[j] = tempC;
                }
            }
        }
    }

    private static int[] scale(int[] topFreq) {
        int max = 0;

        for (int i = 0; i < 10; i++) {
            if (topFreq[i] > max) {
                max = topFreq[i];
            }
        }

        int[] scaled = new int[10];

        for (int i = 0; i < 10; i++) {
            if (max != 0) {
                scaled[i] = (topFreq[i] * 10) / max;
            } else {
                scaled[i] = 0;
            }
        }

        return scaled;
    }

    private static void printHistogram(char[] topChar, int[] topFreq, int[] scaled) {
        System.out.println();

        for (int h = 11; h >= 0; h--) {
            for (int i = 0; i < 10; i++) {
                if (topFreq[i] == 0) {
                    break;
                }

                if (h == scaled[i] + 1) {

                    System.out.printf("%3d", topFreq[i]);
                } else if (h <= scaled[i] && h > 0) {

                    System.out.print("  #");
                } else if (h == 0) {

                    System.out.printf("%3c", topChar[i]);
                } else {

                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        if (args.length != 0) {
            return;
        }

        Scanner scan = new Scanner(System.in);

        char[] inputArr = readInput(scan);

        int freq[] = countFrequencies(inputArr);

        char[] topChar = new char[10];
        int[] topfreq = new int[10];

        sortTop10(freq, topChar, topfreq);

        int scaled[] = scale(topfreq);

        printHistogram(topChar, topfreq, scaled);

        scan.close();
    }
}
