/*
* @Author: KarloSiric
* @Date:   2024-04-18 18:02:09
* @Last Modified by:   KarloSiric
* @Last Modified time: 2024-04-18 18:17:41
*/

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class exercise2 {
    
    public static void main(String[] args) {
        // in this exercise I will try to calculate the average of a list of numbers that are randomly going to be stored values
        // let's get started...

        // first we need to create a container for those random numbers that will be stored!
        // we can store them inside a list
        
        Integer[] nums = new Integer[100]; // we are creating an array of 100 integers!
        
        for(int i = 0; i < nums.length; i++) {
            // generating random numbers!
            Random rand = new Random();
            nums[i] = rand.nextInt(100);
            System.out.println(nums[i]); // for checking purposes!
        }
        
        List<Integer> intList = Arrays.asList(nums);
        System.out.println(intList); // okay it works
        
        // now let's calculate the average using streams!
        double average = intList.stream().mapToInt(val -> val).average().orElse(0);
        System.out.println("Averge of random generated numbers is " + average);
        
    }
}