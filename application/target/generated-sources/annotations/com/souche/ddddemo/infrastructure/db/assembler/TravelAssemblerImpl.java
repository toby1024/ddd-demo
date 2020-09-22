package com.souche.ddddemo.infrastructure.db.assembler;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.infrastructure.db.entity.OrderEntity;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-22T10:23:23+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_192 (Oracle Corporation)"
)
public class TravelAssemblerImpl implements TravelAssembler {

    @Override
    public Travel fromOrderEntity(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }

        Travel travel = new Travel();

        travel.setId( orderEntity.getOrderNo() );
        travel.setPassengerId( orderEntity.getPassengerId() );
        travel.setStatus( orderEntity.getStatus() );
        travel.setStartLat( orderEntity.getStartLat() );
        travel.setStartLon( orderEntity.getStartLon() );
        travel.setStartAddress( orderEntity.getStartAddress() );
        travel.setRequestTime( orderEntity.getRequestTime() );
        travel.setEndLat( orderEntity.getEndLat() );
        travel.setEndLon( orderEntity.getEndLon() );
        travel.setEndAddress( orderEntity.getEndAddress() );

        return travel;
    }
}
