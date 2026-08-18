// pre-made graph code

import java.util.*;


class Main {
    public static void main(String[] args) {
        // Create a sample graph
        // 0 -- 1 -- 3
        // |    |
        // 2 -- 4 -- 5
        Graph g = new Graph(6, false);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(4, 5);

        // g.printGraph();

        // --- YOUR CODE STARTS HERE ---
        int startingVertex = 0;
        boolean[] isVisited = new boolean[g.nVertices];
        isVisited[startingVertex] = true;
        System.out.print(startingVertex +" - ");
        dfs(g, startingVertex, isVisited);


    }

    public static void dfs(Graph g, int startingVertex, boolean[] isVisited){
        List<Integer> neighbors = g.adjList.get(startingVertex); 

        for(int i=0;i<neighbors.size();i++){
            if(!isVisited[neighbors.get(i)]){
                int currentNeighbor = neighbors.get(i);
                isVisited[currentNeighbor] = true;
                System.out.print(currentNeighbor + " - ");
                dfs(g, currentNeighbor, isVisited);
            }
        }
    }
}


// Clean Graph - Adjacency List (for traversal practice)
class Graph {
    int nVertices;
    boolean isDirected;
    List<List<Integer>> adjList;

    Graph(int nVertices, boolean isDirected) {
        this.nVertices = nVertices;
        this.isDirected = isDirected;
        this.adjList = new ArrayList<>(nVertices);
        for (int i = 0; i < nVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        if (!isDirected) {
            adjList.get(v).add(u);
        }
    }

    public List<Integer> getNeighbors(int u) {
        return adjList.get(u);
    }

    public void printGraph() {
        for (int i = 0; i < nVertices; i++) {
            System.out.print(i + " -> ");
            System.out.println(adjList.get(i));
        }
    }
}


