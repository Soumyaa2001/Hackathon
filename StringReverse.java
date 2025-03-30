
class StringReverse {

	public static String wordCount(String str){

		String temp="";
		for (int i=str.length()-1;i>=0;i--)
		{
			temp= temp+str.charAt(i);
				
		}
		return temp;

	}

	public static void main(String[] args) {
		String s="Soumya";
		System.out.println(wordCount(s));
	}
}