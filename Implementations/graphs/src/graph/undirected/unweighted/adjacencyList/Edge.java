package graph.undirected.unweighted.adjacencyList;

public class Edge {
	
	int src;
	int dest;
	
	public Edge(int src,int dest) {
		this.src=src;
		this.dest=dest;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+src+","+dest+" ";
	}

}

