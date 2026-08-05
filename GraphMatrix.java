public class GraphMatrix {
    int vertices;
    int matrix[][];

    public GraphMatrix(int vertices) {
        this.vertices= vertices;
        matrix = new int[vertices][vertices];

    }
    void addEdge(int src, int dest){
        matrix[src][dest]=1;
        matrix[dest][src]=1;

    }
    void removeEdge(int src, int dest){
        matrix[src][dest]=0;
        matrix[dest][src]=0;
    }
    void printGraph(){
        for (int i =0 ;i < vertices; i++){
            for(int j=0; j<vertices;j++ ){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GraphMatrix g1 = new GraphMatrix(4);
        g1.addEdge(0,1);
        g1.addEdge(2,3);
        g1.addEdge(1,2);
        g1.addEdge(1,3);
        g1.printGraph();
        g1.removeEdge(2, 3);
        g1.printGraph();
    }
}
    
    
