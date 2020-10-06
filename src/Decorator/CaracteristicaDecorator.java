package Decorator;

public abstract class CaracteristicaDecorator implements Caracteristica {
	
	protected Caracteristica caracteristica;
	
	public CaracteristicaDecorator(Caracteristica c){
		caracteristica=c;
	}
	public void pasaElTren() {
		caracteristica.pasaElTren();

	}

}
