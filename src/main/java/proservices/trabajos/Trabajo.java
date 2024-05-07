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

    public Trabajo(Integer id, Consumidor consumidor, ServicioOfrecido servicioOfrecido, List<Tarea> tareas, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Direccion direccion, Boolean aceptado, Boolean finalizadoSegunConsumidor, Boolean finalizadoSegunPrestador) {
        this.id = id;
        this.consumidor = consumidor;
        this.servicioOfrecido = servicioOfrecido;
        this.tareas = tareas;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.direccion = direccion;
        this.aceptado = aceptado;
        this.finalizadoSegunConsumidor = finalizadoSegunConsumidor;
        this.finalizadoSegunPrestador = finalizadoSegunPrestador;
    }

    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public ServicioOfrecido getServicioOfrecido() {
        return servicioOfrecido;
    }

    public void setServicioOfrecido(ServicioOfrecido servicioOfrecido) {
        this.servicioOfrecido = servicioOfrecido;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }

    public Boolean getFinalizadoSegunConsumidor() {
        return finalizadoSegunConsumidor;
    }

    public void setFinalizadoSegunConsumidor(Boolean finalizadoSegunConsumidor) {
        this.finalizadoSegunConsumidor = finalizadoSegunConsumidor;
    }

    public Boolean getFinalizadoSegunPrestador() {
        return finalizadoSegunPrestador;
    }

    public void setFinalizadoSegunPrestador(Boolean finalizadoSegunPrestador) {
        this.finalizadoSegunPrestador = finalizadoSegunPrestador;
    }
}
