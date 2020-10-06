package State;

import Locomotora.Motor;

public class Roto extends EstadoDelMotor{

	public Roto(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("Sin efecto");
		
	}

	@Override
	public void encender() {
		System.out.println("Sin efecto");
		
	}

	@Override
	public void apagar() {
		System.out.println("Sin efecto");
		
	}

	@Override
	public void desacelerar() {
		System.out.println("Sin efecto");
		
	}

	@Override
	public void frenar() {
		System.out.println("Sin efecto");
		
	}

	@Override
	public void arreglar() {
		System.out.println("Arreglando Motor");
		motor.cambiarEstado(new MotorApagado(motor));
		
	}

}
