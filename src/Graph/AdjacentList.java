package Graph;

import java.util.ArrayList;

public class AdjacentList {

//    Pros: Saves space O(|V|+|E|). In the worst case, there can be C(V, 2) number of edges in a graph thus consuming O(V^2) space. Adding a vertex is easier. Computing all neighbors of a vertex takes optimal time.
//            Cons: Queries like whether there is an edge from vertex u to vertex v are not efficient and can be done O(V).
//    In Real-life problems,  graphs are sparse(|E| <<|V|2). That’s why adjacency lists Data structure is commonly used for storing graphs. Adjacency matrix will enforce (|V|2) bound on time complexity for such algorithms.

    static void addEdge(ArrayList<ArrayList<Integer>> adjList,int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public static void main(String[] args) {
        int vertices=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
        System.out.println(adj);
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        System.out.println(adj);
    }
}
