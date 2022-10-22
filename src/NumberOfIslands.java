public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','0','0'},
                         {'1','1','0','0','0'},
                         {'0','0','0','0','0'},
                         {'0','0','0','1','1'}};
        int nums = numberOfIslands(grid);
        System.out.println("numberOfIslands : "+nums);
    }

    private static int numberOfIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length ==0) return 0;
        int count =0;
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c] == '1') {
                    dfsMarking(grid, r, c);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfsMarking(char[][] grid, int r, int c) {
        if(r<0 || r>=grid.length || c<0 || c>= grid[0].length || grid[r][c] =='0') return;

        grid[r][c] = '0';
        dfsMarking(grid, r+1, c);
        dfsMarking(grid, r-1, c);
        dfsMarking(grid, r, c+1);
        dfsMarking(grid, c, r-1);
    }
}
