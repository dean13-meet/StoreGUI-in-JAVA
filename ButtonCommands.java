import java.awt.Color;

import javax.swing.JFrame;

public abstract class ButtonCommands{
	Program p;
	ButtonCommands(Program p){
		this.p = p;
	}
	
	abstract void execute(int caseNum);
}

class empty extends ButtonCommands{

	empty(Program p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void execute(int caseNum) {
		// TODO Auto-generated method stub
		
	}
	
}
class createAccount extends ButtonCommands{

	createAccount(Program p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void execute(int caseNum) {
		if(p.getJFrameById("createAccount")==null){
			
		
		p.createJFrame(50, 50, "Create Account", new Color(255,153,0), false, "createAccount");
		JFrame createAccountF = p.getJFrameById("createAccount");
		Display createAccountD = new createAccountDisplay(0,0,createAccountF.getWidth(), createAccountF.getHeight(), createAccountF, p);
		createAccountF.add(createAccountD);
		}else{p.getJFrameById("createAccount").toFront();
	
		
	}
	}
	
}
class signIn extends ButtonCommands{

	signIn(Program p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void execute(int caseNum) {
		if(p.getJFrameById("signIn")==null){
			
		
		p.createJFrame(50, 50, "Sign In", new Color(255,153,0), false, "signIn");
		JFrame signInF = p.getJFrameById("signIn");
		Display signInD = new signInDisplay(0,0,signInF.getWidth(), signInF.getHeight(), signInF, p);
		signInF.add(signInD);
		}else{p.getJFrameById("signIn").toFront();
		
			
		}
	}
	
}


class openItemDisplay extends ButtonCommands{

	itemCategory cat;
	
	openItemDisplay(Program p, itemCategory cat) {
		super(p);
		this.cat = cat;
		// TODO Auto-generated constructor stub
	}

	@Override
	void execute(int caseNum) {
		if(p.getJFrameById(cat.name)==null){
		p.createJFrame(itemDisplay.width, itemDisplay.height, cat.name, new Color(255,153,0), false, cat.name);
		JFrame frame = p.getJFrameById(cat.name);
		frame.add(new itemDisplay(0, 0, frame.getWidth(), frame.getHeight(), frame, p, cat));
		}
		else{
			p.getJFrameById(cat.name).toFront();
		}
	}
	
}