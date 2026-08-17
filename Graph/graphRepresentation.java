import java.util.*;


// class Main{
//     public static void main(String args[]){
//         Graph myGraph = new Graph(3, false);
//         myGraph.addEdge(0, 2);
//         myGraph.addEdge(1, 2);

//         System.out.println(myGraph.getNeighbors(2)); 


//     }
// }


class Main{
    public static void main(String[] args) {
        WeightedGraph myGraph = new WeightedGraph(3, false);
        myGraph.addEdge(0,2,5);
        myGraph.addEdge(1, 2, 7);

        int source = 2;
        List<int[]> allNeighbors = myGraph.getNeighbors(source);

        for(int i=0; i < allNeighbors.size(); i++){
            int[] array = allNeighbors.get(i);
            for(int j = 0; j < array.length ; j++){
                System.out.print(array[j] + "  ");
            }
            System.out.println("\n");
        }
        

    }
}

// // graph representation using Adjacency Matrix
// class Graph{
//     int nVertices;
//     int[][] adjMatrix;
//     boolean isDirected;

//     Graph(int nVertices, boolean isDirected){
//         this.nVertices = nVertices;
//         this.isDirected = isDirected;
//         this.adjMatrix = new int[nVertices][nVertices];

//         for(int i=0; i<nVertices; i++){
//             for(int j=0;j<nVertices;j++){
//                 this.adjMatrix[i][j] = 0;
//             }
//         }

//     }

//     public void addEdge(int source, int destination){
//         this.adjMatrix[source][destination] = 1;

//         if(!this.isDirected){
//             this.adjMatrix[destination][source] = 1;
//         }
//     }
    
//     public List<Integer> getNeighbors(int source){
//         List<Integer> neighbors = new ArrayList<>();
//         for(int j=0;j<this.nVertices;j++){
//             if(this.adjMatrix[source][j] == 1){
//                 neighbors.add(j);
//             }
//         }
//         return neighbors;
//     }
    

// }


// // graph representation using Adjacency List
// class Graph{
//     int nVertices;
//     boolean isDirected;
//     List<List<Integer>> adjList;

//     Graph(int nVertices, boolean isDirected){
//         this.nVertices = nVertices;
//         this.isDirected = isDirected;
//         this.adjList = new ArrayList<>(nVertices);

//         for(int i=0;i<nVertices; i++){
//             this.adjList.add(new ArrayList<>());

//         }
//     }

//     public void addEdge(int source, int destination){
//         this.adjList.get(source).add(destination);
        
//         if(!isDirected){
//             this.adjList.get(destination).add(source);

//         }

//     }

//     public List<Integer> getNeighbors(int source){
//         return this.adjList.get(source);


//     }
// }



// // Weighted graph representation in Adjacency List only because 
// // in case of Adj. Matrix just change the value from 1 to particular weight of the edge, just it.

// // using int array to store weights
// class WeightedGraph{
//     int nVertices;
//     boolean isDirected;
//     List<List<int[]>> adjList;

//     WeightedGraph(int nVertices, boolean isDirected){
//         this.nVertices = nVertices;
//         this.isDirected = isDirected;
//         this.adjList = new ArrayList<>(nVertices);

//         for(int i=0;i<nVertices;i++){
//             this.adjList.add(new ArrayList<>());

//         }

//     }

//     public void addEdge(int source, int destination, int weight){
//         this.adjList.get(source).add(new int[]{destination, weight});

//         if(!this.isDirected){
//             this.adjList.get(destination).add(new int[]{source, weight});

//         }

//     }

//     public List<int[]> getNeighbors(int source){
//         return this.adjList.get(source);
//     }


// }


