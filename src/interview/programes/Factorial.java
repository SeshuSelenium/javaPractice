package interview.programes;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int m =1;
		for (int i = n; i > 0; i--) {
			int temp = m;
			m = m*i;
			System.out.println(temp);
		}

	}

}
