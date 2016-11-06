package finalYearProject;

/**
* Bespoke data structure (pretty much identical to a LinkedList as of v1.0 - may be subject to change)
* 
*
* @author  James Langford
* @version 1.0
* @since   02-11-2016 
*/

public class Flowchart {
	private static int counter;
	private Node head;
	public Node end;
	
	// Constructor
	public Flowchart(){
		counter = 0;
		head = null;
	}
	
	// Appends the element to the end of this list.
	public void add(Object data){
		if(head == null){
			head = new Node(data, null);
		}
		
		
		Node current = head;
		Node temp = new Node(data);
		
		// Check for a null pointer exception
		if(current != null){
			// Iterate to the end of the list and append
			while (current.getNext() != null){				
				current = current.getNext();
			}
			
		temp.setPrevious(current);
		current.setNext(temp);
		}
		incrementCounter();
	}
	
	private int getCounter(){
		return counter;
	}
	
	private void incrementCounter(){
		counter++;
	}
	
	private void decrementCounter(){
		counter--;
	}
	
	//insert into specified location
	public void add(Object data, int index){
		
		Node current = head;
		Node temp = new Node(data);
		
		if(current != null){
			//iterate to requested index
			for(int i = 0; i < index && current.getNext() != null; i++){
				current = current.getNext();
			}
		}
		
		// set temps next node to be this nodes next
		temp.setNext(current.getNext());	
		temp.setPrevious(current);
		
		//this nodes next node will be the new node
		current.setNext(temp);
		current.setPrevious(current.getPrevious());
		
		// increment number of elements
		incrementCounter();
	}
	
	// returns specified index
	public Object get(int index){
		// index must be 1 or higher
		if (index < 0)
			return null;
			Node current = null;
			if (head != null) {
				current = head.getNext();
				for (int i = 0; i < index; i++) {
					if (current.getNext() == null)
						return null;
						current = current.getNext();
					}
					return current.getData();
				}
				return current;
	}
	
	// returns the number of elements in this list.
		public int size() {
			return getCounter();
		}
		
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
 
		// if the index is out of range, exit
		if (index < 0 || index > size())
			return false;
 
		Node current = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return false;
 
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
 
			// decrement the number of elements variable
			decrementCounter();
			return true;
 
		}
		return false;
	}
	
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node current = head.getNext();
			while (current != null) {
				output += current.toString();
				System.out.println();
				current = current.getNext();
			}
 
		}
		return output;
	}
	
	public Node getEnd(){
		Node current = head;		
		// Check for a null pointer exception
		if(current != null){
			// Iterate to the end of the list and append
			while (current.getNext() != null){				
				current = current.getNext();
			}
		}
		return current;
	}
}
		
		
	

