package finalYearProject;

public class Move{
	
	public int direction;
	
	/*
	 * A class to represent a move command in a flowchart.
	 * Up is represented by a 1, left a 2, down a 3 and left a 4.
	 * 
	 * @param direction an int used to define what direction this move command specifies.
	 */
	public Move(int direction){
		super();
		this.direction = direction;
	}
	
	/*
	 * Method that returns the int that is used to represent the direction.
	 * @return direction the direction this move object represents
	 */
	public int getDirection(){
		return direction;
	}
	
	/*
	 * Method used to change the value held in the direction attribute.
	 * Will throw an exception if value does not equal between 1-4.
	 * @param newDirection the int value that the direction will be changed to.
	 */
	public void changeDirection(int newDirection){
		direction = newDirection;
	}
}
