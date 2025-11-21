public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        int x = word.length();
        while (x > 0){
           word = word.substring(0, x -1) + "\n" + word.substring(x -1);
           x --;
        }
        return word;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String backword = "";
        int x = word.length();
        while (x > 0){
           backword += word.substring(x - 1, x);
           x --;
        }
        return backword;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        String capletter = sentence.substring(0,1);
        String newSentence = capletter.toUpperCase() + sentence.substring(1);
        while (sentence.indexOf(" ") != -1 ){
           capletter = sentence.substring(sentence.indexOf(" ") + 1, sentence.indexOf(" ") + 2);
           newSentence = newSentence.substring(0 , sentence.indexOf(" ") + 1) + capletter.toUpperCase() + sentence.substring(sentence.indexOf(" ") + 2);
           sentence = sentence.substring(0 , sentence.indexOf(" ")) + "*" + sentence.substring(sentence.indexOf(" ") + 1);
        }
        return newSentence;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        String backWord = reverseWord(word);
        return (word.toLowerCase().equals(backWord.toLowerCase()));
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static String firstUniqueChar(String word) {
        // TODO: Implement this method
        String test = "";
        int x = 1;
        int y = 1;
        while( x <= word.length()){
           test = word.substring(x - 1,x);
           while(y <= word.length()){
              if(test.equals(word.substring(y - 1, y))){
                 x++;
                 y = word.length() + 1;
              } else if(y == word.length()){
                 return test;
              }
              y++;
           }
           
        }
                
        return " ";
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        // Example:
         System.out.println(printCharacters("Shiggle"));

        System.out.println("\nTesting reverseWord:");
        // Example:
         System.out.println(reverseWord("ShLoGglE"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        System.out.println(capitalizeString("shrimple dimple doodle froodle"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        System.out.println(detectPalindrome("TAcocat"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        System.out.println(firstUniqueChar("swiss"));
    }
}
