import java.awt.*;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel{
	Color randomColor;
	
	public Color generateColor() {
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color rc = new Color(red, green, blue);
		
		return rc;	
	}
	
	public void paintComponent(Graphics g) {

		randomColor =  generateColor();
		g.setColor(randomColor);
		g.fillRect(30, 40, 300, 300);
		
		
		Graphics2D g2d = (Graphics2D) g;
        float lineWidth = 4.0f;
        g2d.setStroke(new BasicStroke(lineWidth));
        
	    int x1 = 90, y1 = 250;
	    int x2 = 150, y2 = 50;
	    int x3 = 400, y3 = 600;
	    g.setColor(randomColor);
	    g.drawLine(x1, y1, x2, y2); 
	    g.drawLine(x2, y2, x3, y3);
	    g.drawLine(x3, y3, x1, y1);
	    
	    
	    randomColor =  generateColor();
		g.setColor(randomColor);
		g.fillOval(150, 160, 250, 250);
		
		randomColor =  generateColor();
		g.setColor(randomColor);
		g.fillRect(70, 120, 150, 400);
		
		randomColor =  generateColor();
		g.setColor(randomColor);
		g.fillRect(200, 60, 250, 20);
		
		
		randomColor =  generateColor();
		g.setColor(randomColor);
		g.fillRect(300, 90, 150, 20);
		

		randomColor =  generateColor();
		g.setColor(randomColor);
		g.fillRect(250, 50, 20, 600);
		
		
		
		g.setColor(Color.WHITE);
		g.fillRect(85, 325, 275, 35);
		
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, 30));
        g.drawString("С днем металлурга!", 90, 350);
		
	}
}
