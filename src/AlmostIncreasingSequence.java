public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,2};
        boolean isIncreaing = isIncreasing2(nums);
        System.out.println("amlmost increasing seq by deleting one digit : "+ isIncreaing);
    }

    private static boolean isIncreasing2(int[] a) {
        int count1 = 0 , count2 = 0;
        for(int i = 0 ; i < a.length-1 ; i++){
            if(a[i] >= a[i+1]) count1++;
        }

        for(int i = 0 ; i < a.length-2 ; i++){
            if(a[i] >= a[i+2]) count2++;
        }
        return (count1 <=1) && (count2 <= 1);
    }


    private static boolean isIncreasing(int[] seq) {
        int count =0;
        int n = seq.length;
        if(n == 2){
            return true;
        }
        for(int i=0; i< n-1; i++){
            if(seq[i+1] <= seq[i]) {
                count++;
                if (i + 2 < n && seq[i + 2] <= seq[i]
                        && i - 1 >= 0 && seq[i - 1] >= seq[i + 1]) {
                    return false;
                }
            }
        }

        return count < 2;
    }
}
