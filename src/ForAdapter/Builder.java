package ForAdapter;

import RedFerroviaria.Estacion;
import RedFerroviaria.RedFerroviaria;
import RedFerroviaria.Via;

/**
 *
 * @author Waldo
 */
public interface Builder {
    
    // El alumno puede renombrar las interfaces Station, RailroadTrack y RailroadNEtwork para simplificar el código
    
    void buildRailroadNetwork();
    Estacion buildStation(String nombre);
    Via buildRailroadTrack(double distance, Estacion c1, Estacion c2);
    RedFerroviaria getRailroadNetwork();
}
