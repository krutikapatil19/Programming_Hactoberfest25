public class LongestPalindrome {
    public String longestPalindrome(String s){
        if(s == null || s.length() < 1) return "";
        int start = 0 ; int end = 0;                    //these two variables store the start and end indices of the longest substring we've found so far.

        for(int i = 0; i<s.length(); i++){              //looping through every character in the string, as each position could be the centre of the substring.
            int len1 = expand(s, i, i);                 //for odd length string
            int len2 = expand(s, i, i+1);               //for even length string
            int len = Math.max(len1, len2);             //takes the longer palindrome between odd and even cases.

            if(len > end - start) {                     //if we found a longer palindrome than before , update start and end.
               start = i - (len - 1) / 2;               //move start to the correct beginning index of the new substring.   // (len - 1)/2 = handles both even and odd cases properly.
               end = i + len / 2;                       //handles both even and odd cases properly.
            }
        }
        return s.substring(start, end+ 1);              //extract the substring from start to end , return it.
    }
    public int expand(String s , int left , int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right++;
        }
        return right - left - 1;                        //length of the palindrome
    }
    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        String s = "forgeeksskeegfor";
        System.out.println("Longest palindrome : " + lp.longestPalindrome(s));
    }
    
}

