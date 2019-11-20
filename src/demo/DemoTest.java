package demo;

public class DemoTest {

	public static void main(String[] args) {
	
		
		String alpha = "", numaric = "", symbol = "";
		String str = "sirisha reddy1234@@@";
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			
			if(c >= 'a' && c<='z') {
				alpha = alpha + c;
			}else if(c>= '0' && c <= '9') {
				numaric = numaric + c;
			}else {
				symbol = symbol + c;
			}
		}
		System.out.println("is alpha : " + alpha);
		System.out.println("is numaric : "+numaric);
		System.out.println("is symbol : "+symbol);
	}

}
