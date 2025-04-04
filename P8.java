
import java.util.Scanner;
class P8
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

	public static void palindrome(int temp){
		int com = countOfDigit(temp);
		if( temp == com)
			System.out.println(temp+ " It is a palindrome");
		else 
			System.out.println(temp+ " It is not a palindrome");
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = sc.nextInt();
		palindrome(n);
	}
}