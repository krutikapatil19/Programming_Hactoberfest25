//count vowels , consonants , digits and spaces
public class countCharacters {

        public static void countCharacters(String str){
            int vowels = 0 , consonants = 0 , digits =0 , spaces = 0;
        
        for(int i =0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));                     //convert all letters to lowercase

            if(Character.isLetter(ch)) {                                        //if character is letter , then either it can be a vowel or a consonant
                if (ch =='a'||ch=='e'|| ch=='i'|| ch =='o'|| ch=='u'){
                vowels++;
                }else {
                consonants++;
            }
        }

        else if (Character.isDigit(ch)){                                        //if its a digit , then digit++
            digits++;
        }
        else if(Character.isWhitespace(ch)){                                    //if its a whitespace , then whitesp++
            spaces++;
        }
        }
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants :" + consonants);
    System.out.println("Digits:"+ digits);
    System.out.println("Spaces:"+ spaces);
    
}
public static void main(String [] args){
String str = "Hello! this is my first code of Strings in DSA ";
countCharacters(str);
}
}
