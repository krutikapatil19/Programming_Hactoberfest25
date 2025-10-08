public class MaximumFrequencyCharacter {
    public static void main(String [] args){
        String str = "KrutikaVilasPatil".toLowerCase();

        int[] freq = new int[256];              //ASCII size 

        for(int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);            //the character at ith position , or current character 
            freq[ch]++;                         //increment frequency count for that charcater if it appears in future 
        }

        //step 2 : finding highest frequency 

        int maxFreq = 0;                        //assuming the max is 0 and comparing with each character to find the actual max
        for(int i = 0 ; i<freq.length; i++){
            if( freq[i]> maxFreq){
                maxFreq = freq[i];
            };
        }

        //applying loop to print all the numbers which have the maximum frequency

        System.out.print("The Character with maximum frequency is : ");
        for(int i = 0 ; i<freq.length; i++){
            if (freq[i] == maxFreq && Character.isLetter((char) i))       //to check the character at i has max frequency && checks if the character is alphabet , not anything like _ - spaces 
        
        System.out.print((char) i + " ");
        }
        System.out.println( "\nFrequency:"   +  maxFreq);
    }
}
