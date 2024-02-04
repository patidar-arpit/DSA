package graph.undirected.weighted.adjacencyList;

import java.util.ArrayList;

public class TestGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g1 = new Graph(7);
		   
		 g1.createGraph();
		 System.out.println(g1.findNeighbour(2));
		 g1.bfsTraversal(0);
	
		 g1.dfsTraversal(4); //starting node

	}

}
