package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		UndirectedGraph graph = new UndirectedGraph();
		
		Node n1 = new Node(1, "red");
		Node n2 = new Node(2,"yellow");
		Node n3 = new Node(3,"green");
		Node n4 = new Node(4,"grey");
		Node n5 = new Node(5,"purple");
		Node n6 = new Node(6,"black");
		
		graph.addNode(n1);
		graph.addNode(n2);
		graph.addNode(n3);
		graph.addNode(n4);
		graph.addNode(n5);
		graph.addNode(n6);
		
		graph.addNeighbour(n1, n2);
		graph.addNeighbour(n2, n3);
		graph.addNeighbour(n3, n4);
		graph.addNeighbour(n4, n5);
		graph.addNeighbour(n1, n2);
		List<Node> list = new ArrayList<Node>();
		list.add(n1);
		list.add(n5);
		list.add(n2);
		list.add(n6);
		graph.addNeighbourlist(n5, list);
		
		System.out.println("node: " + n1.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n1).toArray()));
		System.out.println("node: " + n2.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n2).toArray()));
		System.out.println("node: " + n3.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n3).toArray()));
		System.out.println("node: " + n4.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n4).toArray()));
		System.out.println("node: " + n5.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n5).toArray()));
		System.out.println("node: " + n6.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n6).toArray()));
		System.out.println();
		
		graph.deleteNeighbour(n1, n2);
		graph.deleteNeighbour(n1, n6);
		graph.deleteNeighbour(n2, n5);  
		
		System.out.println("node: " + n1.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n1).toArray()));
		System.out.println("node: " + n2.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n2).toArray()));
		System.out.println("node: " + n3.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n3).toArray()));
		System.out.println("node: " + n4.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n4).toArray()));
		System.out.println("node: " + n5.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n5).toArray()));
		System.out.println("node: " + n6.getId() + " " + Arrays.toString(graph.getNeighbourOfNode(n6).toArray()));
	
		System.out.println("--------------------------------------------");
		
        DirectedGraph dir_graph = new DirectedGraph();
		
		n1 = new Node(1, "red");
		n2 = new Node(2,"yellow");
		n3 = new Node(3,"green");
		n4 = new Node(4,"grey");
		n5 = new Node(5,"purple");
		n6 = new Node(6,"black");
		
		dir_graph.addNode(n1);
		dir_graph.addNode(n2);
		dir_graph.addNode(n3);
		dir_graph.addNode(n4);
		dir_graph.addNode(n5);
		dir_graph.addNode(n6);
		
		dir_graph.addNeighbour(n1, new Edge(n2));
		dir_graph.addNeighbour(n2, new Edge(n3));
		dir_graph.addNeighbour(n3, new Edge(n4));
		dir_graph.addNeighbour(n4, new Edge(n5));
		dir_graph.addNeighbour(n1, new Edge(n2));
		List<Edge> edge_list = new ArrayList<Edge>();
		edge_list.add(new Edge(n1));
		edge_list.add(new Edge(n5));
		edge_list.add(new Edge(n2));
		edge_list.add(new Edge(n6));
		dir_graph.addNeighbourlist(n5, edge_list);
		
		System.out.println("node: " + n1.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n1).toArray()));
		System.out.println("node: " + n2.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n2).toArray()));
		System.out.println("node: " + n3.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n3).toArray()));
		System.out.println("node: " + n4.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n4).toArray()));
		System.out.println("node: " + n5.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n5).toArray()));
		System.out.println("node: " + n6.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n6).toArray()));
		System.out.println();
		
		dir_graph.deleteNeighbour(n1, dir_graph.getNeighbourOfNode(n1).get(0));
		dir_graph.deleteNeighbour(n3, dir_graph.getNeighbourOfNode(n3).get(0));
		dir_graph.deleteNeighbour(n2, dir_graph.getNeighbourOfNode(n2).get(0));  
		
		System.out.println("node: " + n1.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n1).toArray()));
		System.out.println("node: " + n2.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n2).toArray()));
		System.out.println("node: " + n3.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n3).toArray()));
		System.out.println("node: " + n4.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n4).toArray()));
		System.out.println("node: " + n5.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n5).toArray()));
		System.out.println("node: " + n6.getId() + " " + Arrays.toString(dir_graph.getNeighbourOfNode(n6).toArray()));
	
		System.out.println("--------------------------------------------");

		LabelledGraph labGraph = new LabelledGraph();
		
		Node red = new Node(1,"red");
		Node green = new Node(2,"green");
		Node white = new Node(3,"white");
		Node blue = new Node(4,"blue");
		
		labGraph.addNode(red);
		labGraph.addNode(green);
		labGraph.addNode(white);
		labGraph.addNode(blue);
		
		labGraph.addNeighbour(blue, new LabelledEdge(green, Arrays.asList("white", "green", "red")));
		labGraph.addNeighbour(green, new LabelledEdge(red, Arrays.asList("red", "blue", "white")));

		List<Edge> label_edge_list = new ArrayList<Edge>();
		label_edge_list.add(new LabelledEdge(white,  Arrays.asList("white", "green")));
		label_edge_list.add(new LabelledEdge(blue,  Arrays.asList("blue")));
		labGraph.addNeighbourlist(red, label_edge_list);

		label_edge_list = new ArrayList<Edge>();
		label_edge_list.add(new LabelledEdge(red, Arrays.asList("blue")));
		label_edge_list.add(new LabelledEdge(blue, Arrays.asList("green", "red")));
		labGraph.addNeighbourlist(white, label_edge_list);
		
		System.out.println("node: " + red + " " + Arrays.toString(labGraph.getNeighbourOfNode(red).toArray()));
		System.out.println("node: " + white + " " + Arrays.toString(labGraph.getNeighbourOfNode(white).toArray()));
		System.out.println("node: " + blue + " " + Arrays.toString(labGraph.getNeighbourOfNode(blue).toArray()));
		System.out.println("node: " + green + " " + Arrays.toString(labGraph.getNeighbourOfNode(green).toArray()));
		System.out.println();
		labGraph.deleteNeighbour(red, labGraph.getNeighbourOfNode(red).get(0));
		labGraph.deleteNeighbour(blue, labGraph.getNeighbourOfNode(blue).get(0));
		
		System.out.println("node: " + red + " " + Arrays.toString(labGraph.getNeighbourOfNode(red).toArray()));
		System.out.println("node: " + white + " " + Arrays.toString(labGraph.getNeighbourOfNode(white).toArray()));
		System.out.println("node: " + blue + " " + Arrays.toString(labGraph.getNeighbourOfNode(blue).toArray()));
		System.out.println("node: " + green + " " + Arrays.toString(labGraph.getNeighbourOfNode(green).toArray()));	}

}
