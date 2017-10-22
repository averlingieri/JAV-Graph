package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LabelledEdge extends Edge{
	private List<String> names;
	
	public LabelledEdge(Node v, String name){
		super(v);
		names = new ArrayList<String>();
		names.add(name);
	}
	
	public LabelledEdge(Node v, List<String> names){
		super(v);
		this.names = new ArrayList<String>(names);
	}
	
	public void addName(String name){
		names.add(name);
	}
	
	public List<String> getNames(){
		return names;
	}
	
	@Override
	public String toString(){
		return "Edge [node=" + vertex + " name:" + Arrays.toString(names.toArray()) + "]";
	}
}