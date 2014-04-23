import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


public class Iconable {

	
	
	
	
	public static Image loadIcon(Program host, String location){
		Image bIcon = null;
		try{
			bIcon = ImageIO.read(  
				host.getClass().getResource(location)).getScaledInstance(120, 90, Image.SCALE_SMOOTH);  
		}
		catch(Exception e){}
		return bIcon;
	}
	public static void setIcon(JFrame hostFrame, Button b, Image bIcon){
		
			b.setBackground(hostFrame.getContentPane().getBackground());
			b.setBorder(null);
			b.setHoverBackgroundColor(hostFrame.getContentPane().getBackground());
			b.setPressedBackgroundColor(hostFrame.getContentPane().getBackground());
			b.setContentAreaFilled(false);
			b.setVerticalTextPosition(SwingConstants.CENTER);
			b.setHorizontalTextPosition(SwingConstants.CENTER);
			b.setIcon(new ImageIcon(bIcon));
			b.setPressedIcon(new ImageIcon(bIcon));
			
	
}
	
	
}
