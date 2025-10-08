import java.util.Scanner;
public class PasswordValidator {
    

    //Function to check if password is valid
    public static int CheckPassword(String str, int n) {

        //Rule1.Password must be atleast 4 characters long
        if(n<4) {
            return 0;                       //not valid
        }

        //2.First character should not be a digit
        if(Character.isDigit(str.charAt(0))){
            return 0;                       //not valid
        }

        //Variables to check conditions
        boolean hasDigit = false;          //to check if digit is present
        boolean hasUpper = false;         //to check if capital letter is present

        //3.Loop through each character of the password
        for(int i =0; i<n; i++) {
            char ch = str.charAt(i);

        //4.If space or slash is found -> invalid
            if(ch == ' ' || ch == '/') {
                return 0;
            }
            
            //If a digit is found -> mark true
            if(Character.isDigit(ch)) {
                hasDigit = true;
            }
            //at least one uppercase
            if(Character.isUpperCase(ch)) {
                hasUpper = true;
            }
        }
        //4.After loop, check if digit and capital letter werefound
        if(hasDigit && hasUpper) {
            return 1;                               //valid password
        }

        return 0;                                   //not valid if any condition missing
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //take input
        System.out.println("Enter your password : ");
        String password = sc.nextLine();            //read full password
        sc.close();

        int result = CheckPassword(password, password.length());
        if (result == 1)
            System.out.println("Password is valid!");
        else 
            System.out.println("Password is invalid!");
    }
}
