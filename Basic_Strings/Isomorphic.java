package interview_prep.Basic_Strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
	public static boolean isIsomorphic(String s , String t) {
		if(s.length() != t.length()) {
			return false;
		}
		Map<Character, Character> mapS = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!mapS.containsKey(s.charAt(i))) {
				mapS.put(s.charAt(i), t.charAt(i));
			}else if(mapS.get(s.charAt(i)) != t.charAt(i)) {
//				System.out.println("1------------");
				return false;
						
			}
			
		}
		Map<Character, Character> mapT = new HashMap<>();
		for(int i=0;i<t.length();i++) {
			if(!mapT.containsKey(t.charAt(i))) {
				mapT.put(t.charAt(i), s.charAt(i));
			}else if(mapT.get(t.charAt(i)) != s.charAt(i)) {
//				System.out.println("2-----------");
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isIsomorphic("apple", "bbnbm"));
	}
}
