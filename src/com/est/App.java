package com.est;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DlinkedList l= new DlinkedList();
		l.insertarInicio("fucken");
		System.out.println(l.listar());
		l.insertarInicio("dafaak");
		System.out.println(l.listar());
		l.insertarFinal("isr");
		System.out.println(l.listar());
		System.out.println(l.buscarDato("ir"));
		l.buscarindiceyEliminar(l, 2);
		System.out.println(l.listar());
	}

}
