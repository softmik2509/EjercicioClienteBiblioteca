
package org.certificatic.ejercicio.biblioteca.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.certificatic.ejercicio.biblioteca.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegistrarLibro_QNAME = new QName("http://service.biblioteca.ejercicio.certificatic.org/", "registrarLibro");
    private final static QName _ConsultarPorIsbnResponse_QNAME = new QName("http://service.biblioteca.ejercicio.certificatic.org/", "consultarPorIsbnResponse");
    private final static QName _ConsultarLibrosResponse_QNAME = new QName("http://service.biblioteca.ejercicio.certificatic.org/", "consultarLibrosResponse");
    private final static QName _RegistrarLibroResponse_QNAME = new QName("http://service.biblioteca.ejercicio.certificatic.org/", "registrarLibroResponse");
    private final static QName _BorrarLibroResponse_QNAME = new QName("http://service.biblioteca.ejercicio.certificatic.org/", "borrarLibroResponse");
    private final static QName _ConsultarLibros_QNAME = new QName("http://service.biblioteca.ejercicio.certificatic.org/", "consultarLibros");
    private final static QName _BorrarLibro_QNAME = new QName("http://service.biblioteca.ejercicio.certificatic.org/", "borrarLibro");
    private final static QName _ConsultarPorIsbn_QNAME = new QName("http://service.biblioteca.ejercicio.certificatic.org/", "consultarPorIsbn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.certificatic.ejercicio.biblioteca.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPorIsbnResponse }
     * 
     */
    public ConsultarPorIsbnResponse createConsultarPorIsbnResponse() {
        return new ConsultarPorIsbnResponse();
    }

    /**
     * Create an instance of {@link RegistrarLibro }
     * 
     */
    public RegistrarLibro createRegistrarLibro() {
        return new RegistrarLibro();
    }

    /**
     * Create an instance of {@link RegistrarLibroResponse }
     * 
     */
    public RegistrarLibroResponse createRegistrarLibroResponse() {
        return new RegistrarLibroResponse();
    }

    /**
     * Create an instance of {@link ConsultarLibrosResponse }
     * 
     */
    public ConsultarLibrosResponse createConsultarLibrosResponse() {
        return new ConsultarLibrosResponse();
    }

    /**
     * Create an instance of {@link BorrarLibroResponse }
     * 
     */
    public BorrarLibroResponse createBorrarLibroResponse() {
        return new BorrarLibroResponse();
    }

    /**
     * Create an instance of {@link BorrarLibro }
     * 
     */
    public BorrarLibro createBorrarLibro() {
        return new BorrarLibro();
    }

    /**
     * Create an instance of {@link ConsultarPorIsbn }
     * 
     */
    public ConsultarPorIsbn createConsultarPorIsbn() {
        return new ConsultarPorIsbn();
    }

    /**
     * Create an instance of {@link ConsultarLibros }
     * 
     */
    public ConsultarLibros createConsultarLibros() {
        return new ConsultarLibros();
    }

    /**
     * Create an instance of {@link Libro }
     * 
     */
    public Libro createLibro() {
        return new Libro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarLibro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca.ejercicio.certificatic.org/", name = "registrarLibro")
    public JAXBElement<RegistrarLibro> createRegistrarLibro(RegistrarLibro value) {
        return new JAXBElement<RegistrarLibro>(_RegistrarLibro_QNAME, RegistrarLibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorIsbnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca.ejercicio.certificatic.org/", name = "consultarPorIsbnResponse")
    public JAXBElement<ConsultarPorIsbnResponse> createConsultarPorIsbnResponse(ConsultarPorIsbnResponse value) {
        return new JAXBElement<ConsultarPorIsbnResponse>(_ConsultarPorIsbnResponse_QNAME, ConsultarPorIsbnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarLibrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca.ejercicio.certificatic.org/", name = "consultarLibrosResponse")
    public JAXBElement<ConsultarLibrosResponse> createConsultarLibrosResponse(ConsultarLibrosResponse value) {
        return new JAXBElement<ConsultarLibrosResponse>(_ConsultarLibrosResponse_QNAME, ConsultarLibrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarLibroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca.ejercicio.certificatic.org/", name = "registrarLibroResponse")
    public JAXBElement<RegistrarLibroResponse> createRegistrarLibroResponse(RegistrarLibroResponse value) {
        return new JAXBElement<RegistrarLibroResponse>(_RegistrarLibroResponse_QNAME, RegistrarLibroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarLibroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca.ejercicio.certificatic.org/", name = "borrarLibroResponse")
    public JAXBElement<BorrarLibroResponse> createBorrarLibroResponse(BorrarLibroResponse value) {
        return new JAXBElement<BorrarLibroResponse>(_BorrarLibroResponse_QNAME, BorrarLibroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarLibros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca.ejercicio.certificatic.org/", name = "consultarLibros")
    public JAXBElement<ConsultarLibros> createConsultarLibros(ConsultarLibros value) {
        return new JAXBElement<ConsultarLibros>(_ConsultarLibros_QNAME, ConsultarLibros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarLibro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca.ejercicio.certificatic.org/", name = "borrarLibro")
    public JAXBElement<BorrarLibro> createBorrarLibro(BorrarLibro value) {
        return new JAXBElement<BorrarLibro>(_BorrarLibro_QNAME, BorrarLibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorIsbn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca.ejercicio.certificatic.org/", name = "consultarPorIsbn")
    public JAXBElement<ConsultarPorIsbn> createConsultarPorIsbn(ConsultarPorIsbn value) {
        return new JAXBElement<ConsultarPorIsbn>(_ConsultarPorIsbn_QNAME, ConsultarPorIsbn.class, null, value);
    }

}
