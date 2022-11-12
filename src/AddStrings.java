public class AddStrings {
    public static void main(String[] args) {
        String s1 = "126";
        String s2 = "234";
        String s3 = addStrings(s1, s2);
        System.out.println("s3 "+ s3);
    }

    private static String addStrings(String s1, String s2) {

        int i= s1.length()-1;
        int j= s2.length()-1;
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        while(i >= 0 || j>= 0){
            int sum = carry;
            if(i>= 0){
                sum += s1.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += s2.charAt(j--) - '0';
            }
            carry = sum / 10;
            sb.append(sum%10);
        }
        if (carry >0){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
