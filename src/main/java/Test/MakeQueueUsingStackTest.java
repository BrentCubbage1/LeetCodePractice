package Test;

import Questions.MakeQueueUsingStack.MyQueue;
import org.junit.Assert;
import org.junit.Test;

public class MakeQueueUsingStackTest {


    @Test
   public void makeQueueUsingStackTest() {
        //given
        MyQueue myQueue = new MyQueue();

        //when
        myQueue.push(1);  // Queue: [1]
        myQueue.push(2);  // Queue: [1, 2]

        //then
        Assert.assertEquals(1, myQueue.peek());  // Peek: 1
        Assert.assertEquals(1, myQueue.pop());  // Pop: 1, Queue: [2]
        Assert.assertFalse(myQueue.empty());  // Not empty: false
    }

    @Test
    public void makeQueueUsingStackEmptyTest() {
        // Given
        MyQueue myQueue = new MyQueue();

        // When
        myQueue.push(1);  // Queue: [1]
        myQueue.push(2);  // Queue: [1, 2]

        // Then
        Assert.assertEquals(1, myQueue.pop());  // Pop: 1, Queue: [2]
        Assert.assertEquals(2, myQueue.pop());  // Pop: 2, Queue: []
        Assert.assertTrue(myQueue.empty());  // Queue is empty: true
    }

}
