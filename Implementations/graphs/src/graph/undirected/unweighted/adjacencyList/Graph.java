package graph.undirected.unweighted.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class Graph {
	
	 ArrayList<Edge> [] graph;
	
	public Graph(int vertex) {
		graph=new ArrayList[vertex];
	}
	
    public  void createGraph() {
		
		for(int i = 0;i<graph.length;i++) {
				graph[i] = new ArrayList<Edge>();
		}
		
	    graph[0].add(new Edge(0,1));  // new Egde(src,des);
	    graph[0].add(new Edge(0,2));
	    
	    graph[1].add(new Edge(1,3));
	    graph[1].add(new Edge(1,0));
	    
	    graph[2].add(new Edge(2,4));
	    graph[2].add(new Edge(2,0));
	    
	    graph[3].add(new Edge(3,4));
	    graph[3].add(new Edge(3,5));
	    graph[3].add(new Edge(3,2));
	    
	    graph[4].add(new Edge(4,5));
	    graph[4].add(new Edge(4,2));
	    graph[4].add(new Edge(4,3));
	    
	    graph[5].add(new Edge(5,6));
	    graph[5].add(new Edge(5,3));
	    graph[5].add(new Edge(5,4));


	    graph[6].add(new Edge(6,5));

	        
	}

	public   ArrayList<Integer> findNeighbour(int n) {
		
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(int i = 0;i<graph[n].size();i++) {
			Edge e = graph[n].get(i);
			l1.add(e.dest);
		}
		
	    return l1;
		
		
	}

	public  void bfsTraversal(int start) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<Integer>();	
		boolean [] visited = new boolean[graph.length];
		
		q.add(start);
		
		while(!q.isEmpty()) {
			
			int curr = q.poll();
			if(visited[curr]==false) {
				System.out.print(curr+" ");
				visited[curr] =true;
				
				for(int i  = 0 ;i<graph[curr].size();i++) {
					Edge e = graph[curr].get(i);
					q.add(e.dest);
				}
			}
				
			
		}
		
		System.out.println();
		
		
		
		
	}

	public  void dfsTraversal(int start) {
		// TODO Auto-generated method stub
		boolean [] visited = new boolean[graph.length];
		dfs(graph,start,visited);
		
		
		
	}

	private  void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
		
		if(visited[curr] == true)
			return;
		
		System.out.print(curr+" ");
		visited[curr] = true;
		
		for(int i = 0;i<graph[curr].size();i++) {
			
			Edge e = graph[curr].get(i);
			dfs(graph,e.dest,visited);
		}
		
	}

}
