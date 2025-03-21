import java.util.Scanner;
class Problem3
{	

	public static void plant_growth( int amount)
	{   
		int count =0, remain=0, count1=0, remain1=0, count2=0, remain2=0;
		if(amount<40)
		{
			for (int i=0; i<=5 ; i++ ) 
			{
				count= amount/5;
				remain=amount%5;
				
			 		for (int j=0; j<=5 ; j++ ) {
						count1= remain/2;
						remain1=remain%2;

						for (int k=0; k<=5 ; k++ ) {
						count2= remain1/2;
						remain2=remain1%2;

						}
					}
			}
			System.out.println(count+count1+count2);
		}
		else
			System.out.println(-1);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter number: ");
		int amount = sc.nextInt();

		plant_growth(amount);

	}
}