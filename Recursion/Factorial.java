package interview_prep.Recursion;

public class Factorial {
	public static long findFactorial(long n) {
		if(n==0) {
			return 1;
		}else {			
			return n*findFactorial(n-1);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(findFactorial(9));
	}
}
