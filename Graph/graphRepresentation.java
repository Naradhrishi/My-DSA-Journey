import java.util.*;


class Main{
    public static void main(String args[]){
        Graph myGraph = new Graph(3, true);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(1, 2);

        System.out.println(myGraph.getNeighbors(1)); 


    }
}

// graph representation using Adjacency Matrix
class Graph{
    int nVertices;
    int[][] adjMatrix;
    boolean isDirected;

    Graph(int nVertices, boolean isDirected){
        this.nVertices = nVertices;
        this.isDirected = isDirected;
        this.adjMatrix = new int[nVertices][nVertices];

        for(int i=0; i<nVertices; i++){
            for(int j=0;j<nVertices;j++){
                this.adjMatrix[i][j] = 0;
            }
        }

    }

    public void addEdge(int source, int destination){
        this.adjMatrix[source][destination] = 1;

        if(!this.isDirected){
            this.adjMatrix[destination][source] = 1;
        }
    }
    
    public List<Integer> getNeighbors(int source){
        List<Integer> neighbors = new ArrayList<>();
        for(int j=0;j<this.nVertices;j++){
            if(this.adjMatrix[source][j] == 1){
                neighbors.add(j);
            }
        }
        return neighbors;
    }
    

}

