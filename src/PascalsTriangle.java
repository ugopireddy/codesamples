import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = generatePascalsTriangle(5);
        System.out.println("Pascals Triangle : "+ pascalTriangle.toString());

    }

    private static List<List<Integer>> generatePascalsTriangle(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, prev = null;
        for (int i=0; i < numRows; i++){
            row = new ArrayList<>();
            for (int j=0; j<=i; j++)
                if( j ==0 || i==j)
                    row.add(1);
                else
                    row.add(prev.get(j-1)+ prev.get(j));
            prev = row;
            res.add(row);
        }
        return res;
    }
}
