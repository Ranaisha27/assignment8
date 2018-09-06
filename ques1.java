import java.util.Scanner;
 class AddNumbers
{
	public static void main(String args[])
	{
		String n,m;
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter the 1st number: ");
                  n = sc.next();
                System.out.println("Enter the 2nd number: ");
                 m = sc.next();
		int c = Integer.parseInt(n) + Integer.parseInt(m);
		System.out.println("The sum of two string numbers := "+c);
	}
}