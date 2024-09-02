package interview_prep.Basic_Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] v) {
		// Use StringBuilder to build the result
        StringBuilder ans = new StringBuilder();
        
        // Sort the array to get the lexicographically smallest and largest strings
        Arrays.sort(v);
        // First string (smallest in sorted order)
        String first = v[0]; 
         // Last string (largest in sorted order)
        String last = v[v.length - 1];
        
        // Compare characters of the first and last strings
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            // If characters don't match, return the current prefix
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            // Append the matching character to the result
            ans.append(first.charAt(i));
        }
        
        // Return the longest common prefix found
        return ans.toString();

	}

	public static void main(String[] args) {
		String[] s = { "dog", "dcat", "danimal", "dmonkey", "dancient" };
		System.out.println(longestCommonPrefix(s));
	}
}

