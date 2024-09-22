package com.airlines.catalog.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightDetails {
    private int flightId;
    private String departureDate;
    private String departureTime;
    private String departureAirportCode;
    private String departureAirportName;
    private String departureAirportCity;
    private String departureAirportLocale;
    private String arrivalAirportCode;
    private String arrivalAirportName;
    private String arrivalAirportCity;
    private String arrivalAirportLocale;
    private String arrivalDate;
    private String arrivalTime;
    private double ticketPrice;
    private String ticketCurrency;
    private String flightNumber;
    private int flightDuration;
    private int seatAvailable;
    private String airlineName;
    private int stops;

    //Create a toString method to convert the attributes to string
    @Override
    public String toString() {
        return "FlightDetails{" +
                "flightId=" + flightId +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", departureAirportCode='" + departureAirportCode + '\'' +
                ", departureAirportName='" + departureAirportName + '\'' +
                ", departureAirportCity='" + departureAirportCity + '\'' +
                ", departureAirportLocale='" + departureAirportLocale + '\'' +
                ", arrivalAirportCode='" + arrivalAirportCode + '\'' +
                ", arrivalAirportName='" + arrivalAirportName + '\'' +
                ", arrivalAirportCity='" + arrivalAirportCity + '\'' +
                ", arrivalAirportLocale='" + arrivalAirportLocale + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", ticketCurrency='" + ticketCurrency + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightDuration=" + flightDuration +
                ", seatAvailable=" + seatAvailable +
                ", airlineName='" + airlineName + '\'' +
                ", stops=" + stops +
                '}';
    }

    //Create a toJson method to convert the attributes to Json String
    public String toJson() {
        return "{" +
                "\"flightId\":" + flightId +
                ", \"departureDate\":\"" + departureDate + '\"' +
                ", \"departureTime\":\"" + departureTime + '\"' +
                ", \"departureAirportCode\":\"" + departureAirportCode + '\"' +
                ", \"departureAirportName\":\"" + departureAirportName + '\"' +
                ", \"departureAirportCity\":\"" + departureAirportCity + '\"' +
                ", \"departureAirportLocale\":\"" + departureAirportLocale + '\"' +
                ", \"arrivalAirportCode\":\"" + arrivalAirportCode + '\"' +
                ", \"arrivalAirportName\":\"" + arrivalAirportName + '\"' +
                ", \"arrivalAirportCity\":\"" + arrivalAirportCity + '\"' +
                ", \"arrivalAirportLocale\":\"" + arrivalAirportLocale + '\"' +
                ", \"arrivalDate\":\"" + arrivalDate + '\"' +
                ", \"arrivalTime\":\"" + arrivalTime + '\"' +
                ", \"ticketPrice\":\"" + ticketPrice + '\"' +
                ", \"ticketCurrency\":\"" + ticketCurrency + '\"' +
                ", \"flightNumber\":\"" + flightNumber + '\"' +
                ", \"flightDuration\":\"" + flightDuration + '\"' +
                ", \"seatAvailable\":\"" + seatAvailable + '\"' +
                ", \"airlineName\":\"" + airlineName + '\"' +
                ", \"stops\":\"" + stops + '\"' +
                '}';
    }
}