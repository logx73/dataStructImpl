package algorithms;

import java.util.Arrays;

public class SlidingWindowUseCase {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        //Find the sum of all subarrays of length k
        Arrays.stream(findSumSubArrays(arr, 3)).forEach(System.out::println);
        //Find the minimum sum of elements greater than equal to x



    }

    static int[] findSumDynamicSubArray(int[] arr, int x){
        int start = 0;
        int end = 0;
        int length = arr.length;
        int sum = 0;
        int minLength = 0;
        while (end < length){
            sum = sum + arr[end];
            end++;
            minLength++;
            while (start < end && sum >= x) {
                sum = sum - arr[start];
                start++;
            }


        }
        return arr;
    }

    static int[] findSumSubArrays(int[] arr, int k){

        int sum = 0;
        int j = 0 ;
        int[] sumarr = new int[(arr.length/k)*k];

        for(int i=0;i<arr.length;i++){
            if(i == k){
                sumarr[j++] = sum;
            }
            if(i < k){
                sum = sum + arr[i];
            }else {
                sum = sum + arr[i] - arr[i-k];
                sumarr[j++] = sum;
            }
        }
        return sumarr;
    }
}
