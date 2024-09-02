package interview_prep.Recursion;

public class PrintNumbers {
	static int count =1;
	public static void numbers(int N) {
		System.out.print(count+" ");
		if(count <N) {
			count++;
			numbers(N);
		}
		
	}
	public static void main(String[] args) {
		numbers(2);
	}
}
