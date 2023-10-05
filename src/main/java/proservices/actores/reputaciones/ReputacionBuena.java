package proservices.actores.reputaciones;

import proservices.actores.Prestador;
import proservices.trabajos.Calificacion;
import proservices.trabajos.Trabajo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("buena")
public class ReputacionBuena extends Reputacion {
    @Column
    private String b;

    @Override
    public void serContratado(Trabajo trabajo, Prestador prestador) {
        //TODO
    }

    @Override
    public void recibirCalificacion(Calificacion calificacion, Prestador prestador) {
        //package proservices.actores.reputaciones;

import proservices.actores.Prestador;
import proservices.trabajos.Calificacion;
import proservices.trabajos.Trabajo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("buena")
public class ReputacionBuena extends Reputacion {
    @Column
    private String b;

    @Override
    public void serContratado(Trabajo trabajo, Prestador prestador) {
        //TODO
    }

    @Override
    public void recibirCalificacion(Calificacion calificacion, Prestador prestador) {
        //TODO
    }
}
