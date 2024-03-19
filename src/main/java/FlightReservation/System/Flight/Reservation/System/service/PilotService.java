package FlightReservation.System.Flight.Reservation.System.service;

import FlightReservation.System.Flight.Reservation.System.entity.PilotDetails;
import FlightReservation.System.Flight.Reservation.System.model.PilotCreateUpdateReq;

import java.util.HashMap;

public interface PilotService {

    PilotDetails createPilot(PilotCreateUpdateReq request);
    PilotDetails updatePilot(PilotCreateUpdateReq request,String pilotId);

    PilotDetails updatePilotPartially(HashMap<String,String> map , String userID);
    String deletePilot(String pilotId);
}
