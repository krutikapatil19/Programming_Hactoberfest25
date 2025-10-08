import java.util.*;
public class RemoveSpaces {
    public static void removeWhiteSpaces(){

        //Scanner sc = new Scanner(System.in);                  //used in case , when input is to be taken from user.                    
        String str = "Computer Engineering";
        StringBuilder result = new StringBuilder();

        for(int i = 0; i<str.length(); i++){
            if (str.charAt(i) != ' '){
                result.append(str.charAt(i));
            }
        }
        System.out.println(result);
    }
    public static void main(String [] args) {
        RemoveSpaces.removeWhiteSpaces();
    }
}

//str.replace(" ", "") - this is also a method by which we can replace every space with an empty string.