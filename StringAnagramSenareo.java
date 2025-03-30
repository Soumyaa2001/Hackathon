
import java.util.Scanner;
import java.util.Arrays;
class StringAnagramSenareo {

	public static String anagram(String s, String p){

			char[] c2=new char[s.length()];
			for (int i=0;i<s.length();i++)
			{
			c2[i]=s.charAt(i);
			}		

			char[] c1=new char[p.length()];
			for (int i=0;i<p.length();i++)
			{
			c1[i]=p.charAt(i);
			}
			char[] c3=new char[p.length()];
			for(int j=0; j<=c2.length-1; j++)
			{
				for(int k=j; k<=j+c1.length-1;k++)
				{
					
					c3[k]=c2[j];
					
				}
			
			Arrays.sort(c1);
			Arrays.sort(c3);
			String res="";
			if(Arrays.equals(c3,c1)==true){
				res= res+j;
			}
			return res;
		}

		
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String p=sc.nextLine();
		System.out.println(anagram(s,p));
	}
}