package interview_prep.Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static void main(String[] args) {
		int nums[] = {0, 0, -3, 2, 5, 2, -3};
		//Brute Force
//		Map<Integer, Integer> freqCount = new HashMap<>();
//		for(int num:nums) {
//			freqCount.put(num, freqCount.getOrDefault(num, 0)+1);
//		}
//		for(Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
//			if(entry.getValue()==1) {
//				System.out.println(entry.getKey());
//				break;
//			}
//		}
		//Optimal
		int xor =0;
		for(int num:nums) {
			xor ^= num;
		}
		System.out.println(xor);
		
	}
}
