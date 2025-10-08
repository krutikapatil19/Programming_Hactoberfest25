//Find the Longest Common Prefix among a group of strings
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";                                            //if array is empty , return empty prefix
        String prefix = strs[0];                                                    //starts with the first word as the prefix

        for(int i = 1; i< strs.length; i++) {                                       //keep reducing prefix until it matches the start of current word
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() -1);        //cut last char from prefix
                if(prefix.isEmpty()) return "";                                     //if nothing left , return empty 
            }
        }
        return prefix;          
    }
    public static void main(String[] args) {
        String[] input = {"flower","flow","flowingwater"};                         //input words
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String result = obj.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: "+ result);  
    }
    }

