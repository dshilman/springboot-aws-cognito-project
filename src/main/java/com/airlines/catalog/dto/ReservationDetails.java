package com.airlines.catalog.dto;

import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Data
public class ReservationDetails {

    @NotBlank(message = "First name cannot be blank")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    private String lastName;

    private String gender;

    @Min(value = 1, message = "Age should be between 1 and 120")
    @Max(value = 120, message = "Age should be between 1 and 120")
    private int age;

    @Positive(message = "Flight ID must be a positive integer")
    private int flightId;

    @NotBlank(message = "Travel class cannot be blank")
    private String travelClass;

    @Positive(message = "Ticket price must be a positive value")
    private double ticketPrice;

    @Pattern(regexp = "^[A-Z]{3}$", message = "Currency code must be exactly 3 uppercase letters")
    private String currencyCode;

    private String reservationStatus;
    private String paymentStatus;
    private String paymentMode;

    @Email(message = "Invalid email address")
    private String contactEmail;

    @Pattern(regexp = "^\\d{10}$", message = "Contact number must be a 10-digit number")
    private String contactNumber;
}
