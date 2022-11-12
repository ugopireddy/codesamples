import java.util.HashMap;

public class FibonacciDP {
    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        System.out.println(fibo(20, memo));
    }

    private static int fibo(int n, HashMap<Integer, Integer> memo) {
        if(memo.containsKey(n)) return memo.get(n);
        if(n<=2) return 1;
        memo.put(n,  fibo(n-1, memo)+ fibo(n-2, memo));
        return memo.get(n);
    }
}
