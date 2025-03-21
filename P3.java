//wap to print 3 and 7 multiple in between 1-50
class P3{
	public static void main(String[] args) {
		for(int i=1;i<=50;i++){
			if(i%3==0||i%7==0)
				System.out.println(i);
		}
	}
}