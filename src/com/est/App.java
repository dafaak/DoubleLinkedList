package com.est;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DlinkedList l= new DlinkedList();
		l.insertarInicio("fucken");
		System.out.println(l.listarIni());
		l.insertarInicio("dafaak");
		System.out.println(l.listarIni());
		l.insertarFinal("isr");
		System.out.println(l.listarIni());
		String busqueda="ir";
		System.out.println("Dato a buscar: "+busqueda);
		if(l.buscarDato(busqueda)==null){System.out.println("El dato "+busqueda+" no existe!!!");}
		else{System.out.println("El dato "+busqueda+" si existe!!!");}
		int eliminar=1;
		System.out.println("indice a eliminar "+eliminar);
		l.buscarindiceyEliminar(l, eliminar);
		System.out.println(l.listarIni());
		System.out.println("Lista al reves: \n"+l.listarFin());
	}

}
