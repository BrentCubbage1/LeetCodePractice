package Questions.HighestScoringWord;

public class HighestScoringWord {

    public static String high(String s) {

        String[] theWords = s.split(" ");

        int highIndex = 0;
        int highCount = 0;

        for(int i = 0; i < theWords.length; i++){
            String word = theWords[i];
            int count = 0;

            for(int j = 0; j < word.length(); j++){
                count +=  (int) word.charAt(j) - 96;
            }

            if (count > highCount){
                highCount = count;
                highIndex = i;
            }
        }

        return theWords[highIndex];
    }

}
