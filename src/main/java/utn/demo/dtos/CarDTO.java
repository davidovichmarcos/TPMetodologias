package utn.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import utn.demo.model.Client;

public class CarDTO {

    @JsonProperty("car-patent")
    private String patent;

    private Client client;
}
