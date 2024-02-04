package graph.undirected.unweighted.adjacencyMatrix;

import java.util.ArrayList;

public class TestGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g1 = new Graph(7);
		   
		g1.addEdge(0,2);
		g1.addEdge(1,2);
		g1.addEdge(1,3);
		g1.addEdge(2,3);
		
		
		System.out.println(g1.findNeighbour(1));
	}

}
