package Tren;
import Locomotora.Locomotora;
import Maquinista.Maquinista;
import Vagon.Vagon;


public interface TrenAbstractFactory {

	Locomotora crearLocomotora();
	Vagon crearVagon();
	Maquinista crearMaquinista();

}
