package blok.simulator;

import org.jbox2d.dynamics.Body;

import blok.gui.MainPanel;
import blok.interfaces.ISimulator;

public class Simulator3D implements ISimulator {
	
	
	private MainPanel m_mainPanel;
	
	public Simulator3D(MainPanel m_mainPanel) {
		this.m_mainPanel = m_mainPanel;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Body createBody(float x, float y, float width, float height, boolean dynamic, float density, float friction,
			float restitution) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBody(Body body) {
		// TODO Auto-generated method stub
		
	}

}