import java.util.Scanner;
class ArraySumEvenOdd{


	public static int  arrEven(int [] a){
		int sum =0;
		for(int i=0; i<a.length;i++)
		{
			if (a[i]%2==0)
			 sum= sum+a[1];
			
		}
		return sum;

	}

	public static int arrOdd(int [] a){
		int sum =0;
		for(int i=0; i<a.length;i++)
		{
			if (a[i]%2==1)
			 sum= sum+a[1];
			
		}
		return sum;

	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		 System.out.println("Sum of Even Place" +arrEven(a)); 
		 System.out.println("Sum of Odd Place" +arrOdd(a));
}
}