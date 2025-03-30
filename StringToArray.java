
import java.util.Arrays;
class StringToArray {

	public static void array(String str){

		char[] c=new char[str.length()];
		for (int i=str.length()-1;i>=0;i--)
		{
			c[i]=str.charAt(i);
				
		}
		System.out.println(Arrays.toString(c)); 

	}

	public static void main(String[] args) {
		String s="Soumya";
		array(s);
	}
}