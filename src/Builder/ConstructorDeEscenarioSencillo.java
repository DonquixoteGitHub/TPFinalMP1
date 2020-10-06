package Builder;
import RedFerroviaria.EstacionReal;
import RedFerroviaria.Via;
import java.util.Random;



public class ConstructorDeEscenarioSencillo extends ConstructorDeEscenarioAbstracto{

	@Override
	public EstacionReal construirEstacion(String nombre) {
		EstacionReal e=new EstacionReal(nombre);
		rf.agregarEstacion(e);
		return e;
	}

	@Override
	public Via construirVia(double l, EstacionReal e1, EstacionReal e2) {
		Random r = new Random();
		int c = r.nextInt(4);
		return new Via(l,e1,e2);
	}
	
}
