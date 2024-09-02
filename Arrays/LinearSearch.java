package interview_prep.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {4,2,1,5,1,4,2,6,8,5,73,2,68,1,3};
		int n = arr.length;
		int target = 2;
		int index = -1;
		for(int i =0 ; i<n;i++) {
			if(arr[i]==target) {
				index =i;
				break;
			}
		}
		System.out.println(index);
	}
}
