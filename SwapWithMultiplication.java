import java.util.Scanner;
class SwapWithMultiplication{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number A  : ");
		int a = sc.nextInt();
		System.out.print("Enter Number B  : ");
		int b = sc.nextInt();
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Number A  : " +a);
		System.out.println("Number B  : " +b);
}		

}