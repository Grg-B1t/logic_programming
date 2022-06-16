public class demo5 {
    public static void main(String[] args) {
        int target = 9;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("The index of " + target + " is: " + findTargetIndex(target, arr));
    }

    public static int findTargetIndex(int target, int[] arr){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            System.out.println( start + " and " + end);

                int temp = end + 1;
                end = end + (end - start + 1) * 2;
                start = temp;
        }
        System.out.println( start + " and " + end);

        return findIndex(target, arr, start, end);
    }

    public static int findIndex(int target, int[] arr, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

}
