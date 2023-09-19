package SortTheOddNumbers;

public class SortTheOddNumbers {

    public static boolean isOdd (int num){
        return num % 2 == 1;
    }
    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++){
            if (isOdd(array[i])){

                for (int j = i + 1; j < array.length; j++){

                    if (isOdd(array[j]) && array[i] > array[j] ){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }

}
