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

@Table(name = "Autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Autor extends Base {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "Biografia", length = 1500)
    private String biografia;

}
