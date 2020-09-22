package com.souche.ddddemo.infrastructure.db.dao;

import com.souche.ddddemo.infrastructure.db.entity.TravelDriverLocationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author zhangbin
 */
@Mapper
@Component
public interface TravelDriverLocationMapper {

    TravelDriverLocationEntity findByOrderNo(Long orderNo);
}
