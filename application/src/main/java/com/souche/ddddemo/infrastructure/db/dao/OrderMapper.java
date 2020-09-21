package com.souche.ddddemo.infrastructure.db.dao;

import com.souche.ddddemo.infrastructure.db.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Mapper
@Component
public interface OrderMapper {
    int save(OrderEntity orderEntity);

    OrderEntity findByOrderNo(Long orderNo);
}
