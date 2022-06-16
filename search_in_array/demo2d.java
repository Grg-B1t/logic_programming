
public class demo2d {
    public static void main(String[] args) {
        int[][] num2d = {{54, 545, 7546, 12, 455, 52},{24, 47, 543, 545, 719, 89}, {25, 45, 76}};

        int target = 76;

     //   System.out.println("Index: " + Arrays.toString(findIndex(target, num2d)));
    //  System.out.println("maximum number: " + findMaxValue(num2d));
    System.out.println("number of even digits number: "  + numOfEvenDigits(num2d));

    }

    public static int[] findIndex(int target, int[][] arr){
        int[] index = {-1, -1};
        if(arr.length == 0){
            return index;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    index[0] = i;
                    index[1] = j;
                    return new int[]{i, j};
                }
            }
        }
        return index;
    }

    public static int findMaxValue(int[][] arr){
        int max = arr[0][0];
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    // Find if number of digits are even or odd
    public static int numOfEvenDigits(int[][] arr){
       int count = 0;
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(demo4.isEven(arr[i][j])){
                    count++;
                }
            }
        }

        return count;
    }
}
