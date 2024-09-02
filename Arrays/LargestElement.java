package interview_prep.Arrays;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = {4,2,1,5,1,4,2,6,8,5,73,2,68,1,3};
		int n = arr.length;
		int max =0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
