package pe.com.prestacash.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import lombok.*;
import lombok.experimental.SuperBuilder;
import pe.com.prestacash.model.base.BaseEntity;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "AlmacenEntity")
@Table(name = "almacen")
public class AlmacenEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cod_almacen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigolm;

    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    @Column(name = "fecha_salida")
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;

    @ManyToOne
    @JoinColumn(name = "cod_artefacto", nullable = false)
    private ArtefactoEntity artefacto;
}
