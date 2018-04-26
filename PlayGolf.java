import java.awt.*;
import javax.swing.*;

public class PlayGolf  
{  
	public static void main(String[] args)  
	{ 
		JFrame jf = new JFrame();     
		Golf golf = new Golf();    
		golf.setPreferredSize(new Dimension(320, 180));
        
		jf.add(golf);        
		jf.pack();        
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
		jf.setTitle("Play Golf");        
		jf.setVisible(true);        
		jf.repaint();
       
		for (int x=10; x<300; x++)
		{            
			golf.setBallData(Color.RED, x);           
			golf.repaint(new Rectangle(x,10,10,10));
			
			try
			{ 
				Thread.sleep(90);
			}
			
			catch(Exception e)
			{
			}
			golf.setBallData(Color.WHITE, x);
			golf.repaint(new Rectangle(x, 180,10,10));
		} 
		golf.setBallData(Color.RED, 110);
		golf.repaint(new Rectangle(140,140,10,10));   
	}   
}


