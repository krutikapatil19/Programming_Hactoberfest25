public class PalindromeCheck {
    public boolean isPalindrome(String str) {

        // str = str.toLowerCase(); //makes i and j comparison easy if all letters are
        // lowercase

        int i = 0;          // 2 pointers are used .i=start , and j=last element , to traverse from both sides.
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {     // traversal is done from both ends until it reaches the both mid values which
                            // are next to each other
            if (str.charAt(i) != str.charAt(j)) {           // to compare both values , if not then string is not palindrome.  
                isPalindrome = false;
                break;
            }
            i++;
            j--;
            
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        PalindromeCheck obj = new PalindromeCheck();
        obj.isPalindrome(str);

        if (obj.isPalindrome(str)) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The String is not Palindrome");
        }
    }

}
