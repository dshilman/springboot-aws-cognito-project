package com.airlines.catalog.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


/* Build a Reservation Entity class  mapped to database table reservation
  Attributes for the class:
  bookingReference as long identity autogenerated,
  passengerId, flightId, reservationDate, reservationTime,reservationStatus, travelClass,
  ticketPrice as double, currencyCode, paymentStatus, paymentMode, contactNumber,
  contactEmail mapped to column names seperated by _ */
@Getter
@Setter
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_reference")
    private long bookingReference;
    @Column(name = "passenger_id")
    private int passengerId;
    @Column(name = "flight_id")
    private int flightId;
    @Column(name = "reservation_date")
    private String reservationDate;
    @Column(name = "reservation_time")
    private String reservationTime;
    @Column(name = "reservation_status")
    private String reservationStatus;
    @Column(name = "travel_class")
    private String travelClass;
    @Column(name = "ticket_price")
    private double ticketPrice;
    @Column(name = "currency_code")
    private String currencyCode;
    @Column(name = "payment_status")
    private String paymentStatus;
    @Column(name = "payment_mode")
    private String paymentMode;
    @Column(name = "contact_number")
    private String contactNumber;
    @Column(name = "contact_email")
    private String contactEmail;

}

