package Locomotora;
import Prototype.MotorClonable;
import Prototype.PrototipoClonable;
import State.EstadoDelMotor;
import State.MotorApagado;


public class Motor implements MotorClonable{

	EstadoDelMotor estadoDelMotor;//state
	
	public Motor() {//state
		estadoDelMotor = new MotorApagado(this);
	}
	public void acelerar() {//state
		estadoDelMotor.acelerar();
	}
	public void apagar() {
		estadoDelMotor.apagar();
	}
	public void encender() {
		estadoDelMotor.encender();
	}
	public void desacelerar() {
		estadoDelMotor.desacelerar();
	}
	public void frenar() {
		estadoDelMotor.frenar();
	}
	public void arreglar() {
		estadoDelMotor.arreglar();
	}
	
	
	public void cambiarEstado(EstadoDelMotor em) {
		estadoDelMotor=em;
	}
	
	@Override
	public PrototipoClonable clonar() {
		return new Motor();
	}

	public void hacerRevision() {
		System.out.println("Motor revisado, todo funciona correctamente");
	}
	
	
}
