import java.util.Scanner;
import java.util.Arrays;
class ArrayPrintValue{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
}
}