import java.util.Scanner;
class P9
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = sc.nextInt();
		int rev=0;
		int last;
		while(num>0){
			last=num%10;
			num=num/10;
			rev=(rev*10)+last;
		}
			System.out.println(rev);

	}
}