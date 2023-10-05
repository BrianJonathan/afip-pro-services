package proservices.actores;


import lombok.Getter;
import lombok.Setter;
import proservices.converters.DiaDeSemanaConverter;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table(name = "disponibilidad")
@Setter
@Getter
public class Disponibilidad {
    @Id
    @GeneratedValue
    private Integer id;

package proservices.actores;


import lombok.Getter;
import lombok.Setter;
import proservices.converters.DiaDeSemanaConverter;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table(name = "disponibilidad")
@Setter
@Getter
public class Disponibilidad {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "prestador_id", referencedColumnName = "id")
    private Prestador prestador;

    @Convert(converter = DiaDeSemanaConverter.class)
    @Column(name = "dia")
    private DayOfWeek dia;

    @Column(name = "horaInicio", columnDefinition = "TIME")
    private LocalTime horaInicio;

    @Column(name = "horaFin", columnDefinition = "TIME")
    private LocalTime horaFin;

}
