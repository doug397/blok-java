package block.core;

import blok.interfaces.ICore;
import blok.interfaces.IUIControler;

public class Core implements ICore{

	private IUIControler uiControler;
	
	
	public Core(IUIControler uiControler) {
		this.uiControler = uiControler; 
	}
	
/*	public Core() {
		this.uiControler = new MainWindowControler(1) ;
	}
	*/
	@Override
	public void initGame() {
		
		uiControler.init();
		
	}
	

}
