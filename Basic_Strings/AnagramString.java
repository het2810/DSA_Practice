package interview_prep.Basic_Strings;

public class AnagramString {
	public static boolean isAnagram(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		int []count= new int[26];
		for(char c : s.toCharArray()) {
			count[c-'a']++;
		}
		for(char c:t.toCharArray()) {
			count[c-'a']--;
		}
		for(int i:count) {
			if(i != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("dog", "cat"));
	}
}
