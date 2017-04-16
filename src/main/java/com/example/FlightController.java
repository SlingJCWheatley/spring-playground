package com.example;

import com.example.Service.Flight;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class FlightController {

    @GetMapping("/flights/flight")
    public Flight getFlight() {
        // Year is (y - 1900) | Month starts at 0 | Hours is in UTC (-6) for MST need to use timezone
        return new Flight(new Date(2017 - (1900), 4 - (1), 21, 14 - (6), 34),
                asList(new Flight.Ticket(new Flight.Ticket.Person("Some name", "Some other name"), 200)));
    }

    @GetMapping("/flights")
    public List<Flight> getFlights() {
        // Year is (y - 1900) | Month starts at 0 | Hours is in UTC (-6) for MST need to use timezone
        // 1st Flight
        return asList( new Flight(new Date(2017 - (1900), 4 - (1), 21, 14 - (6), 34),
                asList(new Flight.Ticket(new Flight.Ticket.Person("Some name", "Some other name"), 200))),
                // 2nd Flight
                new Flight(new Date(2017 - (1900), 4 - (1), 21, 14 - (6), 34),
                        asList(new Flight.Ticket(new Flight.Ticket.Person("Some other name", null), 400))));
    }

}
