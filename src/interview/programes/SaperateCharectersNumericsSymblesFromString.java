package interview.programes;

public class SaperateCharectersNumericsSymblesFromString {

	public static void main(String[] args) {
		String s = "password123&%@";
		String alpha = "";
		String numaric = "";
		String symbol = "";
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			
			if(c>='a'&&c<='z') {
			alpha = alpha + c;
				//System.out.println("it is character : " + c);
			}else if(c>='0'&&c<='9') {
				numaric = numaric + c;
				//System.out.println("it is numaric : " + c);
			}else {
				symbol = symbol + c;
				//System.out.println("it is symbol : " +c);
			}
		}
		System.out.println("it is characters : " + alpha);
		System.out.println("it is numarics : " + numaric);
		System.out.println("it is symbol : " +symbol);
	}

}
