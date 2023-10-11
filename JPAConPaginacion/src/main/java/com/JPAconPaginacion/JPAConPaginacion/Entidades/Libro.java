package com.JPAconPaginacion.JPAConPaginacion.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.List;

@Entity // esta clase va a ser una entidad

@Table(name = "Libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Libro extends Base {
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String nombre;
    @Column(name = "paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
