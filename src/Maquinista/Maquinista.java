package Maquinista;

import java.util.Scanner;

import Locomotora.Locomotora;
import Locomotora.Motor;

public class Maquinista {
private String nombre;
private Scanner teclado= new Scanner(System.in);

public Maquinista(String nombre){
	this.nombre=nombre;
}
public String getNombre(){
	return this.nombre;
}
public void estoyListo(){
	System.out.println(getNombre()+ "listo para conducir el tren");
}
public void todoEnOrden(){//facade
	System.out.println("todo en orden");
}
public void existenFallas() {//facade
	System.out.println("No hay fallas");
}

public void manejar(Locomotora l) {
	int opcion=-1;
	while(opcion!=0) {
	System.out.println("Eres el maquinista, elije una opcion para interactuar con la locomotora");
	System.out.println("0- Salir del maquinista");
	System.out.println("1- Encender");
	System.out.println("2- Apagar");
	System.out.println("3- Acelerar");
	System.out.println("4- Desacelerar");
	System.out.println("5- Frenar");
	System.out.println("6- Arreglar motor");
	opcion =teclado.nextInt();
	switch(opcion) {
	case 0:
		System.out.println("Saliendo del maquinista...");
		break;
	case 1:
		l.encender();
		break;
	case 2:
		l.apagar();
		break;
	case 3:
		l.acelerar();
		break;
	case 4:
		l.desacelerar();
		break;
	case 5:
		l.frenar();
		break;
	case 6:
		l.arreglar();
		break;
	default:
		System.out.println("Opcion incorrecta");
		break;
	}
	}
	
	
}
}
