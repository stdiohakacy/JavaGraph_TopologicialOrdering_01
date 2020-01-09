package TopologicialOrdering;

import java.util.Stack;

public class TopologicialOrder {
	private Stack<Vertex> stack;
	

	public TopologicialOrder() {
		super();
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs(Vertex v) {
		v.setVisited(true);
		for (Vertex vertex : v.getNeighbourList()) {
			if(!vertex.isVisited())
				dfs(vertex);
		}
		stack.push(v);
	}

	public Stack<Vertex> getStack() {
		return stack;
	}

}
