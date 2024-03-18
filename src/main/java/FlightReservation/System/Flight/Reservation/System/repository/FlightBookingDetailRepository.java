package FlightReservation.System.Flight.Reservation.System.repository;

import FlightReservation.System.Flight.Reservation.System.entity.FlightBookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingDetailRepository extends JpaRepository<FlightBookingDetails,String> {
}
