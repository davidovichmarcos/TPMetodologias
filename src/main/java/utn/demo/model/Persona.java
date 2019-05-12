package utn.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Persona {

    private Integer codigoBanco;

    @Id
    private Integer dni;

    private String nombre;
    private Integer edad;
}
