import java.util.ArrayList;
import java.util.List;

public class RoomsAndKeys {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> keys = new ArrayList<Integer>();
        for(int i=0;i<4; i++){
            keys.add(i);
            rooms.add(keys);
        }
        System.out.println("rooms with keys : "+ rooms.toString());
       boolean canVisit = roomsAndKeys(rooms)  ;
        System.out.println("rooms with keys visited: "+ canVisit);
    }

    private static boolean roomsAndKeys(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean[] visited = new boolean[n];

        dfs(0, rooms, visited);

        for (boolean visit: visited) {
            if(!visit){
                return false;
            }
        }
        return true;
    }

    private static void dfs(int room, List<List<Integer>> rooms, boolean[] visited) {
        visited[room] = true;

        for( int nextRoom : rooms.get(room)){
            if(!visited[nextRoom]){
                dfs(nextRoom, rooms, visited);
            }
        }
    }
}
