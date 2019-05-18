package utn.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import utn.demo.model.Client;

public class CarDTO {

    @JsonProperty("car-patent")
    private String patent;
    @JsonProperty("car-brand")
    private String brand;
    @JsonProperty("car-model")
    private String model;
    @JsonProperty("car-year")
    private Integer year;
    private Client client;
}
