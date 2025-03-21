
class ArrayAvg{


	public static double arrayAvg(int[] x){

		int sum =0;
		for(int i=0; i<x.length;i++)
		{
			sum= sum+x[i];
		}
		double avg= sum/x.length;
		return avg;

	}
	public static void main(String[] args) {
	
		
		int[] a = {1,2,3,4};
		double avgg =arrayAvg(a);
		System.out.println(avgg);
		
}
}