package interview_prep.Binary_Search.On_Answers;

public class NthRootOfNumber {
	public int findNthRoot(int n,int m) {
		int low =1;
		int high = m;
		while(low<=high) {
			int mid =(low+high)/2;
			if(Math.pow(mid,n )==m) {
				return mid;
			}else if(Math.pow(mid,n )>m) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int n=3;
		int m=27;
		NthRootOfNumber nth = new NthRootOfNumber();
		System.out.println(nth.findNthRoot(n, m));
		
	}
}
