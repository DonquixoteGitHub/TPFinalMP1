package Personal;

public abstract class Personal {
private String nombre;

public abstract void firmarEntrada();
public String getNombre(){
	return this.nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}

}
