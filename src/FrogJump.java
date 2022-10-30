import java.util.HashSet;
import java.util.Stack;

public class FrogJump {
    public static void main(String[] args) {
        int[] stones = new int[]{0,1,3,5,6,8,12,17};
        boolean canCross = canCross(stones);
        System.out.println("can cross: " + canCross);
    }

    private static boolean canCross(int[] stones) {
        for (int i =3; i< stones.length; i++){
            if( stones[i] > stones [i-1] * 2){
                return false;
            }
        }

        HashSet<Integer> stonePositions = new HashSet();
        for(int stone: stones){
            stonePositions.add(stone);
        }
        int lastStone = stones[stones.length -1];
        Stack<Integer> positions = new Stack<>();
        Stack<Integer> jumps = new Stack<>();
        positions.add(0);
        jumps.add(0);

        while(!positions.isEmpty()){
            int position = positions.pop();
            int jumpDist = jumps.pop();

            for(int i=jumpDist-1; i<= jumpDist+1; i++){
                if(i<=0 ){
                    continue;
                }
                int nextPosition = position + i;
                if( nextPosition == lastStone){
                    return true;
                }
                else if(stonePositions.contains(nextPosition)){
                    positions.add(nextPosition);
                    jumps.add(i);
                }
            }
        }
        return false;
    }
}
