public class demo7 {
    public static void main(String[] args) {
        char[] charArr = {'a', 'b', 'd', 'f', 'k'};
        char target = 'c';

        System.out.println(findCharIndex(target, charArr));
    }

    public static char findCharIndex(char target, char[] chArr){
        int start = 0;
        int end = chArr.length - 1;
        System.out.println("end " + end);
        if(chArr.length == 0){
            return ' ';
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < chArr[mid]){
                end = mid - 1;
                System.out.println("end " + end);
            }
            else if(target > chArr[mid]){
                start = mid + 1;
                System.out.println("start " + start);
            }

        }
        System.out.println(start + " and " + end + " arr length " + chArr.length);
        return chArr[start % start];

    }
}
