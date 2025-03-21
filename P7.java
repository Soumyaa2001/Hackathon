//Reverse of a number

import java.util.Scanner;
class P7
{
	public static int countOfDigit(int num){

		int rev=0;
		int last=0;
		while(num>0){
			last=num%10;
			rev= (rev*10) + last;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = sc.nextInt();
		System.out.println("Reverse Of The Number Is "+countOfDigit(n));
	}
}