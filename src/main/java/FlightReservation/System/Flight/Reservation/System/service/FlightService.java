package FlightReservation.System.Flight.Reservation.System.service;

import FlightReservation.System.Flight.Reservation.System.entity.FlightDetails;
import FlightReservation.System.Flight.Reservation.System.model.FlightCreateUpdateReq;

public interface FlightService {

    FlightDetails createFlight(FlightCreateUpdateReq req);

    FlightDetails updateFlight(FlightCreateUpdateReq req);

    FlightDetails deleteFlight(FlightCreateUpdateReq req);
}
