package Test;

import Questions.ValidPalindrome.ValidPalindrome;
import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void ValidPalindromeTest1(){
        //Input: s = "A man, a plan, a canal: Panama"
        //Output: true
        //Explanation: "amanaplanacanalpanama" is a palindrome.

        ValidPalindrome tester = new ValidPalindrome();
        String given = "A man, a plan, a canal: Panama";

        Assert.assertTrue(tester.isPalindrome(given));
    }

    @Test
    public void ValidPalindromeTest2(){
        //Input: s = "race a car"
        //Output: false
        //Explanation: "raceacar" is not a palindrome.

        ValidPalindrome tester = new ValidPalindrome();
        String given = "race a car";

        Assert.assertFalse(tester.isPalindrome(given));
    }
}
