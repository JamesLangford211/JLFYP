package finalYearProject;

import java.util.UUID;

/**
* A class to model an individual node for the flowchart.
* A node can be any aspect of the flowchart. 
*
* @author  James Langford
* @version 1.0
* @since   02-11-2016 
*/


 public class Node {
	 // Reference to the next node in the chain, null if it doesn't exist.
	 Node next;
	
	 // Object carried by this node object
	 Object data;
	 
	 String uniqueID;
	 String testID;
	 
	 /**
	   * Constructor for the node object if the next value is not known.
	   * @param value the object this node will carry.
	   */
	 public Node(Object value){
		 next = null;
		 data = value;
		 uniqueID = UUID.randomUUID().toString();
		 testID = uniqueID.substring(0,5);
	 }
	 
	 /**
	   * Constructor for the node object if the next value is known.
	   * @param value the object this node will carry.
	   * @param nextNode the node that is considered next.
	   */
	 public Node(Object value, Node nextNode){
		 data = value;
		 next = nextNode;
	 }
	 
	 /**
	   * Constructor for the node object if the next value is known.
	   * @return data Returns the object that this node is carrying.
	   */
	 public Object getData(){
		 return data;
	 }
	 
	 /**
	   * Method to set the object that is being carried by this node.
	   * @param value the object this node will be set to carry.
	   */
	 public void setData(Object value){
		 data = value;
	 }
	 
	 /**
	   * Method to set the object that is being carried by this node.
	   * @return next Returns the next node in the data structure that comes after this one.
	   */
	 public Node getNext(){
		 return next;
	 }
	 
	 /**
	   * Method to set the node that is next after this node.
	   * @param nextNode the node to set to be the next.
	   */
	 public void setNext(Node nextNode){
		 next = nextNode;
	 }
	 
	 /**
	   * Returns the String version of the UUID (This is not very human readable).
	   * @return uniqueID the UUID.
	   */
	 public String toString(){
		 return uniqueID;
	 }
	 
	 /**
	   * Returns the first 5 digits of a UUID. This is used for personal, quick, visual testing.
	   * @return testID A human readable UUID.
	   */
	 public String readableID(){
		 return testID;
	 }
}
