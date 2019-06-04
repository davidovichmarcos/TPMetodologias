package utn.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String detail;
    private Date date;
    private Long totalPrice;
    private Long workPrice;
    private Long sparePrice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repair-Car", referencedColumnName = "id")
    private Car car;
}