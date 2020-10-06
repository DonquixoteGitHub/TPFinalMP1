package State;

import Locomotora.Motor;

public class ATodaMaquina extends EstadoDelMotor{

	public ATodaMaquina(Motor m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("El motor se ha roto");
		motor.cambiarEstado(new Roto(motor));
		
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desacelerar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arreglar() {
		// TODO Auto-generated method stub
		
	}

}
