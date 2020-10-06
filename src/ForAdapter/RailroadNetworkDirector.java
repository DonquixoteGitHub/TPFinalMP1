package ForAdapter;



/**
 *
 * @author Waldo
 */
public class RailroadNetworkDirector {
    
    // El alumno puede renombrar las interfaces Station, RailroadTrack y RailroadNetwork para simplificar el código
    
    // NO se puede renombrar la interface Builder, el alumno deberá implementar el patrón Adapter para resolver este aspecto
    
    public static RedFerroviaria buildRailRoadNetworkFromGraph(Builder builder, String[] stationsNames, String[] connections){
        int cStations = stationsNames.length;
        int cConnections = connections.length;
        
        Estacion[] stations = new Estacion[cStations];
        Estacion s1, s2;
        
        Via track;
        
        builder.buildRailroadNetwork();
        
        for(int i = 0; i < cStations; i++){
            stations[i] = builder.buildStation(stationsNames[i]);
        }
        for(int i = 0; i < cConnections; i++){
            String[] connection = connections[i].split(",");
            s1 = stations[Integer.parseInt(connection[0])];
            s2 = stations[Integer.parseInt(connection[1])];
            track = builder.buildRailroadTrack(Double.parseDouble(connection[2]), s1, s2);
            
            // El alumno puede renombrar los métodos addConnection1 y addConnection0 para simplificar el código
            s1.addConnection1(track);
            s2.addConnection0(track);
        }

	return builder.getRailroadNetwork();
    }
}
