package FlightReservation.System.Flight.Reservation.System.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "flight_booking")
public class FlightBookingDetails {

    @Id
    @Column(name="booking_id")
    private String bookingId;

    @Column(name="customer_name")
    private String customerName;


    @JoinColumn(name="flight_schedule_id")
    private FlightSchedule flightSchedule;


    @Column(name="amount_paid")
    private Integer amountPaid;

    // 0 - Waiting 1- Confirmed 2- Cancelled
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
