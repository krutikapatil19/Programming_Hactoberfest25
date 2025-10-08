public class StrStrImplementation {
    public int strStr(String haystack, String needle){
        int hLen = haystack.length();
        int nLen = needle.length();

        if(nLen == 0 ) return 0 ;                                       //if needle is empty

        for(int i =0; i< hLen - nLen; i++){                             //loop where needle can fit  
            if(haystack.substring(i , i+ nLen).equals(needle)){
                return i ;
            }
        }
        return -1;                                                       //if needle not found
    }
        public static void main(String[] args){
            String haystack = "leetcode";
            String needle = "code";

            StrStrImplementation obj = new StrStrImplementation();
            int result = obj.strStr(haystack , needle);
            System.out.println("Index of substring: " + result);

        }
    }

