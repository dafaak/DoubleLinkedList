package com.est;

public class DlinkedList {
	private Nodo cabeza;
	private Nodo cola;


	public DlinkedList() {
		
		this.cabeza=null;
		this.cola=null;
	
	}
	
	public boolean estaVacia(){
		return (cabeza==null);
	}
	
	
	
	


	public void insertarInicio(String dato){
		Nodo p=cabeza;
		if (estaVacia()){cabeza=new Nodo(dato);
		cola=cabeza;}
		else{
		Nodo aux=new Nodo(null,cabeza,dato);
		cabeza=aux;     
		cabeza.setSiguiente(p);
		p.setAnterior(cabeza);
		   }
	}
	
	
	public void insertarFinal(String dato){
		Nodo p=cola;
		if (estaVacia()){
			cabeza=new Nodo(dato);
			cola=cabeza;
			
	       	}
		else{
		Nodo aux=new Nodo(cola,null,dato);
		cola.setSiguiente(aux);
		cola=aux;

			
             		
		}
		
		}
	
	
	public Nodo buscarDato(String dato){
		Nodo p=cabeza;
		if (estaVacia()==true){return null;}
		else {
		while(p!=null){
			if( p.getDato().equalsIgnoreCase(dato)){return p;};
			p=p.getSiguiente();}
		
		}
		return null;			
	}
	
	public Nodo buscarDato(int dato){
		Nodo p=cabeza;
		int contador=0;
		if (estaVacia()==true){return null;}
		else {
		while(p!=null){
			contador++;
			if (contador==dato){return p;}
			else {p=p.getSiguiente();}
		}
		return null;			
	}
	
	
	}
	
public void buscarindiceyEliminar(DlinkedList lista,int dato){
	if (lista.buscarDato(dato)!=null){
		Nodo eliminar= lista.buscarDato(dato);
		Nodo p=eliminar.getAnterior();
		Nodo q=eliminar.getSiguiente();
		if (p==null){
	    q.setAnterior(null);
		cabeza=q;
		}
		else{
			if(q==null){  
				p.setSiguiente(null);
				cola=p;
			}
			else {p.setSiguiente(q);
			q.setAnterior(p);}
			
		}
		
		
	}
	
	
}
public String listarFin(){
	if (estaVacia()==true){return "Lista vacia!!!";}
	else{
String salida="";
Nodo p =cola;
{salida+=" Lista de nodos:\n";
salida+=p.getDato()+"\n";
p=p.getAnterior();
while(p!=null){
	salida+=p.getDato()+"\n";
	p=p.getAnterior();}
	
	
}

	return salida;}
}

	
public String listarIni(){
	if (estaVacia()==true){return "Lista vacia!!!";}
	else{
String salida="";
Nodo p =cabeza;
{salida+="Lista de nodos:\n";
salida+=p.getDato()+"\n";
p=p.getSiguiente();
while(p!=null){
	salida+=p.getDato()+"\n";
	p=p.getSiguiente();}
	
	
}

	return salida;
}
}
	}

