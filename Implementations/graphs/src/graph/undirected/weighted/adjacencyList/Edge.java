package graph.undirected.weighted.adjacencyList;

public class Edge {
	
	int src;
	int dest;
	int weight;   // only diff is that between unweighted and weighted is we have to include extra field weight here between two edges
	
	public Edge(int src,int dest,int weight) {
		this.src=src;
		this.dest=dest;
		this.weight=weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+src+","+dest+" "+weight+" ";
	}

}

