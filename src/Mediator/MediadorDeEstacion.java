package Mediator;

import Facade.Mecanico;
import Facade.OperadorDeCabina;
import Facade.PersonalDeSeguridad;
import Facade.SupervisorDeEstacion;
import Personal.PersonalDeCarga;
import Strategy.ControladorDeSemaforos;

public class MediadorDeEstacion implements Mediador{

	//interface completa de todos los objetos participantes
	Administrativo administrativo;
	Mecanico mecanico;
	PersonalDeSeguridad seguridad;
	OperadorDeCabina cabina;
	ControladorDeSemaforos operador;
	PersonalDeCarga cargaDescarga;
	SupervisorDeEstacion supervisor;
	
	//interface de SupervisorDeEstacion
	
	//interface de Mecanico
	
	//interface de Administrativo
	public void necesitoVacaciones() {
		administrativo.necesitoVacaciones();
	}
	public void necesitoUnAyudante() {
		supervisor.necesitoUnAyudante();
	}
	//interface de PersonalDeSeguridad
}
