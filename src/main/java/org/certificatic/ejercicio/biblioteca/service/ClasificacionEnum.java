
package org.certificatic.ejercicio.biblioteca.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clasificacionEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="clasificacionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CIENCIA"/>
 *     &lt;enumeration value="SOCIALES"/>
 *     &lt;enumeration value="ENTRETENIMIENTO"/>
 *     &lt;enumeration value="NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clasificacionEnum")
@XmlEnum
public enum ClasificacionEnum {

    CIENCIA,
    SOCIALES,
    ENTRETENIMIENTO,
    NA;

    public String value() {
        return name();
    }

    public static ClasificacionEnum fromValue(String v) {
        return valueOf(v);
    }

}
