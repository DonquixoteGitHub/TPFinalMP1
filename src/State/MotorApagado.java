package State;

import Locomotora.Motor;

public class MotorApagado extends EstadoDelMotor{

	public MotorApagado(Motor m) {
		super(m);
		
	}

	@Override
	public void acelerar() {
		System.out.println("Sin efecto");
		
	}

	@Override
	public void encender() {
		System.out.println("Motor encendido");
		motor.cambiarEstado(new PuntoMuerto(motor));
		
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
		System.out.println("Sin efecto");
		
	}

	
	
}
