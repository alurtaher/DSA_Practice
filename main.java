import java.util.*;

public class main {

     public static void main(String[] args) {
        
        int xy[] = {1,2,1,3,5,6,4};
        System.out.println(Question4(xy));
    }
     public static int Question1(String str[]){
        int max = -1;
        int index = -1;
        for(int i=0;i<str.length;i++){
            if(countA(str[i]) > max){
                max = countA(str[i]);
                index = i;
            }
        }
        return index;
     }
     // Supporting Method for 1st Question
      static int countA(String str){
        int count = 0;
        for(int e:str.toCharArray())if(e == 'a')count++;
        return count;
      }

      public static int Question2(int arr[][]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int currMax = 0;
            for(int j=0 ;j<arr[0].length;j++)currMax+=arr[i][j];
            max = Integer.max(max, currMax);
        }
        return max;
      }


    public static int Question3(int arr[]){
        int n = arr.length;
        int majorityElement =-1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int e:arr){
            if(map.containsKey(e)){
                map.put(e, map.get(e)+1);
            }
            else map.put(e,1);
        }
        for(int e:map.keySet()){
            if(map.get(e) > n/2)majorityElement = e;
        }
        return majorityElement;
    }

    public static int Question4(int arr[]){
        int n = arr.length;
        int max= -1;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1])max = i;
        }
        return max;
    }


}