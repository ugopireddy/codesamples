import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        //System.out.println("GCD is : " +  main.gcd(12, 8));
        //System.out.println("Sum of  digits is : " +  main.sumOfDigits(201));
        //System.out.println("Power of a number : " +  main.power(2, 0));
        //System.out.println("Binary output is: "+ binary(10));

        System.out.println("Some recursive is odd : " + someRecursive(new int[]{0,2,4}, new OddFunction()));
    }

    private static boolean someRecursive(int[] arr, OddFunction isOdd){

        if(arr.length == 0) {
            return false;
        }else if (isOdd.run(arr[0])){
            return true;
        }else {
          return  someRecursive(Arrays.copyOfRange(arr, 1, arr.length), isOdd);
        }

    }
    private static int binary(int n) {
        if (n==0) return 0;
        return n%2 + 10 * binary(n/2);
    }

    public int power(int base, int exp){
        if (exp==0) return 1;
        return base * power (base, exp-1);
    }
    public int sumOfDigits(int n){
        if (n == 0) {
            return 0;
        }
        if (n==1 ){
            return 1;
        }
        return n%10 + sumOfDigits( n/10);
    }
    public int gcd ( int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a % b);
    }
}