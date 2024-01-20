package Graph;

import java.util.Scanner;

public class AdjacencyMatrix {

    //undirected graph implementation

    /*pros:remove is o(1) and quering is o(1)
    * It requries o(v*2)
    *
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices= sc.nextInt();
        int edges= sc.nextInt();

        //create 2D array with size of v*v
        int adj[][] = new int[vertices+1][vertices+1];
        for(int i=0;i<edges;i++){
            int l = sc.nextInt();
            int m=sc.nextInt();
            adj[l][m]=1;
            adj[m][l]=1;
        }
    }
}
