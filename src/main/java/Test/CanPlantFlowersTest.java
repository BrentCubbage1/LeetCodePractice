package Test;

import Questions.CanPlantFlowers.CanPlantFlowers;
import org.junit.Assert;
import org.junit.Test;

public class CanPlantFlowersTest {


    @Test
    public void CanPlantFlowersTestOne(){
        //Example 1:
        //
        //Input: flowerbed = [1,0,0,0,1], n = 1
        //Output: true
        CanPlantFlowers planter = new CanPlantFlowers();
        int[] flowerbed = new int[]{1,0,0,0,1};
        int plantCount = 1;

        Assert.assertTrue(planter.canPlaceFlowers(flowerbed, plantCount));
    }

    @Test
    public void CanPlantFlowersTestTwo(){
        //Example 2:
        //
        //Input: flowerbed = [1,0,0,0,1], n = 2
        //Output: false
        CanPlantFlowers planter = new CanPlantFlowers();
        int[] flowerBed = new int[]{1,0,0,0,1};
        int plantCount = 2;

        Assert.assertFalse(planter.canPlaceFlowers(flowerBed, plantCount));
    }
}
