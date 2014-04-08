import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JFrame;


public class itemDisplay extends Display{

	private itemCategory cat;
	public static int width =50;//This is in percentage of screen, not pixel!
	public static int height =50;
	
	public itemDisplay(int x, int y, int w, int h, JFrame f, Program program, itemCategory cat) {
		super(x, y, w, h, f, program);
		this.cat = cat;
		width = w;
		height = h;
		init();
	}


	@Override
	void init() {
		
		
	
		
		Iterator<Item> it = cat.getIterator();
		while(it.hasNext()){
			this.add(it.next().button);
		}
		System.out.println(cat.items.get(0).getLoc());
		repaint();
		
	}


	@Override
	protected void paintComponent(Graphics g) {
	
		
	}

}
