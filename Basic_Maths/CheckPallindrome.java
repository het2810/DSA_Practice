package interview_prep.Basic_Maths;

public class CheckPallindrome {
	 public boolean isPalindrome(int x) {
	        long ans =0;    
	        int temp =x;
	        if(x<0){
	            return false;
	        }else{
	            while(x>0){
	                ans = ans * 10 + x % 10;
	                x /= 10;
	            }
	            if(ans == temp){
	                return true;
	            }
	            return false;
	        }
	    }
}
