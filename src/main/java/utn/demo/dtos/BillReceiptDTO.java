package utn.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import utn.demo.model.Client;

import java.sql.Date;

public class BillReceiptDTO {

    @JsonProperty("bill-receipt-number")
    private Integer number;
    @JsonProperty("bill-receipt-date")
    private Date date;
    @JsonProperty("bill-receipt-total")
    private Long total;
    @JsonProperty("bill-receipt-client")
    private Client client;
}
