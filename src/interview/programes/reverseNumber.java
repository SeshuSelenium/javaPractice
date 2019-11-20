package interview.programes;

public class reverseNumber {

	public static void main(String[] args) {
		int y = 122, rev = 0;
		int x=y;
		while(x!=0) {
			int temp=x%10;
			rev = rev * 10 + temp;
			x=x/10;
		}
		System.out.println(rev);
		System.out.println(y);
		if(y==rev) {
			System.out.println("polindram");
		}else {
			System.out.println("not polindram");
		}
		
		
	}

}
