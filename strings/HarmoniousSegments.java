 //Find the number of substrings where the count of vowels and consonants are equal, and their product is divisible by a given number
 public class HarmoniousSegments {
    public static int countHarmoniousSegments(String[] input) {
        String s = input[0];
        int k = Integer.parseInt(input[1]);                                             //It converts a number string for ex."2" (which is a string) into an integer 
        int count = 0;

        for(int i = 0; i<s.length(); i++) {                                             //outer for loop  //chooses the start of the substring 
            int vowels = 0, consonants = 0;

            for(int j = i; j<s.length(); j++) {                                         //inner for loop  //from the current start point i , it adds one character at a time to expand the substring further
                char ch = s.charAt(j);                                                      
                if (isVowel(ch)) vowels++;
                else consonants++;
            
                if(vowels == consonants && (vowels*consonants) % k == 0){               //if the number of vowels and consonants are equal ,and (vowels*consonants) is divisible by the given number "k", then add that substring and increase count.
                    count++;
                }
            }
        }
        return count;
    }
 
    public static boolean isVowel(char ch) {  
        int index = "aeiouAEIOU".indexOf(ch);                                           //checks if the given character ch is inside the given letters (aeiouAEIOU)
        if (index != -1) {                                                              //it means the character is a vowel
            return true;
        } else {                                                                        //the character is not a  vowel
        return false;
        }     
    }                                
        public static void main(String[] args) {
        System.out.println(countHarmoniousSegments(new String[]{"baeyh", "2"}));
        System.out.println(countHarmoniousSegments(new String[]{"bcdf", "1"}));
    }
}
 