public class reverseString{
    public String reverse(String str){                              //method to reverse the given string
        String reversed = "";                                       //empty string to store the reversed result

        for(int i = str.length()- 1 ; i>=0 ; i--){                  //loop starts from the last character and goes till the first 
            reversed += str.charAt(i);                              //starting from the last character of string , and then concatenate the letters from the end to the front
        }
        return reversed;                                            //returns the reversed string 
    }
public static void main(String[] args){
    reverseString obj = new reverseString();                        //create object to call the method

    String str = "I love solving string questions";               //input string
    String result = obj.reverse(str);                             //call the method and store result 

    System.out.println("Original String :" + str);
    System.out.println("Reversed String: " + result);
}
}
