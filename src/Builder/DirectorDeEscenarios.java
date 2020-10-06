package Builder;
import RedFerroviaria.EstacionReal;
import RedFerroviaria.RedFerroviaria;
import RedFerroviaria.Via;



public class DirectorDeEscenarios {

	public static RedFerroviaria construirRedSimple(ConstructorDeEscenarioAbstracto constructor){
		constructor.construirRedFerroviaria();
		EstacionReal e1=constructor.construirEstacion("Brendam");
		EstacionReal e2=constructor.construirEstacion("Wellsworth");
		Via v = constructor.construirVia(29.8, e1, e2);
		e1.agregarConexion(v);
		e2.agregarConexion(v);
		return constructor.obtenerRedFerroviaria();
	}
}
