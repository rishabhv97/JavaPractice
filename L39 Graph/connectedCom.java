package L39

import java.util.ArrayList;

Graph;

public class connectedCom {

    public static void bfs(ArrayList<Edge> [] graph){
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i<graph.length ;i++){
            if (!vis[i]) {
                
                bfsUtils(graph,vis);
            }
        }
    }

     public  static void  bfsUtils(ArrayList<Edge> [] graph){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr +" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size() ; i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }

    // DFS code

    public static void dfs(ArrayList<Edge> [] graph){
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i<graph.length ;i++){
            if (!vis[i]) {
                dfsUtil(graph,i, vis);
            }
        }
    }

     public static void dfsUtil(ArrayList<Edge> [] graph, int curr, boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size() ; i++){
            Edge e= graph[curr].get(i);

            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
