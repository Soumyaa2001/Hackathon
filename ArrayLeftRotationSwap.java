import java.util.Scanner;
import java.util.Arrays;
class ArrayLeftRotationSwap{

	public static void arrayLeftRotateSwap (int[]a){

		for(int i=0; i<a.length-1;i++)
		{
			// x 	y
			//a[i]  a[i+1]

			a[i]= a[i]+a[i+1]-(a[i+1]=a[i]);
		}
		
		System.out.println("After left Rotation" +Arrays.toString(a));
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}

		System.out.println("Before left Rotation" +Arrays.toString(a));
		arrayLeftRotateSwap(a);

}
}