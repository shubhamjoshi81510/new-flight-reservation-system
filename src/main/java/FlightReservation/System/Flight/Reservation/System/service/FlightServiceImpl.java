package FlightReservation.System.Flight.Reservation.System.service;

import FlightReservation.System.Flight.Reservation.System.entity.FlightDetails;
import FlightReservation.System.Flight.Reservation.System.model.FlightCreateUpdateReq;
import FlightReservation.System.Flight.Reservation.System.repository.FlightDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class FlightServiceImpl implements FlightService{
    @Autowired
    FlightDetailsRepository flightDetailsRepository;
    @Override
    public FlightDetails createFlight(FlightCreateUpdateReq request) {
        FlightDetails flightDetails = new FlightDetails();
        flightDetails.setFlightId(UUID.randomUUID().toString());
        flightDetails.setName(request.getName());
        flightDetails.setCreatedBy(request.getCreatedBy());
        flightDetails.setCapacity(request.getCapacity());
        flightDetails.setUpdatedBy(request.getLastUpdatedBy());
        flightDetails.setActiveStatus(request.getActiveStatus());
        return flightDetailsRepository.save(flightDetails);
    }

    @Override
    public FlightDetails updateFlight(FlightCreateUpdateReq req,String flightId) {
        FlightDetails flightDetails =new FlightDetails();
        flightDetails.setFlightId(flightId);
        flightDetails.setName(req.getName());
        flightDetails.setUpdatedBy(req.getLastUpdatedBy());
        flightDetails.setUpdatedBy(req.getLastUpdatedBy());
        flightDetailsRepository.save(flightDetails);
        return null;
    }

    @Override
    public void deleteFlight(String flightId) {
        flightDetailsRepository.deleteById(flightId);
    }


}
