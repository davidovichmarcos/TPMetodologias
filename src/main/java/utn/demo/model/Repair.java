package utn.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Repair {

    @Id
    private Integer id;
    private String detail;
    private Date date;
    private Long totalPrice;
    private Long workPrice;
    private Long sparePrice;
}