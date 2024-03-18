package FlightReservation.System.Flight.Reservation.System.repository;

import FlightReservation.System.Flight.Reservation.System.entity.PilotDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotDetailsRepository extends JpaRepository<PilotDetails,String> {
}
