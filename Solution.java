import java.util.*;

public class Solution {

     public static void main(String[] args) {
       int  arr[] = {1, 2, 3, 4}, x = 3;
       System.out.println(search(arr, x));
    }
    static int search(int arr[], int x) {

        // Your code here
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)return i;
        }
        return -1;
    }
   
}