public class RemoveDuplicateCharacters {
    public static void main(String [] args){

        String str = "Krutika".toLowerCase();
        StringBuilder result = new StringBuilder();

        int freq[] = new int[256];
        boolean[] seen = new boolean[256]; 

        for(int i = 0 ; i<str.length(); i++){
        char ch = str.charAt(i);
        if (!seen[ch]) {
            seen[ch] = true;
            result.append(ch);
        }
            
        }
            System.out.println("The String after removing the duplicates is :" + result.toString());
        }
    }
    

