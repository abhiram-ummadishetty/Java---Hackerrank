*** COPY PASTE THE LINK GIVEN BELOW ***

https://www.hackerrank.com/challenges/java-end-of-file/problem

***************************************

ANSWER

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
   int i = 0;
   while(scan.hasNext()){
       i++;
       System.out.println(i + " " + scan.nextLine());
       
    }
}
}
