public class ReverseInteger {
    public static void main(String[] args) {
        int num= -1234;
        int rev = reverseInteger(num);
        System.out.println("reverseInteger  :"+rev);
    }

    private static int reverseInteger(int num) {
        boolean negative = false;
        if(num<0){
           negative = true;
           num *= -1;
        }
        long rev =0;
        while (num>0){
            rev = rev *10 + num % 10 ;
            num = num/10;
        }
        if(rev>Integer.MAX_VALUE) return 0;
        return negative ? (int)(-1*rev) :(int)rev ;
    }
}

