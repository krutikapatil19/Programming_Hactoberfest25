//I've solved this problem using the sorting approach .
//It can also be solved using the HashMap , I've mentioned that one in the Hashing Folder
import java.util.Arrays;
public class AnagramCheck{
    public static boolean isAnagram(String str1, String str2) {

        //If lengths are not equal ,the strings cant't be anagrams
        if(str1.length() != str2.length()) return false;

        //convert strings to lowercase and then to char arrays 
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Return true if both sorted arrays of strings have same character in same order 
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args){
        String str1 = "silent";
        String str2 = "listens";

        if(isAnagram(str1, str2)) {
           System.out.println("Strings are anagram"); 
        }else {
            System.out.println("Strings are not anagram");
        }

    }
}
    

