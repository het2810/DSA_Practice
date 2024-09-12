package interview_prep.Binary_Search.FAQs;

import java.util.Arrays;
import java.util.PriorityQueue;

class Pairs {
	double first;
	int second;

	public Pairs(double first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
}

public class MinimizeMaxDistance {

	public int numberOfGasStationsRequired(double dist, int[] arr) {
		// Size of the array
		int n = arr.length;
		int cnt = 0;
		for (int i = 1; i < n; i++) {

			/*
			 * Calculate number of gas stations needed between two points
			 */
			int numberInBetween = (int) ((arr[i] - arr[i - 1]) / dist);

			// Adjust if exact distance fits perfectly
			if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
				numberInBetween--;
			}

			cnt += numberInBetween;
		}
		return cnt;
	}

	// Binary Search Approach
	public double minimiseMaxDistance(int[] arr, int k) {
		int n = arr.length;
		double low = 0;
		double high = 0;

		/*
		 * Find the maximum distance between consecutive gas stations
		 */
		for (int i = 0; i < n - 1; i++) {
			high = Math.max(high, arr[i + 1] - arr[i]);
		}

		/*
		 * Apply Binary search to find the minimum possible maximum distance
		 */
		double diff = 1e-6;
		while (high - low > diff) {
			double mid = (low + high) / 2.0;
			int cnt = numberOfGasStationsRequired(mid, arr);

			/*
			 * Adjust the search range based on the number of gas stations required
			 */
			if (cnt > k) {
				low = mid;
			} else {
				high = mid;
			}
		}

		// Return smallest maximum distance found
		return high;
	}

//	public double minimiseMaxDistance(int[] arr,int k) {
//		int n= arr.length;
//		int howMany[] = new int[n-1];
//		PriorityQueue<Pairs> pq = new PriorityQueue<>((a,b)->Double.compare(b.first, a.first));
//		for(int i=0;i<n-1;i++) {
//			pq.add(new Pairs(arr[i+1]-arr[i], i));
//		}
//		for(int gasStations=1; gasStations<=k;gasStations++) {
//			Pairs tp = pq.poll();
//			int secInd = tp.second;
//			howMany[secInd]++;
//			
//			double indidiff = arr[secInd+1]-arr[secInd];
//			double newSecLen =indidiff/(double)(howMany[secInd]+1);
//			
//			pq.add(new Pairs(newSecLen,secInd));
//			
//		}
//		return pq.peek().first;
//	}
//	

	// brute force
//	public double minimiseMaxDistance(int[] arr, int k) {
//		int n = arr.length;
//		int howMany[] = new int[n - 1];
//		Arrays.fill(howMany, 0);
//
//		for (int i = 1; i <= k; i++) {
//			double maxi = -1;
//			int maxIndex = -1;
//			for (int j = 0; j < n - 1; j++) {
//				double diff = arr[j + 1] - arr[j];
//				double sectionLength = diff / (double) (howMany[j] + 1);
//				if (maxi < sectionLength) {
//					maxi = sectionLength;
//					maxIndex = j;
//				}
//			}
//			howMany[maxIndex]++;
//		}
//		double maxAns = -1;
//		for (int i = 0; i < n - 1; i++) {
//			double diff = arr[i + 1] - arr[i];
//			double sectionLength = diff / (double) (howMany[i] + 1);
//			maxAns = Math.max(maxAns, sectionLength);
//		}
//		return maxAns;
//	}

	public static void main(String[] args) {
		int arr[] = { 3, 6, 12, 19, 33, 44, 67, 72, 89, 95 };
		int k = 2;
		MinimizeMaxDistance m = new MinimizeMaxDistance();
		System.out.println(m.minimiseMaxDistance(arr, k));
	}
}
