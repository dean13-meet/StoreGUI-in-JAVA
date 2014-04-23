import java.awt.Font;
import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.ArrayList;


public class itemDisplay extends Display{

	private itemCategory cat;
	public static int width =50;//This is in percentage of screen, not pixel!
	public static int height =50;
	private ArrayList<JLabel> prices = new ArrayList<JLabel>();
	private ArrayList<JLabel> amounts = new ArrayList<JLabel>();
	
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
			Item i = it.next();
			this.add(i.button);
			JLabel price =new JLabel("Price: " + Integer.toString(i.getPrice())+"$");
			price.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 15));
			price.setBounds(i.button.getX(), i.button.getY() + i.button.getHeight(), i.button.getWidth()/2, 25);
			prices.add(price);
			
			JLabel amount = new JLabel("Amount: " + Integer.toString(i.getAmount()));
			amount.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 15));
			amount.setBounds(i.button.getX() + i.button.getWidth()/2, i.button.getY() + i.button.getHeight(), i.button.getWidth()/2, 25);
			amounts.add(amount);
		}
		for(JLabel l : prices){
			add(l);
		}
		for(JLabel l : amounts){
			add(l);
		}
		System.out.println(cat.items.get(0).getLoc());
		repaint();
		
	}


	@Override
	protected void paintComponent(Graphics g) {
		for(int i = 0 ; i < amounts.size()&&i<cat.items.size(); i++){
			amounts.get(i).setText("Amount: " + Integer.toString(cat.items.get(i).getAmount()));
		}
	}

}
