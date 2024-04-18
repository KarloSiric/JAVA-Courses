/*
* @Author: KarloSiric
* @Date:   2024-04-18 18:29:35
* @Last Modified by:   KarloSiric
* @Last Modified time: 2024-04-18 18:46:35
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class exercise4 {
    
    
    
    public static void main(String[] args) {
        // now we will calculate the sum of all the even and odd number in the list
        
        Integer[] nums = new Integer[100];
        for (int i = 0; i < nums.length; i++) {
            Random rand = new Random();
            nums[i] = rand.nextInt(100);
            System.out.println("Printing 100 random numbers...");
            System.out.println("Random number " + i + " is " + nums[i]);
        }
        
        // seeing which are odd and which are even and adding them to some other list
        
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        
        for (int number : nums ) {
            if(number % 2 == 0) 
                evens.add(number);
            else 
                odds.add(number);
        }
        System.out.println("Odds are " + odds);
        System.out.println("Evens are " + evens);
        
        // calculating now using streams!
        double oddSum = odds.stream().mapToInt(val -> val).sum();
        double evenSum = evens.stream().mapToInt(val -> val).sum();
        System.out.println("Odds sum " + oddSum);   
        System.out.println("Evens sum " + evenSum);
        if(oddSum < evenSum) 
            System.out.println("Evens sum is greater than odds sum!");
        else 
            System.out.println("Odds sum is greater than evens sum!");
        
    }
}