public class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        // Split the string by spaces
        String[] words = s.split("\\s+");
        // Use StringBuilder to reverse the words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
