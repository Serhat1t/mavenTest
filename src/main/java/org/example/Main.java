package org.example;

public class Main {
   public int largest(int[]arr){
       int i;
       int max=arr[0];
       for(i=1;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
       return max;
   }
}