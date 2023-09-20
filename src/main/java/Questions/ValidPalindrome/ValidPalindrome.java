package Questions.ValidPalindrome;

public class ValidPalindrome {

    //It's static just to work in the leetcode IDE

    public static boolean inAlphabet(char c){
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";

        return alphabet.contains(String.valueOf(c));

    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        char[] an = s.toLowerCase().toCharArray();
        for (int i = 0; i < an.length; i++){
            char check = an[i];
            if (inAlphabet(check)){
                sb.append(check);
            }
        }
        return sb.toString().equals(sb.reverse().toString());

    }
}
