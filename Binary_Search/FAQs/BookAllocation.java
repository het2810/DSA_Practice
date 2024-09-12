package interview_prep.Binary_Search.FAQs;


public class BookAllocation {

	
	public int countStudents(int nums[],int pages) {
		int student =1,pagesStudent =0;
		for(int i=0;i<nums.length;i++) {
			if(pagesStudent+nums[i]<=pages) {
				pagesStudent += nums[i];
			}else {
				student++;
				pagesStudent = nums[i];
			}
		}
		
		return student;
	}
	
	//Implementing Binary Search
	public int findPages(int[] nums,int m) {
		int n = nums.length;
		if(m>n) return -1;
		int low = Integer.MIN_VALUE; //This will be maximum element of array
		int high = 0;
		BookAllocation b = new BookAllocation();
		for(int i=0;i<n;i++) {
			low = Math.max(low, nums[i]);
			high += nums[i];
		}
		while(low<=high) {
			int mid = (low+high)/2;
			int countStudents = b.countStudents(nums, mid);
			if(countStudents>m) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return low;
	}
	
	
	
	
	
	
	//Implementing using Linear Search
//	public int findPages(int[] nums, int m) {
//		if(nums.length<m) return -1;
//		BookAllocation b = new BookAllocation();
//		int low = Integer.MIN_VALUE; //maximum element of Array
//		int high = 0; // sum of array
//
//		for(int i = 0; i < nums.length; i++){
//            low = Math.max(low, nums[i]);
//            high = high + nums[i];
//        }
//		System.out.println("Low="+low);
//		System.out.println("High="+high);
//		for(int i=low;i<=high;i++) {
//			int countStudent = b.countStudents(nums, i);
//			if(countStudent==m) {
//				return i;
//			}
//		}
//		
//		return low;
//    }
	
	
	
	public static void main(String[] args) {
		int bookPages[] = {25,46,28,49,24};
		int m = 4; // students
		BookAllocation b = new BookAllocation();
		System.out.println(b.findPages(bookPages, m));
	}
}
