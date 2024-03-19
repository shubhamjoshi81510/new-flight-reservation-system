package FlightReservation.System.Flight.Reservation.System.model;

import lombok.Data;

@Data
public class PilotCreateUpdateReq {

    private String name;
    private String activeStatus;
    private String createdBy;

    private String UpdatedBy;
}
