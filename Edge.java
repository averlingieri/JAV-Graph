package Graph;

public class Edge{
	protected Node vertex;
	
	public Edge(Node v){
		vertex = v;
	}

	public Node getNode(){
		return vertex;
	}
	
    @Override
    public boolean equals(Object v) {
    	boolean ret = super.equals(v);
    	if ((ret == false) && (v instanceof Edge)){
    		Edge e = (Edge) v;
    		if (e.getNode() == vertex)
    			ret = true;
    		else
    			ret = false;
    	}
    	return ret;
    }
    
	@Override
	public String toString(){
		return "Edge [node=" + vertex + "]";
	}
}