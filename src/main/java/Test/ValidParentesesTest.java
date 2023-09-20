package Test;

import Questions.ValidParenteses.Parenteses;
import org.junit.Assert;
import org.junit.Test;

public class ValidParentesesTest {

    @Test
   public void ValidParentesesTest1(){
        //Given the string (){}[]
        //This should be a valid Parenteses string
        //As all open brackets close properly.
        Parenteses tester = new Parenteses();
        String given = "(){}[]";

        Assert.assertTrue(tester.isValid(given));
    }

    @Test
    public void ValidParentesesTest2(){
        //Given the string (){]}[
        //This should NOT be a valid Parenteses string
        //As all open brackets do not close properly.
        Parenteses tester = new Parenteses();
        String given = "(){]}[";

        Assert.assertFalse(tester.isValid(given));
    }
}
