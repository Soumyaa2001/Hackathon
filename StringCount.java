class StringCount {

	public static int countOfString(String str)
	{
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) != ' ')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String s= " Java Programming";
		 System.out.println( countOfString(s));
	}
}