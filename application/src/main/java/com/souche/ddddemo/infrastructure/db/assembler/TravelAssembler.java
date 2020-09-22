package com.souche.ddddemo.infrastructure.db.assembler;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.domain.travelcontext.vo.DriverLocation;
import com.souche.ddddemo.infrastructure.db.entity.OrderEntity;
import com.souche.ddddemo.infrastructure.db.entity.TravelDriverLocationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Objects;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Mapper
public interface TravelAssembler {

    TravelAssembler INSTANCE = Mappers.getMapper(TravelAssembler.class);

    /**
     * 根据数据库订单构建行程信息
     *
     * @param orderEntity
     * @return
     */
    @Mapping(source = "orderNo", target = "id")
    Travel fromOrderEntity(OrderEntity orderEntity);

    /**
     * 构建包含司机位置的行程信息
     *
     * @param orderEntity
     * @param locationEntity
     * @return
     */
    default Travel travelWithLocation(OrderEntity orderEntity, TravelDriverLocationEntity locationEntity) {
        if (Objects.isNull(orderEntity)) {
            return null;
        }
        Travel travel = new Travel();
        travel.setId(orderEntity.getOrderNo());

        if (Objects.nonNull(locationEntity)) {
            DriverLocation driverLocation = new DriverLocation();
            driverLocation.setLon(locationEntity.getLon());
            driverLocation.setLat(locationEntity.getLat());
            driverLocation.setAddress(locationEntity.getAddress());
            driverLocation.setDriverId(orderEntity.getDriverId());

            travel.setDriverLocation(driverLocation);
        }
        return travel;
    }
}
