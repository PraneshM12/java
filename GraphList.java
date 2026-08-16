import java.util.*;
public class GraphList {
    int vertices;
    List<List<Integer>> adjList;
    GraphList(int vertices){
        this.vertices=vertices;
        adjList=new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }
    void addEdge(int src,int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    
    }
    void removeEdge(int src,int dest){
        adjList.get(src).remove(Integer.valueOf(dest));
        adjList.get(dest).remove(Integer.valueOf(src));
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.print(i+"-->");
            for(Integer node:adjList.get(i)){
                System.out.print(node +" ");
                }
                System.out.println();
            }
        }
        void bfs(int start){
            boolean[] visited=new boolean[adjList.size()];
            Queue<Integer> q1=new LinkedList<Integer>();
            visited[start]=true;
            q1.add(start);
            while(!q1.isEmpty()){
                int node=q1.poll();
                System.out.print(node+" ");
                for(Integer neighbor:adjList.get(node)){
                    if(!visited[neighbor]){
                        visited[neighbor]=true;
                        q1.add(neighbor);
                    }
                }
            }
        }
        void dfs(int node,boolean[] visited){
            visited[node]=true;
            System.out.print(node+" ");
            for(Integer neighbor:adjList.get(node)){
                if(!visited[neighbor]){
                    dfs(neighbor,visited);   
                }
            }  
        } 

        boolean isConnected() {
            boolean[] visited = new boolean[vertices];
            dfs(0, visited);
            for (boolean v : visited) {
                if (!v) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        GraphList g1=new GraphList(4);
        g1.addEdge(0,1);
        g1.addEdge(2,3);
        g1.addEdge(1,2);
        g1.addEdge(1,3);
        g1.printGraph();
        System.out.println("BFS Traversal:");
        g1.bfs(0);
        System.out.println();
        System.out.println("DFS Traversal:");
        boolean[] visited = new boolean[7];
        g1.dfs(0, visited);
    }

    }
