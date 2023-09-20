package Questions.ValidParenteses;

import java.util.Stack;

public class Parenteses {

    public boolean isValid(String s) {

        if (s.length() < 2 || s.length() % 2 == 1){
            return false;
        }
        //So I'm going to hold the contents in a Stack.
        //Because Stack is LIFO, we will be able to check the close to the last open that was listed.
        //And if its the wrong open, we can return false
        Stack<Character> theStack = new Stack<>();

        //I hard coded each option because there are only 6 and I couldnt think of a cleaner way.
        Character regOpen = '(';
        Character braceOpen = '[';
        Character curlyOpen = '{';
        Character regClose = ')';
        Character braceClose = ']';
        Character curlyClose = '}';

        //Loop through the string.
        for (int i = 0; i < s.length(); i++){
            Character current = s.charAt(i);

            if ( i == 0) {
                if (current == regClose || current == braceClose || current == curlyClose) {
                    return false;
                }
            }



            //If the character at index i is an open bracket, put it on the stack
            if (current == regOpen || current == braceOpen || current == curlyOpen){
                theStack.push(current);
            }
            if ((current == regClose && theStack.isEmpty()) ||
                    (current == braceClose && theStack.isEmpty()) ||
                    (current == curlyClose && theStack.isEmpty())){
                return false;
            }

            //If the character is a closed bracket,
            // check to see if what is on the top of the stack is the matching open for it
            //if it is, take it off the stack and continue.
            // if not, end with a return false
            if (current == regClose){
                Character peek = theStack.peek();
                if (peek != regOpen){
                    return false;
                } else { theStack.pop();}
            }
            if (current == braceClose){
                Character peek = theStack.peek();
                if (peek != braceOpen){
                    return false;
                } else { theStack.pop();}
            }
            if (current == curlyClose){
                Character peek = theStack.peek();
                if (peek != curlyOpen){
                    return false;
                } else { theStack.pop();}
            }

        }

        if (!theStack.isEmpty()){
            return false;
        }
        return true;


    }


}
