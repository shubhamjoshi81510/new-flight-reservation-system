package FlightReservation.System.Flight.Reservation.System.repository;

import FlightReservation.System.Flight.Reservation.System.entity.AirportDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportDetailsRepository extends JpaRepository< AirportDetails,String > {
}
