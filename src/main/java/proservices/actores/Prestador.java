package proservices.actores;

import lombok.Getter;
import lombok.Setter;
import proservices.Persistente;
import proservices.actores.reputaciones.Reputacion;
import proservices.actores.reputaciones.ReputacionBuena;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "prestador")
@Setter
@Getter
public class Prestador extends Persistente {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "nroDocumento")
    private String nroDocumento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDocumento")
    private TipoDocumento tipoDocumento;

    @Column(name = "fotoPerfil")
    private String foto;

    @Column(name = "cuitCuil")
    private String cuitCuil;

    @ElementCollection
    @CollectionTable(name = "prestador_telefono", joinColumns = @JoinColumn(name = "prestador_id"))
    @Column(name = "telefono")
    private Set<String> telefonos;

    @ElementCollection
    @CollectionTable(name = "prestador_email", joinColumns = @JoinColumn(name = "prestador_id"))
    @Column(name = "email")
    private Set<String> emails;

    @OneToMany(mappedBy = "prestador")
    private List<Disponibilidad> disponibilidades;

    @Column
    private Double radioCoberturaEnKms;

    @OneToOne
    @JoinColumn(name = "reputacion_id")
    private Reputacion reputacion;

    public Prestador() {
        this.disponibilidades = new ArrayList<>();
        this.reputacion = new ReputacionBuena();
    }

    public void agregarDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidades.add(disponibilidad);
        disponibilidad.setPrestador(this);
    }
}
