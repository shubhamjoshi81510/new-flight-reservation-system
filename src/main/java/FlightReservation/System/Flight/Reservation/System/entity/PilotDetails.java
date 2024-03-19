package FlightReservation.System.Flight.Reservation.System.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@ToString
@Data
@Table(name = "pilotDetails")
public class PilotDetails {
    @Id
    @Column(name = "pilot_Id")
    private String pilotId;

    @Column(name = "name")
    private String name;

    @Column(name = "active_status")
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
