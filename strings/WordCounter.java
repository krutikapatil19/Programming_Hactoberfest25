public class WordCounter {
    public static void countWords(String sentence) {
        sentence = sentence.trim();                         //remove unwanted spaces from start and end of the sentence

        if(sentence.isEmpty()) {                            //if the string is empty after trimming , it has no words
            System.out.println("Words: 0");               //if string is empty , we directly print 0 and stop further code using return
        return;        
    }

    String[] words = sentence.split("\\s+");          //Split wherever you find one or more spaces (tabs, multiple spaces)
    System.out.println("Words:" + words.length);            //print the number of elements in the words array
    }

    public static void main(String[] args) {
        String str = " This is a code to count words in sentence" ;
        countWords(str);
    }
}

