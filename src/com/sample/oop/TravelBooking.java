package com.sample.oop;

public interface TravelBooking {
  public void bookTicket();
}

class TicketBookingByAgent implements TravelBooking {
  TravelBooking travelBooking;

  public TicketBookingByAgent(TravelBooking travelBooking) {
    this.travelBooking = travelBooking;
  }

  @Override
  public void bookTicket() {
    travelBooking.bookTicket();
  }
}

class TrainTicket implements  TravelBooking {
  @Override
  public void bookTicket() {
    System.out.println("Train Ticket Booked!");
  }
}

class FlightTicket implements  TravelBooking {
  @Override
  public void bookTicket() {
    System.out.println("Flight Ticket Booked!");
  }
}