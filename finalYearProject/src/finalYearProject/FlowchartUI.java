package finalYearProject;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;

public class FlowchartUI extends JFrame{
	
	public FlowchartUI(Flowchart fc) throws HeadlessException{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width/2;
		int height = (int)Math.round(screenSize.height * 0.8);
		setSize(width , height );
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new DrawArea(fc));
		setVisible(true);
	}
	
}

	class DrawArea extends JPanel{
		Point A = null;
		public DrawArea(Flowchart fc){
			ArrayList<Node> nodes = new ArrayList<Node>();
			for(int i = 0; i<fc.size();i++){
				
			}
			A = new Point(20,20);
			
		}
		
		@Override
		protected void paintComponent(Graphics g){
			g.drawRect(A.x, A.y, 50, 50);
		}
	}
	
