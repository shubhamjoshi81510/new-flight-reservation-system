package FlightReservation.System.Flight.Reservation.System.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Data
@ToString
@Table(name = "flightDetails")
public class FlightDetails {

    @Column(name = "flight_Id")
    private String flightId;

    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "active_Status")
    private String activeStatus;

    @Column(name = "created_At")
    private LocalDateTime createdAt;

    @Column(name = "created_By")
    private String createdBy;

    @Column(name = "updated_At")
    private LocalDateTime updatedAt;

    @Column(name = "updated_By")
    private String updatedBy;


}
