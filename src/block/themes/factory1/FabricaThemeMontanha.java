package block.themes.factory1;

import blok.interfaces.IFabricaThemes;
import blok.interfaces.IThemes;

public class FabricaThemeMontanha implements IFabricaThemes {

	@Override
	public IThemes createTheme() {
		// TODO Auto-generated method stub
		return new MainPanel();
	}

}
