import java.util.Scanner;
class P10
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = sc.nextInt();
		int sum=0;
		int num1 = num;
		int mul=1;
		int last;
		while(num !=0){
			last=num%10;
			num=num/10;
			sum=sum+last;
			mul=mul*last;
			
			}
			if(sum == mul)
			System.out.println(num1+" is a spy num");

			else 
			System.out.println(num1+ "not a spy num");
		

	}
}