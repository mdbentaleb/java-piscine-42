public class Program {
	public static void main(String[] arg)
	{
		int nbr = 479598;
		int tmp = 0;

		while (nbr != 0)
		{
			tmp += nbr % 10;
			nbr /= 10;
		}
		System.out.println(tmp);
	}
}