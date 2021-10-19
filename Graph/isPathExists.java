class Solution {
    public class Edge{
        int v=0;
        
        Edge(int v){
            this.v=v;
        }
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
        
        ArrayList<Edge>[] graph=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int a[]:edges){
            int u=a[0];
            int v=a[1];
            
            graph[u].add(new Edge(v));
            graph[v].add(new Edge(u));
        }
        
        boolean[] visited=new boolean[n];
       return isPathExists(graph,start,end,visited);
    }
    
    public boolean isPathExists ( ArrayList<Edge>[] graph,int start,int end,boolean []visited){
        if(start==end) return true;
        
        visited[start]=true;
        boolean flag=false;
        for(Edge e:graph[start]){
            if(visited[e.v]==false){
                flag=flag || isPathExists(graph,e.v,end,visited);
            }
        }
        
        return flag;
    }
}
