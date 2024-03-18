package FlightReservation.System.Flight.Reservation.System.service;

import FlightReservation.System.Flight.Reservation.System.entity.FlightBookingDetails;
import FlightReservation.System.Flight.Reservation.System.model.FlightBookingCreateReq;

public interface FlightBookingService {

    FlightBookingDetails createBooking(FlightBookingCreateReq req);
}
