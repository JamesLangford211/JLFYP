package finalYearProject;

public class Engine {

	public static void main(String[] args) {

		FlowchartUI flowchartUI = new FlowchartUI(createTestFC());
		

	}
	
	public static Flowchart createTestFC(){
		Flowchart fc = new Flowchart();
		
		// Create a few objects to store on my nodes
		Move m1 = new Move(4);
		Move m2 = new Move(2);
		Move m3 = new Move(1);
		
		Node n1 = new Node(m1);
		Node n2 = new Node(m2);
		Node n3 = new Node(m3);				
		
		// Add the created nodes to the flowchart data structure.
		fc.add(n1);
		fc.add(n2);
		fc.add(n3);
		
		return fc;
	}

}
