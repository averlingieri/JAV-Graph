package Graph;

import java.util.HashMap;
import java.util.List;

public class LabelledGraph extends DirectedGraph{
    public LabelledGraph(){
    	graph = new HashMap<Node, List<Edge>>();
    }
}
