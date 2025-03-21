import java.util.Scanner;
class ArrayPrint{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
}
}