package interview_prep.Basic_Strings;

public class LargestOddInString {
	public static String largeOddNum(String s) {
        //your code goes here
        int x =-1;
        s=s.replaceFirst("^0+(?!$)", "");
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)%2==1){
                x=i;
                break;
            }
        }
        return s.substring(0,x+1);
    }
	public static void main(String[] args) {
		System.out.println(largeOddNum("002031689750"));
	}
}
