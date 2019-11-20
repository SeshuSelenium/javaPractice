package interview.programes;

public class Polindram {

	public static void main(String[] args) {
		String s = "madam";
		String s1 =  "";
		
		for (int i =  s.length()-1; i >=0; i--) {
			s1 = s1 + s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println("polindram");
		}else {
			System.out.println("not polindrame");
		}
	}

}
