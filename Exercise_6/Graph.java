public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 10;
        int noEdges = 10;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // 0 - Alex
        // 1 - Joven
        // 2 - Ronn
        // 3 - Par
        // 4 - Neil
        // 5 - Albert
        // 6 - Christian
        // 7 - Prince
        // 8 - Jason
        // 9 - Roman

        // Edge 1
        myGraph.edge[0].src = "Alex";
        myGraph.edge[0].dest = "Joven";

        // Edge 2
        myGraph.edge[1].src = "Alex";
        myGraph.edge[1].dest = "Ronn";

        // Edge 3
        myGraph.edge[2].src = "Alex";
        myGraph.edge[2].dest = "Par";

        // Edge 4
        myGraph.edge[3].src = "Joven";
        myGraph.edge[3].dest = "Ronn";

        // Edge 5
        myGraph.edge[4].src = "Par";
        myGraph.edge[4].dest = "Neil";

        // Edge 6 
        myGraph.edge[5].src = "Neil";
        myGraph.edge[5].dest = "Albert";

        //Edge 7
        myGraph.edge[6].src = "Albert";
        myGraph.edge[6].dest = "Christian";

        // Edge 8
        myGraph.edge[7].src = "Christian";
        myGraph.edge[7].dest = "Prince";

        // Edge 9 
        myGraph.edge[8].src = "Prince";
        myGraph.edge[8].dest = "Jason";

        // Edge 10
        myGraph.edge[9].src = "Jason";
        myGraph.edge[9].dest = "Roman";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
