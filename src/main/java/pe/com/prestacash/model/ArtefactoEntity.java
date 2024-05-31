
package pe.com.prestacash.model;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;
import lombok.experimental.SuperBuilder;
import pe.com.prestacash.model.base.BaseEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "artefacto")
@Entity(name = "ArtefactoEntity")
public class ArtefactoEntity extends BaseEntity implements Serializable {

    private static final long serialVersion = 1L;
    @Id
    @Column(name = "cod_artefacto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nom_artefacto")
    @NotEmpty
    @Size(min = 10, max = 60, message = "El nombre del artefacto  tiene que estar entre {min} y {max}")
    private String nombre;
    @Column(name = "desc_artefacto ")
    @NotEmpty
    @Size(min = 20, max = 200, message = "La descripcion del artefacto  tiene que estar entre {min} y {max}")
    private String descripcion;
    @Column(name = "cantidad_artefacto")
    @NotEmpty
    private int cantidad;
    @Column(name = "precio_artefacto")
    private double precio;
    @ManyToOne
    @JoinColumn(name = "cod_tipo_artefacto", nullable = false)
    private TipoArtefactoEntity tipoartefacto;
}
