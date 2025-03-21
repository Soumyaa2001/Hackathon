import java.util.Scanner;
import java.util.Arrays;
class ArrayAddElement{

	public static void arrayAddElement (int[]a,int k){

		int[] b = new int[a.length+1];

		for(int i=0; i<a.length;i++)
		{
			b[i]=a[i];
		}

		// Alternate Method By Using In Built Arrays Class Method "copyOf"
		//int[] b = Arrays.copyOf(a, a.length+1);
		b[b.length-1]=k;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Vlue You Want To Add :");
		int k = sc.nextInt();
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];

		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}

		arrayAddElement(a,k);

}
}