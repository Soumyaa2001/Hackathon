
import java.util.Scanner;
class StringArrayPalindrom {

	public static String arrayPalindrom(String [ ] str){
		 	
		for(int i=0; i<str.length;i++)
		{
				String temp=str[i];
				String temp1="";
			for (int j=temp.length()-1;j>=0;j--)
			{
				temp1=temp1+temp.charAt(i);
					
			}

		 	if(temp.equalsIgnoreCase(temp1)== true)
		 		return temp;	
		}
		  return temp;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String [] s = new String[size];

		for(int i=0; i<s.length;i++)
		{
			s[i]=sc.next();
			
		}
		System.out.println(arrayPalindrom(s));
	}
}