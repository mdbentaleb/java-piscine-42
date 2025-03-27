### Exercise 04 – A Bit More of Statistics
Exercise 04 | A Bit More of Statistics |
---|---
Turn-in directory	| ex04
Files to turn-in |	Program.java
**Allowed**
Input/Output |	System.out, System.err, Scanner(System.in)
Types | Primitive types, String, arrays
Operators	| Standard operations of primitive types, conditions, loops
Methods	| String::equals, String::toCharArray, String::length

Did you know that you can use frequency analysis to decipher poorly encrypted texts?

See https://en.wikipedia.org/wiki/Frequency_analysis

Feel like a hacker and implement a program for counting a character occurrences in a text.

We like visual clarity. This is why the program will display the results in a histogram. This chart will show 10 most frequently occurring characters in descending order.

If letters are encountered the same number of times, they should be sorted in a lexicographic order.

Each character may occur in text a great number of times. For that reason, the chart should be scalable. The maximum height of the displayed chart is 10, and the minimum is 0.

Input data for the program is a string with a single "\n" character at the end (thus, a single long string can be used as input).

It is assumed that each input character can be contained in a char variable (Unicode BMP; for example, the code of letter "S" is 0053, maximum code value is 65535).

The maximum number of character occurrences is 999.

**Note**: this problem must be solved without multiple iterations over the source text (sorting and removing repetitions), because these methods will significantly slow down the application. Use other information processing methods.

Example of program operation:

```
$ java Program

-> AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKDSKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42

 36
  #  35
  #   #
  #   #  27
  #   #   #
  #   #   #
  #   #   #
  #   #   #  14  12
  #   #   #   #   #   9
  #   #   #   #   #   #   7   4
  #   #   #   #   #   #   #   #   2   2
  D   A   S   W   L   K   O   T   E   R
```