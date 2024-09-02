package interview_prep.Basic_Strings;

import java.util.*;

public class SortCharacterByFrequency {
	public static List<Character> frequencySort(String s) {
		// Create a HashMap to store the frequency of each character
		Map<Character, Integer> frequencyMap = new HashMap<>();

		// Count the frequency of each character
		for (char c : s.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		// Create a list from elements of the frequencyMap
		List<Map.Entry<Character, Integer>> freqList = new ArrayList<>(frequencyMap.entrySet());

		// Sort the list by frequency in descending order
		freqList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

		// Create the result list to store sorted characters without duplication
		List<Character> result = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : freqList) {
			char c = entry.getKey();
			// Add the character only once to the result list
			result.add(c);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(frequencySort("bbccddaaa"));
	}
}
