package Questions.JosephusPerutation;

import java.util.ArrayList;
import java.util.List;

public class JosephusPermutation {
     public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
            int counter = 0;
            int countBy = k - 1;
            List<T> itemsList = new ArrayList(items);
            List<T> result = new ArrayList();

            while(itemsList.size() >= 1){
                counter += countBy;

                while (counter >= itemsList.size()){
                    counter = counter - itemsList.size();
                }

                result.add(itemsList.get(counter));
                itemsList.remove(counter);
            }

            return result;
        }
}
