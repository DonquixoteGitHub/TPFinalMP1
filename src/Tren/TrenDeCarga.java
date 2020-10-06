package Tren;
import Locomotora.Locomotora;
import Locomotora.LocomotoraDiesel;
import Maquinista.EspecialistaEnDiesel;
import Maquinista.Maquinista;
import Vagon.Vagon;
import Vagon.VagonDeCarga;


public class TrenDeCarga extends Tren implements TrenAbstractFactory {

	@Override
	public Locomotora crearLocomotora() {
		return new LocomotoraDiesel();
	}
	
	@Override
	public Vagon crearVagon() {
		return new VagonDeCarga(0, null);
	}
	
	@Override
	public Maquinista crearMaquinista() {
		return new EspecialistaEnDiesel(null);
	}

}
