public class AddBinary {
    public static void main(String[] args) {
        String a = "10";
        String b = "11";
        String result = addBinary(a, b);
        System.out.println("binary addition : " + result);
    }

    private static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() -1;
        int j = b.length()-1;
        int carry =0;
        while (i>=0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i--)-'0';
            }
            if(j >= 0){
                sum += b.charAt(j--) -'0';
            }
            sb.insert (0, sum % 2);
            carry = sum /2;
        }
        if( carry > 0){
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
