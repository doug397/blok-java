package block.themes.factory2;

import blok.interfaces.IFabricaThemes;
import blok.interfaces.IThemes;

public class FabricaThemeGelo implements IFabricaThemes {

	@Override
	public IThemes createTheme() {
		// TODO Auto-generated method stub
		return new PanelGelo();
	}

}
