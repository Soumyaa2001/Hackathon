import java.util.Scanner;
class ArrayReverse{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}

		System.out.println("________________");

		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
}
}