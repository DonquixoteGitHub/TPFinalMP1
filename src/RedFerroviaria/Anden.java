package RedFerroviaria;
import Facade.Mecanico;
import Facade.OperarioDeCarga;
import Facade.TrenFacade;
import Memento.MementoAnden;
import Tren.Tren;


public abstract class Anden {
private int numero;
private Tren tren;
private OperarioDeCarga personalDeCarga;
private Mecanico mecanico;
//clase 10
MementoAnden memento;
public void llegaUnTren(Tren t){
	this.tren=t;
}
public void llegaUnTren(TrenFacade trenf){//facade
	mecanico.llegaUnTren(trenf);
	personalDeCarga.llegaUnTren(trenf);
}
public int getNumero(){
	return this.numero;
}

public boolean estaOcupado(){
	if (tren==null)
		return false;
	else
		return true;
}

public boolean estasLibre() {
	//teoria 10
}

//clase 10
public MementoAnden crearMemento() {
	MementoAnden m = new MementoAnden();
	m.obtenerEstado(this);
	return m;
}
public void setEstado() {
	
}///IMPLEMENTAR GET Y SET ESTADO PARA MEMENTO
public void getEstado() {
	
}
}
