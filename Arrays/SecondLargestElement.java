package interview_prep.Arrays;

import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[] = {4,2,1,5,1,4,2,6,8,5,73,2,68,1,3};
		int secondMax =-1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int n = arr.length -1;
		int max = arr[n] ;
		System.out.println("max="+max);
		for(int i = n;i>=0;i--) {
			System.out.println("\narr[i]="+arr[i]);
			if(arr[i]<max) {
				secondMax = arr[i];
				System.out.println("\nSecondMax = "+secondMax);
				break;
			}
		}
		System.out.println("\nSecondMax = "+secondMax);
		
		
		
//		int n = arr.length;
//		int max =-1;
//		int secondMax =-1;
//		for(int i=0;i<n;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//			if(arr[i]<max) {
//				if(arr[i]>secondMax) {
//					secondMax = arr[i];
//				}
//			}
//		}
//		System.out.println("Max = "+max);
//		System.out.println("secondMax = "+secondMax);
	}
}
