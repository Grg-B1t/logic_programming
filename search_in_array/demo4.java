
public class demo4 {
    public static void main(String[] args) {
        int[] arr = {123, 354, 503, 303, 4554};

        System.out.println("There are " + findNumEven(arr));


    }

    // Find of even numbers
    public static int findNumEven(int[] arr){
        int count = 0;
        for (int i : arr) {
            if(isEven(i)){
                count++;
            }
        }
        return count;
    }

    // check if number of digits are even
    public static boolean isEven(int num){
        int digit = numberOfDigits(num);
        return digit % 2 == 0;
    }

    // Return number of digits
    public static int numberOfDigits(int num){
        if(num < 0){
            num = num * -1;
        }
        int digit = 0;
        while(num>0){
            digit++;
            num = num/10;
           // System.out.println(digit);
        }

        return digit;
    }
}
