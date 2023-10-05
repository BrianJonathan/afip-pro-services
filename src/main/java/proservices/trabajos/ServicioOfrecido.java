package proservices.trabajos;

import lombok.Getter;
import lombok.Setter;
import proservices.actores.Prestador;
import proservices.servicios.Servicio;
import proservices.servicios.Tarea;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "servicio_ofrecido")
@Setter
@Getter
public class ServicioOfrecido {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "id")
    private Servicio servicio;

    package proservices.trabajos;

import lombok.Getter;
import lombok.Setter;
import proservices.actores.Prestador;
import proservices.servicios.Servicio;
import proservices.servicios.Tarea;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "servicio_ofrecido")
@Setter
@Getter
public class ServicioOfrecido {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "prestador_id", referencedColumnName = "id")
    private Prestador prestador;

    @ElementCollection
    @CollectionTable(name = "servicio_ofrecido_foto", joinColumns = @JoinColumn(name = "servicioOfrecido_id"))
    @Column(name = "ruta")
    private List<String> fotos;

    @Column(name = "experiencias", columnDefinition = "TEXT")
    private String experiencias;

    @ManyToMany
    private List<Tarea> tareas;

    public ServicioOfrecido() {
        this.tareas = new ArrayList<>();
        this.fotos = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public void agregarFoto(String foto) {
        this.fotos.add(foto);
    }
}
