package Questions.DetermineIfTwoStringsAreClose;

import java.util.Arrays;

public class CloseStringsTwo {

    public boolean closeStringsTwo(String word1, String word2) {
        //Separate solution I seen and needed to write down to study as it is way less complicated than the first.

        //First, if the two words are not equal length this is automatically false. check for that first.
        if (word1.length() != word2.length()){
            return false;
        }

        //We need to count the frequency of each character first.
        //Will do this by creating two arrays of 26 length, 26 representing the amount of characters in alphabet.
        //Then looping through and adding to each index of letter by minusing the character by 'a'.
        //As each char has a number value, this will give us 0-25 filled.

        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        for(int i  = 0; i < word1.length(); i++){
            frequency1[word1.charAt(i) - 'a']++;
            frequency2[word2.charAt(i) - 'a']++;
        }

        //Now, you check through all 26 elements as the same elements should be present in both.
        //So, if an element is > 0 in one, it should be > 0 in the other or we are false.

        for (int i = 0; i < 26; i++){
            if ((frequency1[i] == 0 && frequency2[i] != 0) || (frequency2[i] == 0 && frequency1[i] != 0)){
                return false;
            }
        }

        //First part accomplished. The last check confirmed we have all the same letters in the words.
        //Part two. We check if we have the same ratios of letters (to see if they are switchable to solve that way)

        //Sort the arrays. This now lines up the numbers together if they are valid close strings.
        Arrays.sort(frequency1);
        Arrays.sort(frequency2);

        //One more loop through a full alphabet array, since the ratios should be in order in both in theory, we test.
        //If one ratio at an element does not match the other ratio at same element, this is not possible return false.
        for (int i = 0; i < 26; i++){
            if (frequency1[i] != frequency2[i]){
                return false;
            }
        }

        //Now that we have confirmed both checks, mission accomplished. Return true.
        return true;






    }

}
