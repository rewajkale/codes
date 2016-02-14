package codes;
/*
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 *  which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepetition {
	    public int lengthOfLongestSubstring(String s) {
			String str = "";
			int currL=0, maxL=0;
			for(int i=0;i<s.length();i++)
			{
				currL=0;
				if(!(str.contains(s.charAt(i)+"")))
				{
					str=str+s.charAt(i);
				}
				else
				{
					int index=str.indexOf(s.charAt(i));
					str=str.substring(index+1)+s.charAt(i);
				}
				currL=str.length();
				maxL=(maxL<currL)?currL:maxL;
			}
	        return maxL;
	    }
	public static void main(String args[])
	{
		LongestSubstringWithoutRepetition s=new LongestSubstringWithoutRepetition();
		int len=s.lengthOfLongestSubstring("abcabcdbbcde");
		System.out.println(len);
	}
}
