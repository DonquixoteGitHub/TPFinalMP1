package Tren;
import Locomotora.Locomotora;
import Locomotora.LocomotoraAVapor;
import Maquinista.Maquinista;
import Maquinista.MaquinistaJubilado;
import Vagon.Vagon;
import Vagon.VagonDePasajerosAntiguo;


public class TrenHistorico extends Tren implements TrenAbstractFactory{
	LocomotoraAVapor l;
	VagonDePasajerosAntiguo v;
	MaquinistaJubilado m;
	@Override
	public Locomotora crearLocomotora() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Vagon crearVagon() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Maquinista crearMaquinista() {
		// TODO Auto-generated method stub
		return null;
	}
}
