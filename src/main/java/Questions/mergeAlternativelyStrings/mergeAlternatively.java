package Questions.mergeAlternativelyStrings;

import java.util.*;

public class mergeAlternatively {

    public String mergeAlternately(String word1, String word2) {

        int word1Length = word1.length();
        int word2Length = word2.length();

        int commonLength = Math.min(word1Length, word2Length);

        List<Character> word1List = new ArrayList();
        for (Character c : word1.toCharArray()){
            word1List.add(c);
        }

        List<Character> word2List = new ArrayList();
        for (Character c : word2.toCharArray()){
            word2List.add(c);
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < commonLength; i++){
            result.append(word1List.get(0));
            result.append(word2List.get(0));
            word1List.remove(0);
            word2List.remove(0);
        }

        if(word1Length > word2Length){
            while(word1List.size() != 0){
                result.append(word1List.get(0));
                word1List.remove(0);
            }
        }
        if(word1Length < word2Length){
            while(word2List.size() != 0){
                result.append(word2List.get(0));
                word2List.remove(0);
            }
        }

        return result.toString();


        /** An alternate solution that is way shorter than mine.
         * Counts the same minimum and adds the character at each spot in the loop.
         * After we have hit the length of the shorter string, appends a substring of the remaining string length.
         *
         *  public String mergeAlternately(String word1, String word2) {
         *
         *         StringBuilder result = new StringBuilder(word1.length() + word2.length());
         *
         *         int minLength = Math.min(word1.length(), word2.length());
         *
         *         for (int i = 0; i < minLength; i++) {
         *             result.append(word1.charAt(i)).append(word2.charAt(i));
         *         }
         *
         *         result.append(word1.substring(minLength)).append(word2.substring(minLength));
         *
         *         return result.toString();
         *     }*/

    }
}
