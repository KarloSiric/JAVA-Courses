/*
* @Author: KarloSiric
* @Date:   2024-04-18 18:17:58
* @Last Modified by:   KarloSiric
* @Last Modified time: 2024-04-18 18:29:15
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise3 {
    
    
    public static void main(String[] args) {
        // Writing a program to convert a list of strings to upper case or lower case using streams
        // first upper case then lower case
        
        String[] string = {"hello", "wow", "GREAT", "cool", "WHAT is that", "I am The Best", "GOD is everything"};
        List<String> strings = Arrays.asList(string);    
        
        // converting now to lower case using stream!
        // we convert them and then place them into a new empty list!
        
        List<String> lowers = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Lowercase strings " + lowers);
        
        List<String> uppers = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase strings " + uppers);
        // System.out.println(strings);
    }
}