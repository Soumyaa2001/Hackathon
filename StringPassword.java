class StringPassword {

	public static void PasswordCheck(String str)
	{
		int uppercount=0;
		int lowercount=0; 
		int digitcount=0;
		for (int i=0;i<str.length();i++)
		{   char c=str.charAt(i);
			if (c>='A' && c<='Z')
				uppercount++;
			else if (c>='a' && c<='z')
				lowercount++;
			else if (c>='0' && c<='9')
				digitcount++;
		}
		 if (uppercount>=2 && lowercount>=2 && digitcount>=2 && str.length()>=8) 	
		  System.out.println( str + "  : it is a strong password");
		else 
			System.out.println(str +"  : it is not a strong password");
	}
	public static void main(String[] args) {
		String password = "Soumya@2001";
		PasswordCheck(password);
		 }
}