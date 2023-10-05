package proservices.actores.reputaciones;

import proservices.actores.Prestador;
import proservices.trabajos.Calificacion;
import proservices.trabajos.Trabajo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regular")
public class ReputacionRegular extends Reputacion {
    @Column
    private String c;

    @Override
    public void serContratado(Trabajo trabajo, Prestador prestador) {
        //TODO
    }

    @Override
    public void recibirCalificacion(Calificacion calificacion, Prestador prestador) {
        //TODO
    package proservices.actores.reputaciones;

import proservices.actores.Prestador;
import proservices.trabajos.Calificacion;
import proservices.trabajos.Trabajo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regular")
public class ReputacionRegular extends Reputacion {
    @Column
    private String c;

    @Override
    public void serContratado(Trabajo trabajo, Prestador prestador) {
        //TODO
    }

    @Override
    public void recibirCalificacion(Calificacion calificacion, Prestador prestador) {
        //TODO
    }
}
