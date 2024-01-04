package Questions.LaserBeamsInABank;

import java.util.ArrayList;
import java.util.List;

public class LaserBeamsInABank {

    public int numberOfBeams(String[] bank) {

        //String array of binary numbers (0's and 1's)
        //1 means there is a security device, 0 means there is not.
        //There is a laser beam between two devices if the row of device 1 < row of device 2
        //For each row (i) where row 1 < i < row 2, there are no security devices on that row.
        //Laser beams do not interfere with one another, they CAN cross.

        //ex: bank = ["011001",
        //            "000000",
        //            "010100",
        //            "001000"]
        //answer: 8.

        //Make a list of these strings instead of array.
        //remove all strings without 0's.

        List<String> bankList = new ArrayList<>();
        for(String b : bank){
            if (b.contains("1")){
                bankList.add(b);
            }
        }

        int result = 0;

        //Loop through each list except the last one, for each 1 in the current one, check how many 1's are in the second and add.

        //Now that we have removed all strings without 0, we loop through our rows.
        //Get the row and the row after it.
        for (int i = 0; i < bankList.size() - 1; i++){
            String bankRow = bankList.get(i);
            String bankRow2 = bankList.get(i + 1);

            //Loop through the first row, IF the character in question is a 1...
            for (int j = 0; j < bankRow.length(); j++){
                if (bankRow.charAt(j) == '1'){

                    //We loop through the second row and add a "laser" to result for every 1 in it.
                    for (int l = 0; l < bankRow2.length(); l++){
                        if (bankRow2.charAt(l) == '1'){
                            result++;
                        }
                    }


                }

            }
        }

        return result;

    }

}
