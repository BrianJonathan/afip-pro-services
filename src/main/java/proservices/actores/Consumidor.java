Para más información sobre cómo agregar JPA/Hiberante a nuestro proyecto, ver [este tutorial](https://docs.google.com/document/d/1dYvrVLRbFE9qwuKj5biz9oRBaRzj-K6ujIKOXNan02s/edit?ts=57e1f2b8#)
package proservices.actores;

import lombok.Getter;
import lombok.Setter;
import proservices.Persistente;

import javax.persistence.*;

@Entity
@Table(name = "consumidor")
@Setter
@Getter
public class Consumidor extends Persistente {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;
}
