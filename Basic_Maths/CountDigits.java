package interview_prep.Basic_Maths;

// problem link : https://www.geeksforgeeks.org/problems/count-digits5716/1
class solutionCountDigits {
	 public int evenlyDivides(int N){
		 int count =0;
	     int x  = N;
	     while(x > 0){
	    	 int a = x % 10 ;
	         x /= 10;
	         if(a>0 && N%a==0){
	        	 count++;
	         }
	            
	     }
	     return count;
	 }
	
}
public class CountDigits extends solutionCountDigits{
	public static void main(String[] args) {
		solutionCountDigits s = new solutionCountDigits();
		s.evenlyDivides(2446);
	}
}
