package com.example.Service;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Flight {
    @JsonProperty("Departs")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date departs;

    @JsonProperty("Tickets")
    private List<Ticket> tickets;

    // Getters
    public Date getDeparts() {
        return departs;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    // Setters
    public void setDeparts(Date departs) {
        this.departs = departs;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Flight(Date departs, List<Ticket> tickets) {
        this.departs = departs;
        this.tickets = tickets;
    }

    public static class Ticket {
        @JsonProperty("Passenger")
        private Person passenger;

        @JsonProperty("Price")
        private Integer price;

        public Integer getPrice() { return price; }

        public void setPrice(Integer price) { this.price = price; }

        public Ticket(Person passenger, Integer price) {
            this.passenger = passenger;
            this.price = price;
        }

        public static class Person {
            @JsonProperty("FirstName")
            @JsonInclude(JsonInclude.Include.NON_NULL)
            private String firstName;

            @JsonProperty("LastName")
            @JsonInclude(JsonInclude.Include.NON_NULL)
            private String lastName;

            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getFirstName() { return firstName; }

            public String getLastName() { return lastName; }

            public void setFirstName(String firstName) { this.firstName = firstName; }

            public void setLastName(String lastName) { this.lastName = lastName; }
        }
    }
}
