
public class demo1Binary {
    public static void main(String[] args) {
        int[] numArr = {1, 3, 5, 8, 9, 10, 11, 15, 19, 20};
        int target = 19;

        System.out.println("Target number is at index: " + findNum(target, numArr));
    }
    
    // // Binary search using for loop
    // public static int findNum(int target, int[] arr){
    //     int start = 0;
    //     int end = arr.length-1;

    //     if(arr.length == 0){
    //         return -1;
    //     }

    //     for (int i = 0; i < arr.length; i++) {
    //         int mid = start + (end - start)/2;
    //         if(target < arr[mid]){
    //             end = mid - 1;
    //         }
    //         else if(target > arr[mid]){
    //             start = mid + 1;
    //         }
    //         else{
    //             return mid;
    //         }
    //     }

    //     return -1;
    // }

     // Binary search using while loop
     public static int findNum(int target, int[] arr){
        int start = 0;
        int end = arr.length-1;

        if(arr.length == 0){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        

        return -1;
    }
}
