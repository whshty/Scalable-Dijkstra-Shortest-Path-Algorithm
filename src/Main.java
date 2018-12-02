public class Main {
    public static void main(String[] args) {
        BuildGraphRandomly buildGraphNodes = new BuildGraphRandomly();
        Node[][] nodes = buildGraphNodes.buildGraphRandomly(10, 10);
        // One process
        OneModel oneModel = new OneModel();
        oneModel.generatePath(nodes);

        // Two processes
        TwoModel twoModel = new TwoModel();
        twoModel.generatePath(nodes);
    }
}

//        Four processes
//        System.out.println("--------------------------");
//        DijkstraAlgorithm algo = new DijkstraAlgorithm();
//        startTime = System.nanoTime();
//        int[] costParser = new int[nodes[0].length];
//        Map<Node, Integer> tempMap;
//
//        synchronized (algo) {
//            algo.initPathPlanning(nodes);
//            Index index = pathPlan.bfs(nodes, 0, 0, nodes.length / 4);
//            tempMap = index.map;
//            for (int i = 0; i < nodes[0].length; i++) {
//                Node temp = nodes[nodes.length / 4 - 1][i];
//                costParser[i] = tempMap.get(temp);
//            }
//        }
//
//        endTime = System.nanoTime();
//        totalTime = endTime - startTime;
//        System.out.println("Process one Time " + totalTime / 1000);
//
//        startTime = System.nanoTime();
//        int res = Integer.MAX_VALUE;
//        synchronized (algo) {
//            algo.initPathPlanning(nodes);
//            for (int i = 0; i < nodes[0].length; i++) {
//                Index index = pathPlan.bfs(nodes, nodes.length / 4, i, nodes.length / 4 * 2);
//                minCost = index.cost;
//                tempMap = index.map;
//                res = Math.min(res, minCost + costParser[i]);
//            }
//            for (int i = 0; i < nodes[0].length; i++) {
//                Node temp = nodes[nodes.length / 4][i];
//                costParser[i] = tempMap.get(temp);
//            }
//        }
//
//        endTime = System.nanoTime();
//        totalTime = endTime - startTime;
//        System.out.println("Process Two Time " + totalTime / 1000);
//
//        // Three process
//        startTime = System.nanoTime();
//        res = Integer.MAX_VALUE;
//        synchronized (algo) {
//            algo.initPathPlanning(nodes);
//
//            for (int i = 0; i < nodes[0].length; i++) {
//                Index index = pathPlan.bfs(nodes, nodes.length / 4 * 2, i, nodes.length / 4 * 3);
//                minCost = index.cost;
//                tempMap = index.map;
//                res = Math.min(res, minCost + costParser[i]);
//            }
//            for (int i = 0; i < nodes[0].length; i++) {
//                Node temp = nodes[nodes.length / 4 * 3][i];
//                costParser[i] = tempMap.get(temp);
//            }
//        }
//
//        endTime = System.nanoTime();
//        totalTime = endTime - startTime;
//        System.out.println("Process Three Time " + totalTime / 1000);
//
//        startTime = System.nanoTime();
//        res = Integer.MAX_VALUE;
//        synchronized (algo) {
//            algo.initPathPlanning(nodes);
//            for (int i = 0; i < nodes[0].length; i++) {
//                Index index = pathPlan.bfs(nodes, nodes.length / 4 * 3, i, nodes.length - 1);
//                minCost = index.cost;
//                tempMap = index.map;
//                res = Math.min(res, minCost + costParser[i]);
//            }
//            for (int i = 0; i < nodes[0].length; i++) {
//                Node temp = nodes[nodes.length - 1][i];
//                costParser[i] = tempMap.get(temp);
//            }
//        }
//
//        endTime = System.nanoTime();
//        totalTime = endTime - startTime;
//        System.out.println("Process Four Time " + totalTime / 1000);


