package Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph {
	
	protected Map <Node, List<Edge>> graph;
	
	public DirectedGraph(){
		graph = new HashMap<Node, List<Edge>>();
	}
	
	public void addNode (Node n){
		if (!graph.containsKey(n)){
			graph.put(n, new ArrayList<Edge>());
		} else 
			System.out.println("Node already exists (9)");
	}
	
	public void addNeighbour(Node p, Edge neighbour){
		if (graph.containsKey(p)){
			List<Edge> list = graph.get(p);
			if (!list.contains(neighbour)){
				list.add(neighbour);
			}
			else
				System.out.println("Neighbour already exists (10)");
		}
		else 
			System.out.println("Node already exists (11)");
	}
	
	public void addNeighbourlist(Node p, List<Edge> nList){
		if (graph.containsKey(p)){
			List<Edge> list = graph.get(p);
			for (Edge n: nList){
				if (!list.contains(n)){
					list.add(n);
				}
				else
					System.out.println("Neighbour already exists (11)");
			}
		}
		else 
			System.out.println("Node already exists (12)");
	}

	public List<Edge> getNeighbourOfNode(Node n){
		List<Edge> ret = null;
		if (graph.containsKey(n)){
			ret = graph.get(n);
		} else
			System.out.println("Node already exists (13)");
		return ret;
	}

	public void deleteNeighbour(Node p, Edge n){
		if (graph.containsKey(p)){
			List<Edge> list = graph.get(p);
			if (list.contains(n)){
				list.remove(n);
			}
			else
				System.out.println("Edge doesn't exist (14)");
		}
		else 
			System.out.println("Node p doesn't exists (15)");
	}
}
