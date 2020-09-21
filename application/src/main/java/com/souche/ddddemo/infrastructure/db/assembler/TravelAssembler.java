package com.souche.ddddemo.infrastructure.db.assembler;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.infrastructure.db.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

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
}
