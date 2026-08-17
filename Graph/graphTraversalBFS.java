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

        g.printGraph();

        // --- YOUR CODE STARTS HERE ---

        int startingVertex = 0;

        Deque<Integer> q = new ArrayDeque<>();
        int[] visitedVertex = new int[6];

        //  initialize complete array with 0
        for(int i=0;i<visitedVertex.length; i++){
            visitedVertex[i] = 0;
        }

        visitedVertex[startingVertex] = 1;
        q.offer(startingVertex);

        while(!q.isEmpty()){
            int currentVertex = q.poll();
            System.out.print(currentVertex + " - ");
            List<Integer> allNeighbors = g.getNeighbors(currentVertex);

            for(int i=0; i<allNeighbors.size(); i++){

                if(visitedVertex[allNeighbors.get(i)] == 0){
                    visitedVertex[allNeighbors.get(i)] = 1;
                    q.offer(allNeighbors.get(i));

                }
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


