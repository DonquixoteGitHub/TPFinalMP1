package ForAdapter;

import Builder.ConstructorDeEscenarioAbstracto;
import RedFerroviaria.Estacion;
import RedFerroviaria.EstacionReal;
import RedFerroviaria.RedFerroviaria;
import RedFerroviaria.Via;

public class BuilderAdapter implements Builder {

	ConstructorDeEscenarioAbstracto constructor;
	
	public BuilderAdapter(ConstructorDeEscenarioAbstracto c){
		constructor=c;
	}
	
	@Override
	public void buildRailroadNetwork() {
	constructor.construirRedFerroviaria();	

	}

	@Override
	public EstacionReal buildStation(String name) {
		
		return constructor.construirEstacion(name);
	}

	@Override
	public Via buildRailroadTrack(double distance, Estacion c1, Estacion c2) {
		
		return constructor.construirVia(distance, c1, c2);
	}

	@Override
	public RedFerroviaria getRailroadNetwork() {
		
		return constructor.obtenerRedFerroviaria();
	}

	@Override
	public ForAdapter.Estacion buildStation(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
