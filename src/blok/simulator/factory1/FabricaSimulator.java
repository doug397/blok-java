package blok.simulator.factory1;

import block.themes.factory1.MainPanel;
import block.themes.factory2.PanelGelo;
import blok.interfaces.IFabricaSimulator;
import blok.interfaces.ISimulator;
import blok.interfaces.IThemes;

public class FabricaSimulator implements IFabricaSimulator {


	@Override
	public ISimulator createSimulator(IThemes tema) {
		// TODO Auto-generated method stub
		return new Simulator(tema);
	}

	/*@Override
	public IThemes createThemes() {
		// TODO Auto-generated method stub
		return new MainPanel();
	}
*/
}
