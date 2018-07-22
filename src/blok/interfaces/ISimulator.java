package blok.interfaces;

import org.jbox2d.dynamics.Body;

public interface ISimulator extends Runnable{

	void start();
	void stop();
	void init();
	Body createBody(float x, float y, float width, float height, boolean dynamic, float density, float friction, float restitution);
	void removeBody(Body body);
}
