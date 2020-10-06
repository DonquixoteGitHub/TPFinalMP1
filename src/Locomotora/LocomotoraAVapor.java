package Locomotora;

public class LocomotoraAVapor extends Locomotora {

	public LocomotoraAVapor(LocomotoraImp imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}
	public LocomotoraAVapor() {}//eliminar luego de resolver dudas con el bridge

	@Override
	public void encenderMotor() {
		System.out.println("Prendiendo carbon");		
	}

	@Override
	public void enMarcha() {
		System.out.println("Quemando carbon, en marcha");		
	}

	@Override
	public Locomotora clonar() {
		return new LocomotoraAVapor();
	}

	@Override
	public void recargarCombustible() {
		System.out.println("recargando carbon");
		
	}

	@Override
	public void apagarMotor() {
		System.out.println("Apagando carbon");		
	}
	@Override
	public void reportarCombustible() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reportarFallas() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reportarEstadoDelChasis() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reportarSistemaDeFrenos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reportarMotor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reportarComandos() {
		// TODO Auto-generated method stub
		
	}

}
