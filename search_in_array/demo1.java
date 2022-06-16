public class demo1{
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 2, 19, 0, 11};

        int target = 7;

        System.out.println("The " + target + " is located at index " + findIndex(target, arr) + " of the array.");
    }

    public static int findIndex(int target, int[] arr){
        // return -1 if array length is 0
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}