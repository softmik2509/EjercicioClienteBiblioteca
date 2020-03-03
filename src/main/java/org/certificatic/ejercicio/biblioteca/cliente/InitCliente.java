package org.certificatic.ejercicio.biblioteca.cliente;

import java.util.List;

import org.certificatic.ejercicio.biblioteca.service.ClasificacionEnum;
import org.certificatic.ejercicio.biblioteca.service.Libro;

/**
 * Consume las operaciones del servicio de Biblioteca del proyecto en heroku
 * @author Miguel Vega
 * wsimport -keep -verbose http://miguelvega-ejercicio-soap.herokuapp.com/BibliotecaService?wsdl
 */
public class InitCliente 
{
    public static void main(String[] args)
    {
        ClienteBiblioteca cliente = new ClienteBiblioteca();
        
        switch(args[0]) {
        case "alta":
        	Libro libro = new Libro();
        	libro.setIsbn(args[1]);
        	libro.setTitulo(args[2]);
        	libro.setAutor(args[3]);
        	libro.setClasificacion(ClasificacionEnum.CIENCIA);
        	cliente.registrarLibro(libro);
        	System.out.println("Libro creado desde cliente");
        	break;
        	
        case "baja":
        	if(cliente.borrarLibro(args[1])) {
        		System.out.println("Libro : " + args[1] + " BORRADO");
        	}else {
        		System.out.println("NO ENCONTRADO");
        	}
        	
        	break;
        	
        case "todos":
        	List<Libro> libros = cliente.consultarLibros();
        	System.out.println("Consulta todos los libros desde cliente");
        	for(Libro lib : libros) {
        		System.out.println("[" + lib.getIsbn() + " " + lib.getTitulo() + " " + lib.getClasificacion() + "]");
        	}
        	break;
        	
        case "consulta":
        	Libro lib = cliente.consultarLibro(args[1]);
        	System.out.println("Consulta libro desde cliente");
        	System.out.println("[" + lib.getIsbn() + " " + lib.getTitulo() + " " + lib.getClasificacion() + "]");
        	break;
        	
        default:
        	System.out.println("Opcion no valida");
        	break;
        }
    }
}
