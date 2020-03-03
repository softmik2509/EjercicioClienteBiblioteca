package org.certificatic.ejercicio.biblioteca.cliente;

import java.util.List;

import org.certificatic.ejercicio.biblioteca.service.BibliotecaService;
import org.certificatic.ejercicio.biblioteca.service.BibliotecaServiceImplService;
import org.certificatic.ejercicio.biblioteca.service.Libro;


public class ClienteBiblioteca {

	/**
	 * Implementacion de la logica del cliente de biblioteca
	 * @author Miguel Vega
	 */
	private BibliotecaService service = new BibliotecaServiceImplService().getBibliotecaServiceImplPort(); 
	
	/**
	 * Registra un libro
	 * @param libro
	 * @return
	 */
	public Libro registrarLibro(Libro libro) {
		return service.registrarLibro(libro);
	}
	
	/**
	 * Consulta todos los libros existentes
	 * @return
	 */
	public List<Libro> consultarLibros(){
		return service.consultarLibros();
	}
	
	/**
	 * Consulta un libro por isbn
	 * @param isbn
	 * @return
	 */
	public Libro consultarLibro(String isbn) {
		return service.consultarPorIsbn(isbn);
	}
	
	/**
	 * Da de baja un libro del inventario
	 * @param isbn
	 * @return
	 */
	public boolean borrarLibro(String isbn) {
		return service.borrarLibro(isbn);
	}
}
