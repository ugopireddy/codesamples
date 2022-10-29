import java.util.HashMap;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] tree = new int[]{3,3,3,1,2,1,1,2,3,3,4};
        int totalFruit = totalFruit(tree);
        System.out.println("total fruit : "+ totalFruit);
    }

    private static int totalFruit(int[] tree) {
        if(tree == null || tree.length ==0) return 0;
        int i =0;
        int j = 0;
        int max =1;
        HashMap<Integer,  Integer> map = new HashMap<>();

        while (j < tree.length){
           if(map.size() <= 2){
               map.put(tree[j], j++);
           }
           if(map.size() > 2){
               int min = tree.length -1;
               for(int value : map.values()){
                   min = Math.min(value, min);
               }
               map.remove(tree[min]);
               i = min+1;
           }
           max = Math.max(max, j-i);
        }
        return max;
    }
}
