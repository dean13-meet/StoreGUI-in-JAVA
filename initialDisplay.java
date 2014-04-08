import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


public class initialDisplay extends Display{

	/*
	Button createAccount;	int cAx;	int cAy;	int cAw;	int cAh;	Image bIcon; 	Image bIconPressed;
	Button signIn;	int sIx;	int sIy;	int sIw;	int sIh;
	*/
	public initialDisplay(int x, int y, int w, int h, JFrame f, Program program) {
		super(x, y, w, h, f, program);
		// TODO Auto-generated constructor stub
		init();
	}

	@Override
	void init() {
		
		ArrayList<Item> nasaItems = new ArrayList<Item>();
		
		NasaSpaceShips nasaCat = new NasaSpaceShips(hostProgram, hostFrame, "Nasa SpaceShips", nasaItems
				, new Point(400,200), Iconable.loadIcon(hostProgram, "Images/NASA.jpg"));
		add(nasaCat.button);
		
		
		/*
		String[] cAtext = new connectToServer().getAllLinesFromFileInArray("test.txt"); cAw = 200;	cAh = 70; cAx = (width-cAw)/2; cAy = (height-cAh)/2 -50;
		createAccount = new Button(new createAccount(hostProgram),cAtext, cAx, cAy, cAw, cAh);
		add(createAccount);
		
		String[] sItext = {"Sign In"}; sIw = 200; sIh = 70; sIx = (width-sIw)/2; sIy = (height-sIh)/2+50;
		signIn = new Button(new signIn(hostProgram), sItext, sIx, sIy, sIw, sIh);
		add(signIn);
		*/
		repaint();
		
	}
	


	@Override
	protected void paintComponent(Graphics g) {
	
		
	}
	
	

}
