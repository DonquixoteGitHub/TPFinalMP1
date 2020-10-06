package State;

import Locomotora.Motor;

public class Apagado extends EstadoDelMotor{

	public Apagado(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("Sin efecto");
		
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor");
		motor.cambiarEstado(new PuntoMuerto(motor));
		
	}

	@Override
	public void apagar() {
		System.out.println("El motor ya esta apagado");
		
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
