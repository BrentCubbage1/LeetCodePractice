package Questions.DiagonalDifference;

import java.math.BigInteger;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diagonalOne = 0;
        int diagonalTwo = 0;
        int lastIndex = arr.size() - 1;
        for(int i = 0; i < arr.size(); i++){
            diagonalOne += arr.get(i).get(i);
            diagonalTwo += arr.get(lastIndex - i).get(i);
        }

        BigInteger integer = BigInteger.valueOf(1);

        return Math.abs(diagonalOne - diagonalTwo);

    }
}
