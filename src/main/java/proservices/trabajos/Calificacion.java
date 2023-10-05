package proservices.trabajos;

import lombok.Getter;
import lombok.Setter;
import proservices.actores.Prestador;

import javax.persistence.*;

@Entity
@Table(name = "calificacion")
@Setter
@Getter
public class Calificacion {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "opinion", columnDefinitionpackage proservices.trabajos;

import lombok.Getter;
import lombok.Setter;
import proservices.actores.Prestador;

import javax.persistence.*;

@Entity
@Table(name = "calificacion")
@Setter
@Getter
public class Calificacion {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "opinion", columnDefinition = "text")
    private String opinion;

    @Column(name = "puntaje")
    private Integer puntaje;

    @OneToOne
    @JoinColumn(name = "trabajo_id", referencedColumnName = "id")
    private Trabajo trabajo;
}
