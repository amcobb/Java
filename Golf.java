import java.net.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;
import javax.swing.*;

public class Golf extends JPanel 
{   
	private Color ballColor; 
	private int ballLocX;   
    
	public void setBallData(Color c, int x) 
	{       
		ballLocX=x;     
		ballColor=c;         
	}   
    
	public void paintComponent(Graphics g) 
	{    
		//draw stuff here     
		
		//white      
		g.setColor(Color.WHITE);     
		g.fillRect(0,0,350,500);      
        
		//green        
		g.setColor(Color.GREEN);      
		g.fillRect(0,150,350,40);
        
		//flagpole       
		g.setColor(Color.BLACK);      
		g.drawLine(300,150,300,10);
        
		//flag        
		g.setColor(Color.RED);       
		int [] xFlag={300,300,250};       
		int [] yFlag={10,40,30};       
		g.fillPolygon(xFlag, yFlag, 3);
        
		//weather       
		String cityLoc="2468349&u=c";   

		//substitute with the local code for your city     
		String toParse=getData(cityLoc);
        
		//System.out.println(toParse);      
		String [] p1= toParse.split("CDATA");      
		String [] p2= p1[1].split("\"");      
		String urlString=p2[1];
        
		//System.out.println(urlString);      
		try 
		{           
			URL u = new URL(urlString);          
			BufferedImage logo = ImageIO.read(u);          
			g.drawImage(logo, 0, 0, 60, 60, null);       
		}
        
		catch(Exception e) 
		{
			
		}
     
		//ball     
		g.setColor(ballColor);     
		g.fillOval(ballLocX,140,10,10);      
		System.out.println(ballLocX);   
	}
  
	public static String getData(String zip) 
	{
      
		try 
		{           
			URL zipInfo = new URL("http://weather.yahooapis.com/forecastrss?w="+zip);            
			URLConnection zi = zipInfo.openConnection( );          
			BufferedReader in = new BufferedReader(new InputStreamReader(zi.getInputStream()));           
            
			String inputLine;           
			String response="";

			while ((inputLine = in.readLine()) != null)
			{              
				response+=inputLine;                       
			}            
			in.close();           
			return response;        
		}
        
		catch(Exception e)
		{
        
		}       
		return "No data";   
	}
}




