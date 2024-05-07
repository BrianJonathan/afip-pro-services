package proservices.servicios;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "servicio")
@Setter
@Getter
public class Servicio {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany
    @JoinColumn(name = "servicio_id", referencedColumnName = "id")
    private List<Tarea> tareas;

    public Servicio() {
        this.tareas = new ArrayList<>();
    }
}
