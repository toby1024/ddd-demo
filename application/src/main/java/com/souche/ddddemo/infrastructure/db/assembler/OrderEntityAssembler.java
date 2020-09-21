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
public interface OrderEntityAssembler {
    OrderEntityAssembler INSTANCE = Mappers.getMapper(OrderEntityAssembler.class);

    /**
     * 根据行程创建订单
     *
     * @param travel
     * @return
     */
    @Mapping(source = "id", target = "orderNo")
    OrderEntity fromTravel(Travel travel);
}
