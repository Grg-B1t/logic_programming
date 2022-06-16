public class demo2 {
    public static void main(String[] args) {
        String str = "Peter Piper picked a pecked of pickeled pepper.";
        char target = 'a';

        System.out.println("The " + target + " is located at index " + findChar(target, str) + " of the array.");

    }

    public static int findChar(char target, String str){
        if(str.isBlank()){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return i;
            }
        }
        
        
        return -1;
    }
}
