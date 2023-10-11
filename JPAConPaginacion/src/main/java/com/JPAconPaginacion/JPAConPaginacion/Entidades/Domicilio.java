package com.JPAconPaginacion.JPAConPaginacion.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity // esta clase va a ser una entidad

@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Domicilio extends Base {
    @Column(name = "calle")
    private String Calle;
    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false) // es decir la localidad debe existir antes de intentar relacionarla. No es opcional
    @JoinColumn(name = "fk_localidad")// la foreign key de localidad en nuestra tabla se va a llamar localidad
    private Localidad localidad;
}
