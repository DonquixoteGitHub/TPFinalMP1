package Tren;
import Locomotora.Locomotora;
import Locomotora.LocomotoraElectrica;
import Maquinista.EspecialistaEnElectrica;
import Maquinista.Maquinista;
import Vagon.Vagon;
import Vagon.VagonDePasajeros;


public class TrenDePasajeros extends Tren implements TrenAbstractFactory{

	@Override
	public Locomotora crearLocomotora() {
		return new LocomotoraElectrica();
	}

	@Override
	public Vagon crearVagon() {//parametrizar
		return new VagonDePasajeros(0, 0);
	}

	@Override
	public Maquinista crearMaquinista() {//parametrizar
		return new EspecialistaEnElectrica(null);
	}
	

}
