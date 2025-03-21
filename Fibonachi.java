import java.util.Scanner;
class Fibonachi
{	

	public static void fibonachi()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number till you want to print in fibonachi serise: ");
		int num = sc.nextInt();

		int n=0;
		int n1=1;
		System.out.print(n+ " "+n1);
		
		for(int i=3; i<=num; i++)
		{
			int num1 = n+n1;
			System.out.print(" " +num1);
			n=n1;
			n1= num1;
		}
	}
	public static void main(String[] args) {

		fibonachi();

	}
}