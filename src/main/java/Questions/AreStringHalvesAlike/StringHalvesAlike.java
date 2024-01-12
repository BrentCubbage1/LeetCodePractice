package Questions.AreStringHalvesAlike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringHalvesAlike {

    public boolean halvesAreAlike(String s) {

        //1. We need the first and second half of the string.
        //2. Then we count through the two strings.
        //3. Remember that vowels can be lowercase or uppercase.
        //4. if each letter is a vowel, add to counter.
        //5. return aCount == bCount.

        //1.
        int split = s.length() / 2;

        String a = s.substring(0, split);
        String b = s.substring(split, s.length());
        int aCount = 0;
        int bCount = 0;

        //3.
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u', 'A','E', 'I','O','U'));

        //2.
        for (int i = 0; i < a.length(); i++){
            Character charA = a.charAt(i);
            Character charB = b.charAt(i);

            //4.
            if(vowels.contains(charA)){
                aCount++;
            }

            if(vowels.contains(charB)){
                bCount++;
            }
        }

        //5.
        return aCount == bCount;

    }
}
