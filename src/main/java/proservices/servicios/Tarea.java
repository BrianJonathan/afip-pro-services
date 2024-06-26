package proservices.servicios;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tarea")
@Setter
@Getter
public class Tarea {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "descripcion", columnDefinition = "text")
    private String descripcion;
}
