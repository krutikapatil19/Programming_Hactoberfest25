public class ToggleCase {
    public static void main(String[] args){

        String str = "Krutika Patil";
        StringBuilder result = new StringBuilder();         //to store final output
        
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);                        //to get each character 


           if (Character.isUpperCase(ch)){
            result.append(Character.toLowerCase(ch));       //when its uppercase ,converting to lowercase

            }else if (Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }else{
                result.append(ch);                          // just in case its a symbol or space 
            }
           }
           System.out.println("The Toggled Case String is :" + result.toString());
        }
    }
    

