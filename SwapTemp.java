import java.util.Scanner;
class SwapTemp{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number A  : ");
		int a = sc.nextInt();
		System.out.print("Enter Number B  : ");
		int b = sc.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number A  : " +a);
		System.out.println("Number B  : " +b);
}		

}