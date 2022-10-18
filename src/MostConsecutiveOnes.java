public class MostConsecutiveOnes {
    public static void main(String[] args) {
        int[] input = new int[] {1,1,1,0,0, 1,1,0};
        int k =2;
        int len = mostConsecutiveOnes(input, k);
        System.out.println( "most consecutive ones : " + len);
    }

    private static int mostConsecutiveOnes(int[] input, int k) {
        int left  = 0;
        int right = 0;
        while ( right < input.length){
            if( input[right]==0) k--;
            if(k<0) {
                if (input[left] == 0) k++;
                left++;
            }
            right ++;
        }
        return right - left;
    }
}
