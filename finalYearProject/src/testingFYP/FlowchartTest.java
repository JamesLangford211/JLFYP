package testingFYP;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;
import finalYearProject.*;

/**
* A JUnit test class used to drive development of the flowchart data structure and ensure information 
* within it is being changed, added and removed correctly.
*
* @author  James Langford
* @version 1.0
* @since   02-11-2016 
*/

public class FlowchartTest {
	Flowchart fc;
	ArrayList<String> IDs = new ArrayList<String>();
	
	/**
	 * Set up method will just add a few nodes ready to be tested.
	 */
	@Before
	public void setUp(){
		
		//instantiate a flowchart object
		fc = new Flowchart();
		
		// Create a few objects to store on my nodes
		Move m1 = new Move(4);
		Move m2 = new Move(2);
		Move m3 = new Move(1);
		Move m4 = new Move(3);
		Move m5 = new Move(4);
		
		// Adds the object to the node, this could be done in one line per node, but I separated
		// them for clarity.
		Node n1 = new Node(m1, null);
		IDs.add(n1.getUID()); // I also retrieve the ID and put them into a list so I
		Node n2 = new Node(m2,n1); // can check later that things are being moved properly.
		IDs.add(n2.getUID());
		Node n3 = new Node(m3,n2);
		IDs.add(n3.getUID());
		Node n4 = new Node(m4,n3);
		IDs.add(n4.getUID());
		Node n5 = new Node(m5,n4);
		IDs.add(n5.getUID());
		
		// Add the created nodes to the flowchart data structure.
		fc.add(n1);
		fc.add(n2);
		fc.add(n3);
		fc.add(n4);
		fc.add(n5);
	}
	
	/**
	 * This tests all of the information has been added to the flowchart correctly.
	 */
	@Test
	public void testFlowchartInit(){
		assertEquals(5,fc.size()); // I have added 5 nodes, so ensure the size of the flowchart is 5 + the edges connecting them: 
		
		for(int i = 0; i<fc.size(); i++){
			// Compare the order of the IDs in the flowchart to what was stored earlier.
			assertEquals(IDs.get(i), ((Node) fc.get(i)).getUID()); 
		}
	}
	
	/**
	 * This test makes sure a node is added correctly.
	 */
	@Test
	public void testAddingNode(){
		Move m6 = new Move(2);
		Node n6 = new Node(m6,fc.getEnd());
		fc.add(n6);
		assertEquals(6,fc.size());
	}
	
	/**
	 * This tests to see if a node was inserted into a specific place in the data structure correctly.
	 */
	@Test
	public void testAddingSpecificNode(){
		Move m6 = new Move(2);
		Node n6 = new Node(m6,null);
		fc.add(n6,3);
		String expected = n6.getUID();
		
		assertEquals(6,fc.size());
		assertEquals(expected, ((Node) fc.get(3)).getUID());
	}

	/**
	 * This tests to see if a node can be removed.
	 */
	@Test
	public void testRemovingNode(){
		fc.remove(3);
		assertEquals(4,fc.size());
	}
}
