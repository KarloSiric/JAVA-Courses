/*
* @Author: KarloSiric
* @Date:   2024-04-18 18:46:56
* @Last Modified by:   KarloSiric
* @Last Modified time: 2024-04-18 23:21:18
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise5 {
    
    public static void main(String[] args) {
        // need to write a program that removes any duplicates elements from an array using streams
        
        Integer[] array = {1,2,3,1,5,3,2,6,2,7,8,8,9,5,10,11};
        
        List<Integer> arrays = Arrays.asList(array);
        
        List<Integer> result = arrays.stream().distinct().toList();
        
        System.out.println("Removed duplicates from the list");
        System.out.println("Original list contained: " + arrays);
        System.out.println("New list cotains now: " + result);
        
        
    }
}