package FlightReservation.System.Flight.Reservation.System.repository;

import FlightReservation.System.Flight.Reservation.System.entity.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule,String> {
}
