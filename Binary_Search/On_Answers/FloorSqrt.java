package interview_prep.Binary_Search.On_Answers;

public class FloorSqrt {
	public long floorSqrt(long n) {
		long temp = (long)Math.sqrt(n);
		System.out.println(temp);
		return n;
	}
	
	public static void main(String[] args) {
		long n=36;
		FloorSqrt fs = new FloorSqrt();
		System.out.println(fs.floorSqrt(n));
	}
}
