import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;




public abstract class itemCategory extends Iconable{
	Program hostProgram;
	protected String name;
	public ArrayList<Item> items;
	public Point location;
	protected Image icon;
	public Button button;
	protected final int defaultWidth = 100;
	protected final int defaultHeight = 100;

	itemCategory(Program host, JFrame hostFrame, String name, ArrayList<Item> items, Point loc, Image icon){
		this.hostProgram = host;
		this.name = name;
		this.items = items;
		this.location = loc;
		this.icon = icon;
		String[] temp = {""};
		
		this.button = new Button(new openItemDisplay(host,this), temp, location.x, location.y, defaultWidth, defaultHeight);
		Iconable.setIcon(hostFrame, this.button, this.icon);
		
	}

	protected final void setName(String n){
		name = n;
	}

	public final String getName(){
		return name;
	}

	public final void setItems(ArrayList<Item> i){
		items = i;
	}
	public final ArrayList<Item> getItems(){
		return items;
	}
	public final void addItem(Item i){
		items.add(i);
	}
	public final void removeItem(Item i){
		items.remove(i);
	}
	public final Iterator<Item> getIterator(){
		return items.iterator();
	}
	public final ArrayList<Item> getItemsBeingPurchased(){
		ArrayList<Item> retval = new ArrayList<Item>();
		for (Item i : items){
			if(i.getAmount()>0){
				retval.add(i);
			}
		}
		return retval;
	}
	public final void setLoc(Point loc){
		location = loc;
	}

	public final Point getLoc(){
		return location;
	}
	protected final void setImage(Image i){
		icon = i;
	}
	public final Image getImage(){
		return icon;
	}

	
	
	public int getWidth(){
		return defaultWidth;
	}
	public int getHeight(){
		return defaultHeight;
	}

}


class NasaSpaceShips extends itemCategory{

	NasaSpaceShips(Program host, JFrame hostFrame, String name,
			ArrayList<Item> items, Point loc, Image icon) {
		super(host, hostFrame, name, items, loc, icon);
		
		
		items.add(new Gemini(hostProgram, hostFrame, "Gemini", 01001, 5, new Point((int) (itemDisplay.width*0.1)*host.DISPLAY_WIDTH/100, (int)(itemDisplay.height*0.1)*host.DISPLAY_HEIGHT/100), Iconable.loadIcon(host, "Images/GEMINI.jpg"), (int)(itemDisplay.width*.4)*host.DISPLAY_WIDTH/100, (int)(itemDisplay.height*.4)*host.DISPLAY_HEIGHT/100));
	System.out.println(hostFrame.getHeight()*0.4);
	}


}


