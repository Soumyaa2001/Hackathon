class StringCountUpperLower {

	public static void countOfStringUpperAndLower(String str)
	{
		int uppercount=0;
		int lowercount=0;
		for (int i=0;i<str.length();i++)
		{   char c=str.charAt(i);
			if (c>='A' && c<='Z')
				uppercount++;
			else if (c>='a' && c<='z')
				lowercount++;
		}
		 System.out.println(uppercount);
		 System.out.println(lowercount);
	}
	public static void main(String[] args) {
		String s= " Java Programming";
		countOfStringUpperAndLower(s);
		 }
}