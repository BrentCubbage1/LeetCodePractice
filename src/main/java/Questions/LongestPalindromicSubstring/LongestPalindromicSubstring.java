package Questions.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {

    public boolean isPalindrome(String str){
        String reverse = new StringBuilder(str).reverse().toString();

        return reverse.equals(str);


    }


    public String longestPalindrome(String s) {

        //solution can be faster.
        
        String result = "";


        for (int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                String sub = s.substring(i, j);

                if(isPalindrome(sub) && sub.length() > result.length()){
                    result = sub;
                }

            }
        }
        return result;




    }
}
