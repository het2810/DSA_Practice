package interview_prep.Arrays.FAQs_Medium;

public class PascalsTriangle {
	
	public int nCr(int n,int r) {
		int result =1;
		for(int i=0;i<r;i++) {
			result = result*(n-i);
			result = result/(i+1);
		}
		return result;
	}
	
	public int type1(int r,int c) {
		//This will take row and columns and will return particular element at that place 
		
		/*
		 * to find element at r-c place, 
		 * find r-1 & c-1 then find using below formula
		 * 		r-1
		 * 		   C	
		 * 			c-1
		 * */
		PascalsTriangle p = new PascalsTriangle();
		
		int n = r-1;
		int d = c-1;
		int result =p.nCr(n, d);

		return result;
		
	}
	public void type2(int n) {
		//In this type we need to print the specific row of pascals triangle which is given
		PascalsTriangle p = new PascalsTriangle();
		
		//Brute Force
//		int ans[] = new int[n];
//		for(int i=0;i<n;i++) {
//			ans[i] = p.nCr(n-1, i);
//		}
//		System.out.print("Array :");
//		for(int i =0;i<n;i++) {
//			System.out.print(ans[i]+" ");
//		}
		
		//Optimal
		/*
		 * use formula to find specific row :
		 * 		ans x ((row-column)/column)
		 * 				
		 * */
		int ans = 1;
		System.out.print(ans+" ");
		for(int i=1;i<n;i++) {
			ans = ans*(n-i);
			ans = ans/i;
			System.out.print(ans+" ");
		}
		
	}
	
	public void type3(int n) {
		//This type will return all rows upto n
		//refer tuf for solution
	}
	
	public static void main(String[] args) {
		PascalsTriangle p = new PascalsTriangle();
		System.out.println(p.type1(5, 3));
		
		p.type2(5);
		
	}
}
