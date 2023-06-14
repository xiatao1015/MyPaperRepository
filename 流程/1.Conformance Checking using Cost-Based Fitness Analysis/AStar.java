import java.util.ArrayList;
import java.util.List;

public class AStar {
    public static class Node {
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int x;
        public int y;
        public int F;
        public int H;
        public int G;

        public Node parent;

        public void calcF() {
            this.F = this.H + this.G;
        }
    }

    public static final int[][] NODES = { 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 1, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
    };

    


}