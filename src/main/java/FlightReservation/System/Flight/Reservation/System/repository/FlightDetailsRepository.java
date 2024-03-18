package FlightReservation.System.Flight.Reservation.System.repository;

import FlightReservation.System.Flight.Reservation.System.entity.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightDetailsRepository extends JpaRepository<FlightDetails,String> {
}
