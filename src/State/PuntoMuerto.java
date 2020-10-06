package State;

import Locomotora.Motor;

public class PuntoMuerto extends EstadoDelMotor{

	public PuntoMuerto(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("Nos ponemos en marcha");
		
		motor.cambiarEstado(new MarchaLenta(motor));
		
	}

	@Override
	public void encender() {
		System.out.println("Sin efecto");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor");
		motor.cambiarEstado(new MotorApagado(motor));
		
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
