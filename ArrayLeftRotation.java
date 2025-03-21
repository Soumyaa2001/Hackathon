import java.util.Scanner;
import java.util.Arrays;
class ArrayLeftRotation{

	public static void arrayLeftRotate (int[]a){

				int temp =a[0];

		for(int i=1; i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
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
		arrayLeftRotate(a);

}
}