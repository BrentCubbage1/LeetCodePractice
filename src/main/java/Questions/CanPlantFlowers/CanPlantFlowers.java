package Questions.CanPlantFlowers;

public class CanPlantFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n <= 1){
            return true;
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
        }

        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
            flowerbed[flowerbed.length - 1] = 1;
            n--;
        }

        for (int i = 1; i < flowerbed.length - 1; i++){
            if (flowerbed[i] == 0){
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }
}
