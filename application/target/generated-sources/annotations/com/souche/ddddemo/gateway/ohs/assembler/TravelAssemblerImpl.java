package com.souche.ddddemo.gateway.ohs.assembler;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.dto.request.travel.CreateTravelParameter;
import com.souche.ddddemo.dto.response.travel.TravelResponse;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-21T11:27:19+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_192 (Oracle Corporation)"
)
public class TravelAssemblerImpl implements TravelAssembler {

    @Override
    public Travel fromRequestParameter(CreateTravelParameter parameter) {
        if ( parameter == null ) {
            return null;
        }

        Travel travel = new Travel();

        travel.setPassengerId( parameter.getPassengerId() );
        travel.setStartLat( parameter.getStartLat() );
        travel.setStartLon( parameter.getStartLon() );
        travel.setStartAddress( parameter.getStartAddress() );
        travel.setEndLat( parameter.getEndLat() );
        travel.setEndLon( parameter.getEndLon() );
        travel.setEndAddress( parameter.getEndAddress() );

        return travel;
    }

    @Override
    public TravelResponse fromTravel(Travel travel) {
        if ( travel == null ) {
            return null;
        }

        TravelResponse travelResponse = new TravelResponse();

        travelResponse.setTravelId( travel.getId() );
        travelResponse.setPassengerId( travel.getPassengerId() );
        travelResponse.setStartLat( travel.getStartLat() );
        travelResponse.setStartLon( travel.getStartLon() );
        travelResponse.setStartAddress( travel.getStartAddress() );
        travelResponse.setRequestTime( travel.getRequestTime() );
        travelResponse.setEndLat( travel.getEndLat() );
        travelResponse.setEndLon( travel.getEndLon() );
        travelResponse.setEndAddress( travel.getEndAddress() );
        travelResponse.setStatus( travel.getStatus() );

        return travelResponse;
    }
}
