import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;




public class itemCategory extends itemObject{
	Program hostProgram;

	public ArrayList<Item> items;
	public Point location;
	protected Image icon;
	public Button button;
	protected final int defaultWidth = 100;
	protected final int defaultHeight = 100;
	


	itemCategory(Program host, JFrame hostFrame, String name, String code, ArrayList<Item> items, Point loc, Image icon){
		this.hostProgram = host;
		this.name = name;
		this.code = code;
		this.items = items;
		this.location = loc;
		this.icon = icon;
		String[] temp = {""};
		
		this.button = new Button(new openItemDisplay(host,this), temp, location.x, location.y, defaultWidth, defaultHeight);
		Iconable.setIcon(hostFrame, this.button, this.icon);
		
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

	NasaSpaceShips(Program host, JFrame hostFrame, String name, String code,
			ArrayList<Item> items, Point loc, Image icon) {
		super(host, hostFrame, name, code, items, loc, icon);
		// TODO Auto-generated constructor stub
	}



	


}


