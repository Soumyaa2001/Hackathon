
class ArrayReturn{


	public static int[] returnArray(){

		int[] a = {1,2,3,4};
		return a;

	}
	public static void main(String[] args) {
	
		
		int [] x= returnArray();
		for(int i=0; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
}
}