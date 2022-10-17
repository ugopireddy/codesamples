public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println("Max consecutive ones : " + maxConsecutiveOnes(arr));
    }

    private static int maxConsecutiveOnes(int[] arr) {
        int max=0;
        int start =0;
        for (int i =0; i< arr.length; i ++){
            if(arr[i]==1){
                max = Math.max(max, i - start + 1);
            }else {
                start = i+1;
            }
        }
        return max;
    }
}
