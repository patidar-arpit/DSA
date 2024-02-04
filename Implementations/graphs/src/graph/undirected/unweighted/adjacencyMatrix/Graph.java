package graph.undirected.unweighted.adjacencyMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class Graph {
	
	 int [][] graph;
	
	public Graph(int vertex) {
		graph=new int[vertex][vertex];
	}
	
	public   ArrayList<Integer> findNeighbour(int n) {
		
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		for(int i = 0;i<graph.length;i++) {
			if(graph[n][i] == 1)
				l1.add(i);
		}
	    return l1;
		
		
	}
  
	public void addEdge(int i, int j) {
		// TODO Auto-generated method stub
		graph[i][j] = 1;
		graph[j][i] = 1;
		
	}
	
	
	
	
	

}
