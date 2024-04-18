/*
* @Author: KarloSiric
* @Date:   2024-04-18 17:42:48
* @Last Modified by:   KarloSiric
* @Last Modified time: 2024-04-18 18:01:43
*/

// Here I will be writing exercises for java practical 3 that I have,
// I will be focusing on solving problems with lambdas, streams and threads
// First we will begin solving problems with streams then lambdas and finally threads!
// I will use sites like W3 school which has some exercises which are fun to get into these topics
// let's get started ...

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    
    // first exercise will be to write a java program to calculate an average of a list of numbers using streams!
    // later I will do that using random , which will place random numbers in the list 
    
    
    // List<Integer> integers = new ArrayList<Integer>();
    
    // List<Integer> numbers = Arrays.asList(1,50,26,12,7,39,18,17,4,7,9); // this can also be written like this
    
    // adding numbers now to this list
        
    
    
    
    
    
    public static void main(String[] args) {
        Integer[] nums = {1,50,26,12,7,39,18,17,4,7,9};
        List<Integer> integers = Arrays.asList(nums);
        
        // now we calculate the average using streams
        
        double average = integers.stream().mapToInt(val -> val).average().orElse(0);
        // double average2 = integers.stream().mapToDouble(val -> val).average().orElse(0);
        
        // here we use the list and then .stream() to convert it to to a straem
        // after that we use .mapToInt to take each value and convert it to an integer 
        System.out.println("The average is " + average);
        
        System.out.println(integers);
    }
}