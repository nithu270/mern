//bfs in graph
/*import java.util.*;
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
}*/

//dfs in graph


import java.util.*;
class Main{
    private List<List<Integer>> adjList;
    private int n=5;

    public Main(){
        adjList = new ArrayList<>();
        for(int i=0;i<=n;i++){
          adjList.add(new ArrayList<>());

        }
    }
    public addEdge(int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
        public List<Integer> dfs(int start){
             List<Integer> ans = new ArrayList<>();
            Stack<Integer> s = new Stack<>();
            boolean[] visited = new boolean[n+1];
            s.push(start);
            while(!s.isEmpty()){
                int node = s.pop();
                if(!visited[node]){
                    visited[node] = true;
                    ans.add(node);
                for(Node eachNode:adjList.get(node)){
                    if(!visited[eachNode]){
                        s.push(eachNode);
                    }
                    
                }
            }
        }

    }

public static void main(string[] args){
Main g = new Main();
g.addEdge(1,2);
g.addEdge(1,3);
g.addEdge(2,4);
g.addEdge(3,4);
g.addEdge(3,5);
g.addEdge(4,5);
System.out.print(g.dfs(1));
}
}

