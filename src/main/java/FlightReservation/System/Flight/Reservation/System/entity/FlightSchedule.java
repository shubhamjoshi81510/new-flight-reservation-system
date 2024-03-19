package FlightReservation.System.Flight.Reservation.System.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@ToString
@Data
@Table(name = "flightSchedule")
public class FlightSchedule {
    @Id
    @Column(name = "id")
    private String id;


    @JoinColumn(name = "flight_Id")
    private FlightDetails flightId;

    @JoinColumn(name = "pilot_Id")
    private PilotDetails pilotId;

    @Column(name = "journey_Start_Date")
    private LocalDateTime journey_Start_Date;


    @JoinColumn(name="airport_Id")
    private AirportDetails sourceAirport;

    @Column(name="journey_end_date")
    private LocalDateTime journeyEndDate;


    @JoinColumn(name="airport_Id")
    private AirportDetails destAirport;

    @Column(name="max_waiting_capacity")
    private Integer maxWaitingCapacity;

    @Column(name="current_status")
    private Integer currentStatus;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="last_updated_at")
    private LocalDateTime lastUpdatedAt;

    @Column(name="last_updated_by")
    private String lastUpdatedBy;





}
