import java.util.Scanner;
class Problem
{
	public static boolean cigarParty(int c, boolean w){

		if (w== false)
		{
			if(c>= 40 && c<=60)
				return true;
			else
				return false;
		}
		else if (c>= 40)
		{	if(w == false)
				return false;
			else
				return true;
		}
		else
		System.out.println("Enter proper input");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		boolean w = sc.nextBoolean();
		System.out.println("Enter Number Of Cigars : ");
		System.out.println("Enter Day If weekend then true or false : ");
		System.out.println(cigarParty(c,w));

		
	}
}