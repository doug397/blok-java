package blok.interfaces;

import java.util.ArrayList;

import org.jbox2d.dynamics.Body;

public interface IThemes {
	
	void initComponents();
    void playWav(final String wavFile, final int times);
	void setSimulator(ISimulator simulator);
	void bodiesUpdated(ArrayList<Body> bodies);
	void bodiesCreated(ArrayList<Body> bodies);
	

}
