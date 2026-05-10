public class Experiment {

    
    public void runTraversals(Graph g) {

        long startBFS = System.nanoTime();
        g.bfs(0);
        long endBFS = System.nanoTime();

        long startDFS = System.nanoTime();
        g.dfs(0);
        long endDFS = System.nanoTime();

        long bfsTime = endBFS - startBFS;
        long dfsTime = endDFS - startDFS;

        System.out.println("BFS Execution Time: " + bfsTime + " ns");
        System.out.println("DFS Execution Time: " + dfsTime + " ns");
    }

    
    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            System.out.println("\n============================");
            System.out.println("Testing Graph with " + size + " vertices");
            System.out.println("============================");

            Graph graph = new Graph();

            
            for (int i = 0; i < size; i++) {
                graph.addVertex(new Vertex(i));
            }

            
            for (int i = 0; i < size - 1; i++) {
                graph.addEdge(i, i + 1);

                if (i + 2 < size) {
                    graph.addEdge(i, i + 2);
                }
            }

            if (size == 10) {
                graph.printGraph();
            }

            runTraversals(graph);
        }
    }

    public void printResults() {
        System.out.println("\nTraversal experiments completed successfully.");
    }
}
