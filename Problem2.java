import java.util.Scanner;
class Problem2
{	

	public static void plant_growth( int year)
	{
		int n1=0;
		int n2=1;
		int num1=0;
			if(year== 0)
				System.out.println(0);
			else if (year == 1)
				System.out.println(1);
			else
			{
				for(int i=2; i<=year; i++)
				{ 
				num1 = n1+n2;
				n1=n2;
				n2= num1;
				}
				System.out.print(num1);
			}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter Number of Years To Check Plant Growth: ");
		int year = sc.nextInt();

		plant_growth(year);

	}
}