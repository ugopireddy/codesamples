public class NumberComplement {
    public static void main(String[] args) {
        System.out.println("Number complement : "+numberComplement(5));
    }

    private static int numberComplement(int num) {
        int result =0;
        int power = 1;
        while(num >0){
            result += (num % 2 ^ 1) * power;
            power <<= 1;
            num >>= 1;
        }
        return result;
    }
}
