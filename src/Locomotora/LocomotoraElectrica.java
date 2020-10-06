package Locomotora;

public class LocomotoraElectrica extends Locomotora {

	public LocomotoraElectrica(LocomotoraImp imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}
	public LocomotoraElectrica() {}//eliminar nluego de resolver el bridge

	@Override
	public void encenderMotor() {
		System.out.println("electrica enchufada");
		
	}

	@Override
	public void enMarcha() {
		System.out.println("consumiendo electricidad");
		
	}

	@Override
	public Locomotora clonar() {
		return new LocomotoraElectrica();	
	}

	@Override
	public void recargarCombustible() {
		System.out.println("recargando bateria");
	}

	@Override
	public void apagarMotor() {
		System.out.println("Cortando la electricidad del motor");		
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
