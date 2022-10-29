public class BinaryNumberAlternatingBits {
    public static void main(String[] args) {
        System.out.println("BinaryNumberAlternatingBits : "+ hasAlternatingBits(10));
    }

    private static boolean hasAlternatingBits(int n) {
        int last = n%2;
        n >>= 1;

        while (n > 0){
            int current = n%2;
            if(last == current){
                return false;
            }
            last = current;
            n >>= 1;
        }

        return true;
    }
}
