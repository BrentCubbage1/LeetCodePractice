package Test;

import Questions.LongestPalindromicSubstring.LongestPalindromicSubstring;
import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {


    @Test
    public void LongestPalindromicSubstringTest(){
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();

        String testString = "cbbd";
        String expected = "bb";

        String actual = test.longestPalindrome(testString);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTest(){
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();



        Assert.assertTrue( test.isPalindrome("racecar"));
        Assert.assertFalse(test.isPalindrome("zebra"));
    }
}
