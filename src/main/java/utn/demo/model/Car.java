package utn.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue
    private Integer id;
    private String patent;
    private String brand;
    private String model;
    private Integer year;
    @ManyToOne
    private Client client;
    @OneToMany
    private List<Repair> repair;

}