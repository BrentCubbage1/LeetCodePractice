package Questions.DetermineIfTwoStringsAreClose;

import java.util.*;

public class CloseStrings {

    public boolean closeStrings(String word1, String word2) {
        //Since we can swap as many times as we need to.
        //for Operation 1, we just need to check if the words sorted into order are the same.
        //Because we can change the order of letters as many times as needed, we can get them into a sorted order.
        //We can change the string to a char array so we can take advantage of the Arrays.sort().
        //We had made a helper method to simulate this but it proved to be unnecessary.

        //For operation two, you can swap all instances of any letter with another and vice-versa.
        //Again, we can do this as many times as necessary.
        //So to check if this works, I want to check that both
        //1. The word has the same letters and
        //2. The word has the same ratios of letters ex: "cabbba" and "abbccc" both have letters in ratios of 1, 2 and 3.

        //two lists are created as I wanted to hold the ratios of the letters occuring in them.
        //back to point 2 above, it does not matter which letters have which ratios but that the ratios are equal, which we will compare in a list.
        List<Integer> ratiosList1 = new ArrayList<>();
        List<Integer> ratiosList2 = new ArrayList<>();

        //We make two maps, and use for loops to populate them with the letters and the number of occurences.
        //We also make a boolean charSwapper to hold our return result.
        boolean charSwapper = true;

        Map<Character, Integer> letterMap1 = new HashMap<>();
        Map<Character, Integer> letterMap2 = new HashMap<>();

        for(int i = 0; i < word1.length(); i++){
            char checkLetter = word1.charAt(i);

            if(letterMap1.containsKey(checkLetter)){
                letterMap1.replace(checkLetter, letterMap1.get(checkLetter) + 1);
            } else {
                letterMap1.put(checkLetter, 1);
            }
        }

        for(int i = 0; i < word2.length(); i++){
            char checkLetter = word2.charAt(i);

            if(letterMap2.containsKey(checkLetter)){
                letterMap2.replace(checkLetter, letterMap2.get(checkLetter) + 1);
            } else {
                letterMap2.put(checkLetter, 1);
            }
        }
        //Use of map entryset loops here to go through each map entry to do two things.
        //1. Check if the other string contains a matching letter(key) from the prior one
        //2. adding the value (ratio) to the ratio list for value comparison
        for(Map.Entry<Character, Integer> entry : letterMap1.entrySet()){

            Character letter = entry.getKey();
            Integer amount = entry.getValue();
            ratiosList1.add(amount);

            if(!letterMap2.containsKey(letter)){
                charSwapper = false;
                break;
            }
        }

        for(Map.Entry<Character, Integer> entry : letterMap2.entrySet()){

            Character letter = entry.getKey();
            Integer amount = entry.getValue();
            ratiosList2.add(amount);

            if(!letterMap1.containsKey(letter)){
                charSwapper = false;
                break;
            }
        }

        //sort our ratio lists for easier comparison.
        Collections.sort(ratiosList1);
        Collections.sort(ratiosList2);

        //Now that the lists are sorted, they should have matching elements if this is, so we just check if the two are equal.
        if(!ratiosList1.equals(ratiosList2)){
            charSwapper = false;
        }


        return charSwapper;
    }
}
