package Decorator;

public class AvesQueSeEspantan extends CaracteristicaDecorator {

	public AvesQueSeEspantan(Caracteristica c) {
		super(c);
	}
	@Override
	public void pasaElTren(){
		System.out.println("Espantando a las aves");
		super.pasaElTren();
	}

}
