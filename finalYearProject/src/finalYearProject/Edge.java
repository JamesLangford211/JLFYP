package finalYearProject;

/**
* Class to represent the connection between two nodes in a flowchart.
* 
*
* @author  James Langford
* @version 1.0
* @since   02-11-2016 
*/

public class Edge {
	public Node source;
	public Node destination;
	
	public Edge (Node source, Node destination){
		this.source = source;
		this.destination = destination;
	}

}
