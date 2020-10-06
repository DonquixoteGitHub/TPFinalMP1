package Locomotora;

public class LocomotoraDiesel extends Locomotora {

	public LocomotoraDiesel(LocomotoraImp imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}
	public LocomotoraDiesel() {}//eliminar luego de resolver el patron bridge

	@Override
	public void encenderMotor() {
		System.out.println("Diesel encendida");
		
	}

	@Override
	public void enMarcha() {
		System.out.println("Quemando gasoil");
		
	}

	@Override
	public Locomotora clonar() {
		return new LocomotoraDiesel();
	}

	@Override
	public void recargarCombustible() {
		System.out.print("Recargando combustible diesel");		
	}

	@Override
	public void apagarMotor() {
		System.out.println("Diesel apagada");		
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
