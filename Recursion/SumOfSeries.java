package interview_prep.Recursion;

public class SumOfSeries {
	static long count =1;
	static long sum =0;
	public static long findSum(long n) {
		sum += (count*count*count);
		if(count<n) {
			count++;
			findSum(n);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(findSum(5));
		
	}
}
