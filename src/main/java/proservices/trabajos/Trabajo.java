package proservices.trabajos;

import lombok.Getter;
import lombok.Setter;
import proservices.actores.Consumidor;
import proservices.servicios.Tarea;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trabajo")
@Setter
@Getter
public class Trabajo {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "consumidor_id", referencedColumnName = "id")
    private Consumidor consumidor;

    @ManyToOne
    @JoinColumn(name = "servicioOfrecido_id", referencedColumnName = "id")
    private ServicioOfrecido servicioOfrecido;

    @ManyToMany
    private List<Tarea> tareas;

    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    @Column(name = "horaInicio", columnDefinition = "TIME")
    private LocalTime horaInicio;

    @Column(name = "horaFin", columnDefinition = "TIME")
    private LocalTime horaFin;

    @Embedded
    private Direccion direccion;

    @Column
    private Boolean aceptado;

    @Column
    private Boolean finalizadoSegunConsumidor;

    @Column
    private Boolean finalizadoSegunPrestador;

    public Trabajo() {
        this.tareas = new ArrayList<>();
  package proservices.trabajos;

import lombok.Getter;
import lombok.Setter;
import proservices.actores.Consumidor;
import proservices.servicios.Tarea;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trabajo")
@Setter
@Getter
public class Trabajo {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "consumidor_id", referencedColumnName = "id")
    private Consumidor consumidor;

    @ManyToOne
    @JoinColumn(name = "servicioOfrecido_id", referencedColumnName = "id")
    private ServicioOfrecido servicioOfrecido;

    @ManyToMany
    private List<Tarea> tareas;

    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;

    @Column(name = "horaInicio", columnDefinition = "TIME")
    private LocalTime horaInicio;

    @Column(name = "horaFin", columnDefinition = "TIME")
    private LocalTime horaFin;

    @Embedded
    private Direccion direccion;

    @Column
    private Boolean aceptado;

    @Column
    private Boolean finalizadoSegunConsumidor;

    @Column
    private Boolean finalizadoSegunPrestador;

    public Trabajo() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }
}
