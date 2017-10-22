package Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraph {
	
	private Map <Node, List<Node>> graph;
	
	public UndirectedGraph(){
		graph = new HashMap<Node, List<Node>>();
	}
	
	public void addNode (Node n){
		if (!graph.containsKey(n)){
			graph.put(n, new ArrayList<Node>());
		} else 
			System.out.println("Node doesn't exist(1)");
	}
	
	public void addNeighbour(Node p, Node neighbour){
		if (graph.containsKey(p)){
			List<Node> clist;
			List<Node> list = graph.get(p);
			if (!list.contains(neighbour)){
				list.add(neighbour);
				clist = graph.get(neighbour);
				if (list != clist)
					clist.add(p);
			}
			else
				System.out.println("Node already exists(2)");
		}
		else 
			System.out.println("Node doesn't exist (3)");
	}
	
	public void addNeighbourlist(Node p, List<Node> nList){
		if (graph.containsKey(p)){
			List<Node> list = graph.get(p);
			List<Node> clist;
			for (Node n: nList){
				if (!list.contains(n)){
					list.add(n);
					clist = graph.get(n);
					if (clist != list)
						clist.add(p);
				}
				else
					System.out.println("Node already exists (4)");
			}
		}
		else 
			System.out.println("Node doesn't exist (5)");
	}

	public List<Node> getNeighbourOfNode(Node n){
		List<Node> ret = null;
		if (graph.containsKey(n)){
			ret = graph.get(n);
		} else
			System.out.println("Node doesn't exist (6)");
		return ret;
	}

	public void deleteNeighbour(Node p, Node n){
		if (graph.containsKey(p)){
			List<Node> list = graph.get(p);
			if (list.contains(n)){
				list.remove(n);
				list = graph.get(n);
				list.remove(p);
			}
			else
				System.out.println("Edge doesn't exist (7)");
		}
		else 
			System.out.println("Node doesn't exist (8)");
	}
}


