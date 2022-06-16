public class demo3 {
    public static void main(String[] args) {
       
        int target = 22;
        int[] range = {2, 4};
        int[] arr = {13, 11, 22, 10, 56, 20, 19, 17, 3};

     //   System.out.println("The minimum value in the array is : " + findMin(arr));
        System.out.println("The index of " + target + " from " + range[0] + " to " + range[1] + " is " + findInRange(target, range, arr));
        System.out.println("The maximum value in the array is : " + findMax(arr));
    }

    // Method to return minimum value
    public static int findMin(int[] arr){
        
        int min = arr[0];

        // if array length is 0, return -1;
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    // Method to return maximim value
    public static int findMax(int[] arr){
        
        int max = arr[0];

        // if array length is 0, return -1;
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //Find targeted value in an with given range
    public static int findInRange(int target, int[] range, int[] arr){
        if(arr.length == 0){
            return -1;
        }

        for (int i = range[0]; i <= range[1]; i++) {
            if(target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
