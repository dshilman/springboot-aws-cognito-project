package com.airlines.catalog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.Getter;
/*
Create a public class RequestedSeatsNotAvailable that extends Runtime Exception
with member variable response entity and returns an
exception message e "Seats not available. Reservation could not be made"
*/
@Getter
public class RequestedSeatsNotAvailable extends RuntimeException {
    private ResponseEntity<String> responseEntity;

    public RequestedSeatsNotAvailable() {
        responseEntity = new ResponseEntity<>("Seats not available. Reservation could not be made", HttpStatus.BAD_REQUEST);
    }
}