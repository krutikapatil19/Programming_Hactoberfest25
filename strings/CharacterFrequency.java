import java.util.*;
public class CharacterFrequency {

    public static void charFrequency(String str){
    str = str.toLowerCase();
    int[] freq = new int[256];                                  //Array to store frequency , ASCII 256 possibilites

    for(int i =0; i< str.length(); i++){                        //This for loop counts the frequencies , but does not print it.
        freq[str.charAt(i)] ++;                                 //Increases the count for character at ith index.
    }

    for(int i =0; i< 256; i++) {                                //This for loop goes through all ASCII codes (0-255),only print characters that appeared.
        if (freq[i] > 0) {
            System.out.println((char)i + " : " + freq[i]);      //(char) i -converts ASCII number back to actual character.
        }
    }
}
public static void main(String[] args){
    String str = "Programming";

    charFrequency(str);                                         //calling the method
}
}
