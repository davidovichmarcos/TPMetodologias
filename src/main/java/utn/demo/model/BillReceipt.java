package utn.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BillReceipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
    private Date date;
    private Long total;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billReceipt-Client",referencedColumnName = "id")
    @JsonIgnore
    private Client client;

}