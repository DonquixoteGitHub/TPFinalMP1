package State;

import Locomotora.Motor;

public class MediaMarcha extends EstadoDelMotor{

	public MediaMarcha(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("El motor se encuentra a toda maquina");
		motor.cambiarEstado(new ATodaMaquina(motor));
		
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
		System.out.println("desacelerando, ahora el motor se encuentra en marcha lenta");
		motor.cambiarEstado(new MarchaLenta(motor));
		
	}

	@Override
	public void frenar() {
		System.out.println("El motor ahora se encuentra en punto muerto");
		motor.cambiarEstado(new PuntoMuerto(motor));
		
	}

	@Override
	public void arreglar() {
		System.out.println("Sin efecto");
		
	}

}
