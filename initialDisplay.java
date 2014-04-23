import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;


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
		
	
		ArrayList<itemCategory> categories = new ArrayList<itemCategory>();
		categories.add(new NasaSpaceShips(hostProgram, hostFrame, "Nasa SpaceShips", "01", new ArrayList<Item>()
				, new Point(400,200), Iconable.loadIcon(hostProgram, "Images/NASA.jpg")));
		
		for(itemCategory c: categories){
			add(c.button);
		}
			
		itemCategory current = (itemCategory) categories.getCatByCode("01");
		current.items.add(new Gemini(hostProgram, hostFrame, "Gemini", "01001", 5, new Point((int) (itemDisplay.width*0.1)*current.hostProgram.DISPLAY_WIDTH/100, (int)(itemDisplay.height*0.1)*current.hostProgram.DISPLAY_HEIGHT/100), Iconable.loadIcon(current.hostProgram, "Images/GEMINI.jpg"), (int)(itemDisplay.width*.3)*current.hostProgram.DISPLAY_WIDTH/100, (int)(itemDisplay.height*.3)*current.hostProgram.DISPLAY_HEIGHT/100));
		current.items.add(new Apollo(hostProgram, hostFrame, "Apollo", "01002", 7, new Point((int) (itemDisplay.width*0.6)*current.hostProgram.DISPLAY_WIDTH/100, (int)(itemDisplay.height*0.1)*current.hostProgram.DISPLAY_HEIGHT/100), Iconable.loadIcon(current.hostProgram, "Images/APOLLO.jpg"), (int)(itemDisplay.width*.3)*current.hostProgram.DISPLAY_WIDTH/100, (int)(itemDisplay.height*.3)*current.hostProgram.DISPLAY_HEIGHT/100));
		
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
