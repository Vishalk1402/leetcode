package src.javacodes.string;

public class LengthOfLongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		int count = 0, max = 0;
		boolean[] seen = new boolean[128];

		for (int i = 0; i < s.length(); i++) {
			while (seen[s.charAt(i)]) {
				seen[s.charAt(count)] = false;
				count++;
			}
			seen[s.charAt(i)] = true;
			max = Math.max(max, i - count + 1);
		}
		return max;
	}

	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
}