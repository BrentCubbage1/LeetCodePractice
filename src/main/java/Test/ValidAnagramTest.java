package Test;

import Questions.ValidAnagram.ValidAnagram;
import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {

    @Test
    public void testIsAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();

        Assert.assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testIsNotAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();

        Assert.assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}
