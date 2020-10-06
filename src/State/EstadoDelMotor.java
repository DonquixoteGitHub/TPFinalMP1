package State;

import Locomotora.Motor;

public abstract class EstadoDelMotor {

	Motor motor;
	
	public EstadoDelMotor(Motor m) {
		motor=m;
	}
	
	public abstract void acelerar();
	public abstract void encender();
	public abstract void apagar();
	public abstract void desacelerar();
	public abstract void frenar();
	public abstract void arreglar();
	
}
