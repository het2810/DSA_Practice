package interview_prep.patterns;

public class ExtraPattern {
	public static void main(String[] args) {
		int n = 4;
		for(int i=0;i<n;i++) {
			int prev=1;
			for(int j=0;j<i*2+1;j++) {
				if(j==0) {
					System.out.print(prev+" ");
				}else {
					
					int temp = prev *2;
					System.out.print(temp+" ");
					prev = temp;
				}
			}
			System.out.println();
			
		}
	}
}
