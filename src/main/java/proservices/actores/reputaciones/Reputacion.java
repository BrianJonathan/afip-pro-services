package proservices.actores.reputaciones;


import proservices.Persistente;
import proservices.actores.Prestador;
import proservices.trabajos.Calificacion;
import proservices.trabajos.Trabajo;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
@Table(name = "reputacion")
public abstract class Reputacion extends Persistente {
    @Column
    private String a;

    public abstract void serContratado(Trabajo trabajo, Prestador prestador);

    public abstract void recibirCalificacion(Calificacion calificacion, Prestador prestador);
}
