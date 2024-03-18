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
    @Column(name = "pilotId")
    private String pilotId;

    @Column(name = "name")
    private String name;

    @Column(name = "activestatus")
    private String activeStatus;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "updatedBy")
    private String updatedBy;




}
