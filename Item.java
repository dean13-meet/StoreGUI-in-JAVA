import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public abstract class Item extends Iconable{

	Program hostProgram;
	protected String name;
	protected int code;
	protected int price;
	protected int amount;
	protected int totalPrice;
	public Point location;
	protected Image icon;
	public Button button;
	protected int defaultWidth;
	protected int defaultHeight;
	

	Item(Program host, JFrame hostFrame, String name, int code, int price, Point loc, Image i, int width, int height){
		this.hostProgram = host;
		this.name = name;
		this.code = code;
		this.price = price;
		this.amount = 0;
		calcTotalPrice();
		this.location = loc;
		this.icon = i;
		this.defaultHeight = height;
		this.defaultWidth = width;
		
		String[] temp = {""};
		
		this.button = new Button(new empty(host), temp, location.x, location.y, defaultWidth, defaultHeight);
		Iconable.setIcon(hostFrame, this.button, this.icon);
	}
	
	protected final void setName(String n){
		name = n;
	}
	
	public final String getName(){
		return name;
	}
	
	protected final void setCode(int n){
		code = n;
	}
	
	public final int getCode(){
		return code;
	}
	
	protected final void setPrice(int n){
		price = n;
	}
	
	public final int getPrice(){
		return price;
	}
	
	public final void setAmount(int n){
		amount = n;
	}
	public final int getAmount(){
		return amount;
	}
	public final void incrementAmount(){
		amount++;
	}
	public final void decrementAmount(){
		if(amount>=1)
		amount--;
	}
	
	public final void calcTotalPrice(){
		totalPrice = price*amount;
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
}
