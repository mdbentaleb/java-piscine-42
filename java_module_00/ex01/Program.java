package java_module_00.ex01;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.print("-> ");

        Scanner scan = new Scanner(System.in);
        int inNbr = scan.nextInt();

        if (inNbr <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        boolean isPrime = true;
        int itr = 0;
        int i = 2;

        while (i < inNbr) {
            itr++;

            if (inNbr % i == 0) {
				isPrime = false;
                break;
            }

			i++;
        }

		System.out.println(isPrime + " " + itr);
    }
}
