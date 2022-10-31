public class LongestCommonPrefix
{
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println("longest common prefix : "+ longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        String lcp = "";
        if(strs==null || strs.length ==0) return lcp;
        int index =0;
        for(char c : strs[0].toCharArray()){
            for (int i=1; i<strs.length; i++){
                if( index >= strs[i].length() || strs[i].charAt(index) != c){
                    return lcp;
                }
            }
            lcp +=c;
            index++;
        }
        return lcp;
    }
}
