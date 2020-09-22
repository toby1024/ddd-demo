package com.souche.ddddemo.infrastructure.db.service;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.domain.travelcontext.vo.DriverLocation;
import com.souche.ddddemo.infrastructure.db.assembler.OrderEntityAssembler;
import com.souche.ddddemo.infrastructure.db.assembler.TravelAssembler;
import com.souche.ddddemo.infrastructure.db.dao.OrderMapper;
import com.souche.ddddemo.infrastructure.db.dao.TravelDriverLocationMapper;
import com.souche.ddddemo.infrastructure.db.entity.OrderEntity;
import com.souche.ddddemo.infrastructure.db.entity.TravelDriverLocationEntity;
import com.souche.ddddemo.interfaces.persistence.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Component
public class TravelRepositoryImpl implements TravelRepository {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private TravelDriverLocationMapper travelDriverLocationMapper;

    @Override
    public int save(Travel travel) {
        OrderEntity orderEntity = OrderEntityAssembler.INSTANCE.fromTravel(travel);
        orderEntity.setCreatedAt(new Date());
        return orderMapper.save(orderEntity);
    }

    @Override
    public Travel findById(Long orderNo) {
        OrderEntity orderEntity = orderMapper.findByOrderNo(orderNo);
        return TravelAssembler.INSTANCE.fromOrderEntity(orderEntity);
    }

    @Override
    public Travel findByOrderNo(Long orderNo) {
        OrderEntity byOrderNo = orderMapper.findByOrderNo(orderNo);
        if (Objects.isNull(byOrderNo)) {
            return null;
        }
        Travel travel = new Travel();
        travel.setId(byOrderNo.getOrderNo());

        TravelDriverLocationEntity location = travelDriverLocationMapper.findByOrderNo(orderNo);
        if (Objects.nonNull(location)) {
            DriverLocation driverLocation = new DriverLocation();
            driverLocation.setLon(location.getLon());
            driverLocation.setLat(location.getLat());
            driverLocation.setAddress(location.getAddress());

            travel.setDriverLocation(driverLocation);
        }

        return travel;
    }
}
