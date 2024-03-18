package FlightReservation.System.Flight.Reservation.System.model;

import lombok.Data;

@Data
public class FlightCreateUpdateReq {

    private String name;
    private String capacity;
    private String activeStatus;
    private String createdBy;
    private String lastUpdatedBy;

}
