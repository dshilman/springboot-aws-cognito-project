package com.airlines.catalog.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.Data;

@Entity
@Table(name = "airport")
@Data
public class Airport {

    @Id
    @Column(name = "airport_code")
    private String airportCode;

    @Column(name = "airport_name")
    private String airportName;

    @Column(name = "airport_city")
    private String airportCity;

    @Column(name = "airport_locale")
    private String airportLocale;

    // Default constructor (required by JPA)
    public Airport() {
    }
}
