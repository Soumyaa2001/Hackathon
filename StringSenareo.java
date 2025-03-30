import java.util.Scanner;
class StringSenareo {

	public static void palindrom(String str){
		String temp="";
		for (int i=str.length()-1;i>=0;i--)
		{   
			char c=str.charAt(i);

			if ((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>=0 && c<=9))
				temp=temp+str.charAt(i);
				
		}
		String temp1="";
		for (int i=temp.length()-1;i>=0;i--)
		{
			temp1=temp1+temp.charAt(i);
				
		}
		 if(str.isEmpty() || temp.equalsIgnoreCase(temp1))   
		 	System.out.println("it is palindrom");
		 else
		 System.out.println("not a palindrom");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		palindrom(s);
	}
}