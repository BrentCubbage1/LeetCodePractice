package Questions.StairCase;

public class StairCase {


    public static void staircase(int n) {


        int spaces = n;
        while (spaces > 0) {

            String print = "";

            for (int i = 0; i < spaces - 1; i++) {
                print += " ";
            }

            for (int i = n; i > spaces - 1; i--) {
                print += "#";
            }

            spaces -= 1;
            System.out.println(print);

            print = "";

        }

    }

}
