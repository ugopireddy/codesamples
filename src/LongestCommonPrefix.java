public class LongestCommonPrefix
{
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs1 = new String[]{"c","acc","ccc"};
        System.out.println("longest common prefix : "+ longestCommonPrefix1(strs));
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
    public static String longestCommonPrefix1(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
