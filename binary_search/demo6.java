public class demo6 {
    public static void main(String[] args) {
        int[] arr = {20, 19,18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 5;
        System.out.println(arr[15]);
        System.out.println( findTargetIndex(target, arr));
    }

    public static int findTargetIndex(int target, int[] arr){
       int start = 0;
       int end = arr.length-1;
        if(arr.length == 0){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                start = mid + 1;
            }
            else if(target > arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}
