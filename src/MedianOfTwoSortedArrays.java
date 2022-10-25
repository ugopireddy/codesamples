
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2,4};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("findMedianSortedArrays : " + median);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1 = nums1.length;
        int s2 = nums2.length;
        int i=0, j=0, k=0;
        int[] temp = new int[s1+s2];
        while(i<s1 && j<s2) {
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
                k++;
            } else {
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(i>=s1){
            for(int t=j; t<s2; t++){
                temp[k] = nums2[t];
                k++;
            }

        }
        if(j>=s2){
            for(int t=i; t<s1; t++){
                temp[k] = nums1[i];
                k++;
            }
        }
        int n = temp.length;
        if(n % 2 !=0) return temp[n/2];
        else return (temp[n/2] + temp[n/2 - 1])/2.0;

    }

}
