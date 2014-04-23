import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class rightClickButton extends Button{

	private final ButtonCommands rightClick;
	private String registeredClick = "Left";
	rightClickButton(ButtonCommands command, ButtonCommands rightClickCommand, String[] strs, int x, int y,
			int w, int h) {
		super(command, strs, x, y, w, h);
		this.rightClick = rightClickCommand;
		this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 3) { // if right click
                    registeredClick = "Right";
                    getModel().setPressed(false);
                    simulateClick();
                    // button.setEnabled(true);
                } else {
                	if(registeredClick.equals("Right")){
                	registeredClick = "Left";
                	/*
                	 * Double simulateClick as a left click, as actionPerformed will already have
                	 * been called for a right click, and we need to undo that.
                	 */
                	simulateClick();simulateClick();}else
                		registeredClick = "Left";
                    getModel().setPressed(true);
                    // button.setEnabled(false);
                }
            }
        });
		
	}
	
	public void actionPerformed(ActionEvent arg0){
		if(this.registeredClick.equals("Left")){
			super.actionPerformed(arg0);
		}else{
			rightClick.execute(0);
		}
	}
	public void simulateClick() {
		actionPerformed(new ActionEvent(this, 0, ""));
	}
	
}