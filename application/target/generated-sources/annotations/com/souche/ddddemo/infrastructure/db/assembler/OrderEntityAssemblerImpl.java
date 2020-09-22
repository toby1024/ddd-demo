package com.souche.ddddemo.infrastructure.db.assembler;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.infrastructure.db.entity.OrderEntity;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-22T10:23:23+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_192 (Oracle Corporation)"
)
public class OrderEntityAssemblerImpl implements OrderEntityAssembler {

    @Override
    public OrderEntity fromTravel(Travel travel) {
        if ( travel == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setOrderNo( travel.getId() );
        orderEntity.setId( travel.getId() );
        orderEntity.setStartLat( travel.getStartLat() );
        orderEntity.setStartLon( travel.getStartLon() );
        orderEntity.setStartAddress( travel.getStartAddress() );
        orderEntity.setRequestTime( travel.getRequestTime() );
        orderEntity.setEndLat( travel.getEndLat() );
        orderEntity.setEndLon( travel.getEndLon() );
        orderEntity.setEndAddress( travel.getEndAddress() );
        orderEntity.setPassengerId( travel.getPassengerId() );
        orderEntity.setStatus( travel.getStatus() );

        return orderEntity;
    }
}
