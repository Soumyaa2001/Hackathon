import java.util.Scanner;
class P6
{
	public static int countOfDigit(int num){

		int count=0;
		while(num>0){
			num=num/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countOfDigit(n));

		
	}
}