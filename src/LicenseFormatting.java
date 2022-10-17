public class LicenseFormatting {
    public static void main(String[] args) {
        String str = "dfs-d-23-sf";
        int k = 4;
        System.out.println("Formatted license : " + formatLicense(str, k));
    }

    private static String formatLicense(String str, int k) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        for (int i = str.length()-1; i>=0; i--  ){
            if(str.charAt(i) == '-') continue;
            if(count == k){
                output.append('-');
                count =0;
            }
            output.append(str.charAt(i));


            count ++;
        }
        return output.reverse().toString().toUpperCase();
    }
}
