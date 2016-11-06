package finalYearProject;

/**
* Class to represent the connection between two nodes in a flowchart.
* Graphically, an edge is just a line connecting two nodes of the flowchart.
* 
*
* @author  James Langford
* @version 1.0
* @since   02-11-2016 
*/

public class Edge {
	public Node source;
	public Node destination;
	public String annotation;
	
	
	/**
	 * Constructor for the Edge object, accepts two parameters for the source and destination of this edge.
	 * @param source the node the edge originates from
	 * @param destination the node the edge will travel to
	 */
	public Edge (Node source, Node destination){
		annotation = "";
		this.source = source;
		this.destination = destination;
	}
	
	public String getAnnotation(){
		return annotation;
	}
	
	/**
	 * Method to add content to the string field of this object if necessary.
	 * @param annotation the string value to hold the text representation of this line
	 */
	public void setAnnotation(String annotation){
		this.annotation = annotation;
	}
	
	public Node getSource(){
		return source;
	}
	
	public void setSource(Node source){
		this.source = source;
	}
	public Node getDestination(){
		return destination;
	}
	
	public void setDestination(Node destination){
		this.destination = destination;
	}
	

}
