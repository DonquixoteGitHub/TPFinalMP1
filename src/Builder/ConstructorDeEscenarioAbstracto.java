package Builder;
import RedFerroviaria.EstacionReal;
import RedFerroviaria.RedFerroviaria;
import RedFerroviaria.Via;



public abstract class ConstructorDeEscenarioAbstracto {

	protected RedFerroviaria rf;
	public void construirRedFerroviaria(){
		rf=RedFerroviaria.getInstance();
	}
	
	public RedFerroviaria obtenerRedFerroviaria(){
		return rf;
	}
	
	public abstract EstacionReal construirEstacion(String nombre);
	public abstract Via construirVia(double l, EstacionReal e1, EstacionReal e2);
}
