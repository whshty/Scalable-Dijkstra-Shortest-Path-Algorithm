import java.util.*;

public class Node {
    int id;

    int rightCost;
    int downCost;
    int downRightCost;
    Node right;
    Node down;
    Node diagonal;

    Random rand = new Random();

    Node(int x) {
        id = x;
        rightCost = rand.nextInt(100);
        downCost = rand.nextInt(100);
        downRightCost = rand.nextInt(100);
    }
}