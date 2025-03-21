import java.util.Scanner;
class Problem3_1
{	

	public static void countMoney( int amount)
	{  int five=0, two =0, one=0, amount1=0;

		if(amount<=40)
		{
			five= amount/5;
			if(five<=5)
		 		amount1= amount-(five*5);
			else
			{
			int fivemul = five- 5;
			amount1=  amount - (five*5) + (fivemul*5);
			}

		if(amount1>=2)
		{
			two = amount1/2;
				if(two<=5)
			 	amount1= amount1-(two*5);
				else
				{
				int twomul = two- 5;
				amount1=  amount1 - (two*5) + (twomul*2);
				}
		}
			
		else if(amount1>=1){	
					one= amount1/1;
						if(one<=5)
					 	amount1= amount1-(one*5);
						else
						{
						int onemul = one- 5;
						amount1=  amount1 - (one*5) + (onemul*1);
						}
					}

		System.out.println(five+two+one);
		}
		else
			System.out.println(-1);

		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				int amount = sc.nextInt();

				countMoney(amount);
	}
}