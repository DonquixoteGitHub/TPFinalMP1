package State;

import Locomotora.Motor;

public class MarchaLenta extends EstadoDelMotor{

	public MarchaLenta(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("pasando a media marcha");
		motor.cambiarEstado(new MediaMarcha(motor));
		
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
		System.out.println("El motor esta en punto muerto");
		motor.cambiarEstado(new PuntoMuerto(motor));
		
	}

	@Override
	public void frenar() {
		System.out.println("Frenando, el motor ahora se encuentra en punto muerto");
		motor.cambiarEstado(new PuntoMuerto(motor));
		
	}

	@Override
	public void arreglar() {
		System.out.println("Sin efecto");
		
	}

}
