package Decorator;

public class DurmientesFlojos extends CaracteristicaDecorator{

	public DurmientesFlojos(Caracteristica c) {
		super(c);
	}
	@Override
	public void pasaElTren(){
		System.out.println("Despertando a los durmientes flojos");
		super.pasaElTren();
	}

}
