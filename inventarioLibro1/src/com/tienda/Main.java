package com.tienda;

import java.util.ArrayList;
import java.util.List;

import com.tienda.entidades.Libro;

public class Main {
	
	public static void main(String[] args) {
		List<Libro> libros = new ArrayList<Libro>();
		
		Inventario inventario = new Inventario();
		
		
		Libro l1 = new Libro(1, "\nLibro 1", 10, 9.8);
		Libro l2 = new Libro(2, "\nLibro 2", 8, 200);
		Libro l3 = new Libro(3, "\nLibro 3", 25, 100);
		Libro l4 = new Libro(5, "\nLibro 4", 15, 50);
		Libro l5 = new Libro(5, "\nLibro 5", 15, 50);
		Libro l6 = new Libro(6, "\nLibro 6", 5, 20);
		
		inventario.agregarLibro(l1);
		inventario.agregarLibro(l2);
		inventario.agregarLibro(l3);
		inventario.agregarLibro(l4);
		inventario.agregarLibro(l5);
		inventario.agregarLibro(l6);
		
		 inventario.actualizarInventario(2, 10);
		 inventario.actualizarInventario(1, 20);
		
		List<Libro> l = inventario.librosMasCostosos();
		System.out.println(l);
		
		
		libros.add(l1);
		libros.add(l2);
		
		/*for (int i = 0; i < libros.size(); i++) {
			Libro l = libros.get(i);
			System.out.println(l);
		}
		System.out.println("");
		for(Libro l: libros) {
			System.out.println(l.getId());
		}*/
		
		System.out.println(libros.size());
		
		
		
	}

}
