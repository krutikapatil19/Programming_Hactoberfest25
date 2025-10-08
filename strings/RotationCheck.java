public class RotationCheck {
    public static void main(String [] args){
        String str1="Apple".toLowerCase();
        String str2="pleap".toLowerCase();

        //checking if the lengths of string are equal 
        if(str1.length() != str2.length()){
            System.out.println("The strings are not rotations of each other");      //strings are not rotation , if the length of both strings differ
        }else {
            String combined = str1+str1;                                               // if length of both strings matches , then we append str1+str1 , as it contains all possible rotations 

            if (combined.contains(str2)){                                               //we check if str+str1 contains (str2) , if yes , then its a rotation of str1.
                System.out.println("Strings are rotation of each other!");
            }else{
                System.out.println("Strings are not rotation of each other!");
            }

        }
    }
    
}
