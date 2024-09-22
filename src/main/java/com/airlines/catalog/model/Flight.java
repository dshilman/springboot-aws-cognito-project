package com.airlines.catalog.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "flight")
@Getter
@Setter
public class Flight {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "departure_date")
    private String departureDate;

    @Column(name = "departure_time")
    private String departureTime;

    @Column(name = "departure_airport_code")
    private String departureAirportCode;

    @Column(name = "arrival_date")
    private String arrivalDate;

    @Column(name = "arrival_time")
    private String arrivalTime;

    @Column(name = "arrival_airport_code")
    private String arrivalAirportCode;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "flight_duration")
    private int flightDuration;

    @Column(name = "ticket_price")
    private double ticketPrice;

    @Column(name = "ticket_currency")
    private String ticketCurrency;

    @Column(name = "seat_capacity")
    private int seatCapacity;

    @Column(name = "seat_available")
    private int seatAvailable;

    @Column(name = "airline_name")
    private String airlineName;

    @Column(name = "stops")
    private int stops;

    // Default constructor
    public Flight() {
    }

    //Create a tostring method to convert attributes to string
    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", departureAirportCode='" + departureAirportCode + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", arrivalAirportCode='" + arrivalAirportCode + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightDuration=" + flightDuration +
                ", ticketPrice=" + ticketPrice +
                ", ticketCurrency='" + ticketCurrency + '\'' +
                ", seatCapacity=" + seatCapacity +
                ", seatAvailable=" + seatAvailable +
                ", airlineName='" + airlineName + '\'' +
                ", stops=" + stops +
                '}';
    }



    //Create a toJson method to convert the attributes to Json String
    public String toJson() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ", \"departureDate\":\"" + departureDate + '\"' +
                ", \"departureTime\":\"" + departureTime + '\"' +
                ", \"departureAirportCode\":\"" + departureAirportCode + '\"' +
                ", \"arrivalDate\":\"" + arrivalDate + '\"' +
                ", \"arrivalTime\":\"" + arrivalTime + '\"' +
                ", \"arrivalAirportCode\":\"" + arrivalAirportCode + '\"' +
                ", \"flightNumber\":\"" + flightNumber + '\"' +
                ", \"flightDuration\":" + flightDuration +
                ", \"ticketPrice\":" + ticketPrice +
                ", \"ticketCurrency\":\"" + ticketCurrency + '\"' +
                ", \"seatCapacity\":" + seatCapacity +
                ", \"seatAvailable\":" + seatAvailable +
                ", \"airlineName\":\"" + airlineName + '\"' +
                ", \"stops\":" + stops +
                '}';
    }
}