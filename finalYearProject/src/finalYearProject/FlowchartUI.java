package finalYearProject;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class FlowchartUI extends JFrame{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public FlowchartUI(Flowchart fc) throws HeadlessException{
		
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
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Flowchart fc;
		public DrawArea(Flowchart fc){
			this.fc = fc;
			
		}
		
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			for(int i = 0; i<fc.size(); i++){
				if(i == 0){
					Node n = (Node)fc.get(i);
					n.setX(screenSize.width/2);
					n.setY(20);
					Point p = new Point(n.getX(), n.getY());
					//System.out.println(n.getUID() + "\n" + n.getY());
					g.setColor(new Color(144,195,212));
					g.fillRect(p.x, p.y, 200, 100);
				}
				
				else {
				Node n = (Node)fc.get(i);
				n.setX(n.getPrevious().getX());
				n.setY((n.getPrevious().getY() + 20));
				Point p = new Point(n.getX(), n.getY());
				g.setColor(new Color(144,195,212));
				g.fillRect(p.x, p.y, 200, 100);
				}
				
			}
		}
	}
	
