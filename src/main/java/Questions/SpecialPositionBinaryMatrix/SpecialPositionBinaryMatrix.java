package Questions.SpecialPositionBinaryMatrix;

public class SpecialPositionBinaryMatrix {

    public int numSpecial(int[][] mat) {

        int rowLength = mat.length;
        int columnLength = mat[0].length;
        int specialCharacter = 1;
        int result = 0;

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < columnLength; j++){
                int checkedChar = mat[i][j];

                if(checkedChar == specialCharacter && isSpecial(mat, i, j)){
                    result++;
                }
            }
        }

        return result;
    }


    public boolean isSpecial(int[][] mat, int m, int n){

        int rowLength = mat.length;
        int columnLength = mat[0].length;
        int specialCharacter = 1;

        //mat, 1, 2

        for (int i = 0; i < rowLength; i++){
            int checkedPosition = mat[m][i];

            if(checkedPosition == specialCharacter && i != n){
                return false;
            }
        }

        for (int j = 0; j < columnLength; j++){
            int checkedPositionTwo = mat[j][n];

            if (checkedPositionTwo == specialCharacter && j != m){
                return false;
            }
        }

        return true;
    }
}
