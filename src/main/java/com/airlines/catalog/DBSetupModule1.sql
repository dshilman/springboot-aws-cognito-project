INSERT INTO airport (airport_code, airport_name, airport_city, airport_locale) VALUES
('LHR', 'London Heathrow Airport', 'London', 'United Kingdom'),
('MIA', 'Miami International Airport', 'Miami', 'United States'),
('CDG', 'Charles de Gaulle Airport', 'Paris', 'France'),
('LAX', 'Los Angeles International Airport', 'Los Angeles', 'United States');

INSERT INTO flight (id, departure_date, departure_time, departure_airport_code, arrival_date, arrival_time, arrival_airport_code, flight_number, flight_duration, ticket_price, ticket_currency, seat_capacity, seat_available)
VALUES
(1, '2023-08-01', '09:00:00', 'MIA', '2023-08-01', '11:30:00', 'LAX', 'AA101', 330, 199.99, 'USD', 200, 180),
(2, '2023-08-01', '15:00:00', 'MIA', '2023-08-01', '17:30:00', 'LAX', 'AA102', 330, 249.99, 'USD', 180, 150),
(3, '2023-08-01', '08:00:00', 'LHR', '2023-08-01', '10:30:00', 'CDG', 'BA201', 150, 129.99, 'EUR', 220, 200),
(4, '2023-08-01', '16:00:00', 'LHR', '2023-08-01', '18:30:00', 'CDG', 'BA202', 150, 149.99, 'EUR', 180, 160),
(5, '2023-08-02', '10:00:00', 'LHR', '2023-08-02', '12:30:00', 'CDG', 'BA203', 150, 169.99, 'EUR', 220, 220),
(6, '2023-08-02', '12:00:00', 'MIA', '2023-08-02', '14:30:00', 'LAX', 'AA103', 330, 299.99, 'USD', 180, 0);
   