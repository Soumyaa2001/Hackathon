import java.util.Scanner;
class Swap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number A : ");
		int a = sc.nextInt();
		System.out.print("Enter Number B : ");
		int b = sc.nextInt();
		a=a+b-(b=a);
		System.out.println("Number A Is :"+a);
		System.out.println("Number B Is :"+b);
	}
}