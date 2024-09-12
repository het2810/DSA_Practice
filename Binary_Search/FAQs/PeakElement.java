package interview_prep.Binary_Search.FAQs;

public class PeakElement {

	//Binary Search
	public int findPeakElement(int []arr) {
		int n= arr.length;
		if(arr[0]>arr[1] || n==1) {
			return 0;
		}
		if(arr[n-1]>arr[n-2]) {
			return n-1;
		}
		int low = 1;
		int high = n-2;
		while(low<=high) {
			int mid = (low+high)/2;
			System.out.println("Mid="+mid);
			if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
				return mid;
			}else if(arr[mid-1]<arr[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		
		return -1;
	}
	
	
	
	
//	Linear Search
//	public int findPeakElement(int[] arr) {
//		int n = arr.length;
//	
//
//		for (int i = 1; i < n; i++) {
//			if ((i == 0 || arr[i - 1] < arr[i]) && (i == n - 1 || arr[i] > arr[i + 1])) {
//
//				// Return the index of peak element
//				return i;
//			}
//		}
//		return -1;
//	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
		PeakElement p = new PeakElement();
		System.out.println(p.findPeakElement(nums));
	}
}
