//I used a frequency array(ASCII) in this code
//The same code can also be done using HashMap method , mentioned that one in Hashing Folder.
public class FirstNonRepeatingCharacter {
 public char firstNonRepeatingChar(String str){
    
    str = str.toLowerCase();                //converting input to lowercase
    int[] freq = new int[256];              //array to count frequency of characters using ASCII, 256 slots as there are 256 ASCII characters
    
        //step1:count frequency of each character
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);        //pointer used to point at current element or character
            freq[ch]++;                     //when a character appears multiple times , its count increases.
            }
            
    //Step2 : Find first non-repeating character
        for(int i =0; i<str.length(); i++){
        char ch = str.charAt(i);
        if (freq[ch] == 1) {                //checks if the frequency of the character is equal to 1 , or if the character appears only once. 
            return ch;                      //return that character immediately
        }
    }
        return '-';                         //Return '-' if no non-repeating character found 
        
    }
    public static void main(String[] args){
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();
        String str = "KrutikaPatil";
        char result = obj.firstNonRepeatingChar(str);
        System.out.println("First non-repeating character:" + result);
    }
}


    
    
    

