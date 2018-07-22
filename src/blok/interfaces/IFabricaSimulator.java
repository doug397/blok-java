package blok.interfaces;

public interface IFabricaSimulator {

	ISimulator createSimulator(IThemes tema);
	
	IThemes createThemes();
	
}
