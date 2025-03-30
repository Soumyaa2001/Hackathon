// count number of words in a string

class StringWordCount {

	public static int wordCount(String str){

		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if ((str.charAt(i) != ' ' && str.charAt(i-1) == ' ' ) ||(i==0 && str.charAt(i) != ' '))
				count++;
				
		}
		return count;

	}

	public static void main(String[] args) {
		String s="   we are   the  students of jspider    ";
		System.out.println(" Number of Words are :" +wordCount(s));
	}
}