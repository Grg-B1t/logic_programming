import java.util.Arrays;

public class demo8 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 8, 8, 8, 9, 10};
        int target = 8;

        System.out.println(Arrays.toString(findStartEnd(target, arr)));
    }

    public static int[] findStartEnd(int target, int[] arr){
        int start = firstOccurance(arr, target, true);
        int end = firstOccurance(arr, target, false);

        return new int[]{start, end};
    }

    public static int firstOccurance(int[] arr, int target, boolean b){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                ans = mid;
                if(b){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
