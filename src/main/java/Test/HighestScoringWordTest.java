package Test;

import Questions.HighestScoringWord.HighestScoringWord;
import org.junit.Test;
import org.w3c.dom.html.HTMLOptGroupElement;

import static org.junit.Assert.assertEquals;

public class HighestScoringWordTest {

    @Test
    public void testHigh() {
        String input1 = "hello world";
        assertEquals("world", HighestScoringWord.high(input1));

        String input2 = "abc 123 def";
        assertEquals("def", HighestScoringWord.high(input2));

    }
}
