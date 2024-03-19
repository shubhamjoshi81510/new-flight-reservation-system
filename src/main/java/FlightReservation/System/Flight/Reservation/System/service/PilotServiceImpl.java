package FlightReservation.System.Flight.Reservation.System.service;

import FlightReservation.System.Flight.Reservation.System.entity.PilotDetails;
import FlightReservation.System.Flight.Reservation.System.model.PilotCreateUpdateReq;
import FlightReservation.System.Flight.Reservation.System.repository.PilotDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;

@Service
public class PilotServiceImpl implements PilotService{


    @Autowired
    private PilotDetailsRepository pilotDetailsRepository;
    @Override
    public PilotDetails createPilot(PilotCreateUpdateReq request) {
     PilotDetails details = new PilotDetails();
     details.setPilotId(UUID.randomUUID().toString());
     details.setName(request.getName());
     details.setActiveStatus(request.getActiveStatus());
     details.setCreatedBy(request.getCreatedBy());
     details.setUpdatedBy(request.getUpdatedBy());
     return pilotDetailsRepository.save(details);
    }

    @Override
    public PilotDetails updatePilot(PilotCreateUpdateReq request,String pilotId) {
        PilotDetails details = new PilotDetails();
        details.setPilotId(pilotId);
        details.setName(request.getName());
        details.setActiveStatus(request.getActiveStatus());
        details.setCreatedBy(request.getCreatedBy());
        details.setUpdatedBy(request.getUpdatedBy());
        return pilotDetailsRepository.save(details);

    }

    @Override
    public PilotDetails updatePilotPartially(HashMap<String,String> map , String pilotId) {
        PilotDetails details = pilotDetailsRepository.findById(pilotId).get();
        if(map.containsKey("name")){
            details.setName(map.get("name"));
        }
        if(map.containsKey("ActiveStatus")){
            details.setName(map.get("ActiveStatus"));
        }
        if(map.containsKey("createdBy")){
            details.setName(map.get("createdBy"));
        }
        if(map.containsKey("updatedBy")){
            details.setName(map.get("updatedBy"));
        }
        return pilotDetailsRepository.save(details);
    }

    @Override
    public String deletePilot(String pilotId) {
       pilotDetailsRepository.deleteById(pilotId);
       return "Pilot delete Successfully";
    }
}
