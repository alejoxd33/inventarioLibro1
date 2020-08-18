package com.tienda;

import java.util.ArrayList;
import java.util.List;

import com.tienda.entidades.Libro;

public class Test {

	public static void main(String[] args) {
		
		List<Libro> libros = new ArrayList<Libro>();
		
		Libro l1 = new Libro(1, "Libro 1", 10, 9.8);
		Libro l2 = new Libro(2, "Libro 2", 8, 9.8);
		Libro l3 = new Libro(3, "Libro 3", 5, 1.5);
		
		libros.add(l1);//0
		libros.add(l2);//1
		libros.add(l3);//2
		
		double d1=4;
		double d2=8;
		System.out.println(Double.compare(d1, d2));
		
		
		Libro l4 = libros.get(1);
		System.out.println(l4);
		
		
		l4.setCantidad(100);
		libros.get(1).setPrecio(800);
		l2.setNombre("El principito");
		
		
		System.out.println(l2);
		System.out.println(l4);
		System.out.println(libros.get(1));
		
		
		System.out.println(libros.size());
		

	}

}
