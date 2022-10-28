public class PowerOfTwo {
    public static void main(String[] args) {
        boolean isPower = powerOfTwo(32);
        System.out.println("is power of two : "+ isPower);
    }

    private static boolean powerOfTwo(int n) {
        int i =1;
        while (i<n){
            i*=2;
        }
        return i==n;
    }
}
