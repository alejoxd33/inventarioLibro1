package com.tienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.tienda.entidades.Libro;

public class Inventario {
	
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
	
	public Libro getLibro(int id) {
		for(Libro libro:libros) {
			if(libro.getId() == id)
				return libro;
		}
		return null;
	}
	
	public void actualizarInventario(int idLibro, int cantidad) {
		Libro result = getLibro(idLibro);
		if(result != null) {
			int cantidadActual = result.getCantidad();
			result.setCantidad(cantidadActual + cantidad);
		}
	}
	
	public void venderLibro(Libro libro, int cantidad) {
		
	}
	
	private void ordernarLibrosPorPrecio(){
		Collections.sort(libros, new Comparator<Libro>() {
			public int compare(Libro libro1, Libro libro2) {
				return Double.compare(libro2.getPrecio(), libro1.getPrecio());
			}
		});
	}
	
	private void ordernarLibrosPorCantidad(){
		Collections.sort(libros, new Comparator<Libro>() {
			public int compare(Libro libro1, Libro libro2) {
				return Integer.compare(libro2.getCantidad(), libro1.getCantidad());
			}
		});
	}
	
	private ArrayList<Libro> tresPrimerosLibros(){
		ArrayList<Libro> result = new ArrayList<>();
		
		int size = libros.size(); 
		if(size>2)
			size = 3;
			
		for(int i=0;i<size;i++) {
			result.add(libros.get(i));
		}
		
		return result;
	}
	
	public ArrayList<Libro> librosMasCostosos(){
		ordernarLibrosPorPrecio();
		return tresPrimerosLibros();
	}
	
	public ArrayList<Libro> librosMasCantidad(){
		ordernarLibrosPorCantidad();
		return tresPrimerosLibros();
	}

}

class CompararPrecios implements Comparator<Libro> {

	@Override
	public int compare(Libro libro1, Libro libro2) {
		return Double.compare(libro2.getPrecio(), libro1.getPrecio());
	}
	
}







