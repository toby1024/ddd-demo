package com.souche.ddddemo.infrastructure.db.service;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.infrastructure.db.assembler.OrderEntityAssembler;
import com.souche.ddddemo.infrastructure.db.assembler.TravelAssembler;
import com.souche.ddddemo.infrastructure.db.dao.OrderMapper;
import com.souche.ddddemo.infrastructure.db.entity.OrderEntity;
import com.souche.ddddemo.interfaces.persistence.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Component
public class TravelRepositoryImpl implements TravelRepository {

    @Autowired
    private OrderMapper orderMapper;

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
}
