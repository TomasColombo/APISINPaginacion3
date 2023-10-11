package com.JPAconPaginacion.JPAConPaginacion.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity // esta clase va a ser una entidad

@Table(name = "Localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Localidad extends Base {
    @Column(name = "denominacion")
    private String denominacion;

}
