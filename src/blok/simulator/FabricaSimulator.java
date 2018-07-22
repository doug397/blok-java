package blok.simulator;

import blok.interfaces.IFabricaSimulator;
import blok.interfaces.ISimulator;
import blok.interfaces.IThemes;
import blok.themes.MainPanel;

public class FabricaSimulator implements IFabricaSimulator {


	@Override
	public ISimulator createSimulator(IThemes tema) {
		// TODO Auto-generated method stub
		return new Simulator(tema);
	}

	@Override
	public IThemes createThemes() {
		// TODO Auto-generated method stub
		return new MainPanel();
	}

}
