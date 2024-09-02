package interview_prep.Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int nums[] = {7,6,5,4,3,2,1};
		System.out.println("Before Sorting");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		int itt =0;
		int n  = nums.length;
		for(int i=1;i<n;i++) {
			int key = nums[i];
			int j = i-1;
			while(j>=0 && nums[j] > key) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
			itt++;	
		}
		System.out.println("\nItterations = "+itt);
		System.out.println("After Sorting");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
