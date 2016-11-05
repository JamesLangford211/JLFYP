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
		//Move m1 = new Move(4);
		Move m2 = new Move(2);
		Move m3 = new Move(1);
		Move m4 = new Move(3);
		Move m5 = new Move(4);
		
		
		Node n1 = new Node(new Move(2));
		IDs.add(n1.toString());
		Node n2 = new Node(m2);
		IDs.add(n2.toString());
		Node n3 = new Node(m3);
		IDs.add(n3.toString());
		Node n4 = new Node(m4);
		IDs.add(n4.toString());
		Node n5 = new Node(m5);
		IDs.add(n5.toString());
		
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
		assertEquals(5,fc.size());
		
		for(int i = 0; i<fc.size(); i++){
			assertEquals(IDs.get(i), fc.get(i).toString());
		}
	}
	
	/**
	 * This test makes sure a node is added correctly.
	 */
	@Test
	public void testAddingNode(){
		Move m6 = new Move(2);
		Node n6 = new Node(m6);
		fc.add(n6);
		assertEquals(6,fc.size());
	}
	
	/**
	 * This tests to see if a node was inserted into a specific place in the data structure correctly.
	 */
	@Test
	public void testAddingSpecificNode(){
		Move m6 = new Move(2);
		Node n6 = new Node(m6);
		fc.add(n6,3);
		String expected = n6.toString();
		
		assertEquals(6,fc.size());
		assertEquals(expected, fc.get(3).toString());
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
