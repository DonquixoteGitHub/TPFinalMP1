package Decorator;

public class ActivarBarreras extends CaracteristicaDecorator{

	public ActivarBarreras(Caracteristica c) {
		super(c);
		
	}
	@Override
	public void pasaElTren(){
		System.out.println("Activando las barreras");
		super.pasaElTren();
	}

}
