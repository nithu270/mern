import java.util.*;
class Main{
    private List<List<Integer>> adj;
    int n = 5;
    public Main(){
        adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>()); 
        }
    }
    public void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
 
    public List<Integer> bfs(int start){
    List<Integer> ans = new ArrayList<>();
       Queue<Integer> q = new LinkedList<>();
         boolean[] visited = new boolean[n+1];
       q.add(start);
       visited[start] = true;
       while(!q.isEmpty()){
        int node = q.poll();
        ans.add(node); 
        for(int eachNode:adj.get(node)){
            if(!visited[eachNode]){
                q.add(eachNode);
                visited[eachNode] = true;
            }
        }
       }
return ans;
    }
    public static void main(String[] args){
      Main g = new Main();
      g.addEdge(1,2);
      g.addEdge(1,3);
      g.addEdge(2,4);
      g.addEdge(3,4);
      g.addEdge(3,5);
      g.addEdge(4,5);
System.out.print(g.bfs(1));
    }
}