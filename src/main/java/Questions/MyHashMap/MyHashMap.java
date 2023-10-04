package Questions.MyHashMap;

import java.util.ArrayList;

public class MyHashMap {

    private ArrayList<int[]> mapPairs;

    public MyHashMap() {
        this.mapPairs = new ArrayList<>();
    }

    public void put(int key, int value) {
        int[] newPair = new int[]{key, value};
        boolean exists = false;

        for (int i = 0; i < mapPairs.size(); i++){
            int[] pair = mapPairs.get(i);
            if (pair[0] == key){
                mapPairs.set(i, newPair);
                exists = true;
                break;
            }
        }
        if (!exists){
            mapPairs.add(new int[]{key, value});
        }
    }

    public int get(int key) {
        int result = -1;

        for(int i = 0; i < mapPairs.size(); i++){
            int[] pair = mapPairs.get(i);
            if (pair[0] == key){
                result = pair[1];
                return result;
            }
        }
        return result;

    }

    public void remove(int key) {

        for(int i = 0; i < mapPairs.size(); i++){
            int[] pair = mapPairs.get(i);
            if (pair[0] == key){
                mapPairs.remove(i);
            }
        }

    }
}
