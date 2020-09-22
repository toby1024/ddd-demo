package com.souche.ddddemo.gateway.ohs.assembler;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.domain.travelcontext.vo.DriverLocation;
import com.souche.ddddemo.dto.request.travel.CreateTravelParameter;
import com.souche.ddddemo.dto.request.travel.QueryLocationParameter;
import com.souche.ddddemo.dto.response.travel.TravelLocationResponse;
import com.souche.ddddemo.dto.response.travel.TravelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Objects;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/21
 */
@Mapper
public interface TravelAssembler {
    TravelAssembler INSTANCE = Mappers.getMapper(TravelAssembler.class);

    /**
     * 根据参数构建行程
     *
     * @param parameter
     * @return
     */
    @Mapping(target = "requestTime", ignore = true)
    Travel fromRequestParameter(CreateTravelParameter parameter);

    /**
     * 构建行程返回
     *
     * @param travel
     * @return
     */
    @Mapping(source = "id", target = "travelId")
    TravelResponse fromTravel(Travel travel);

    /**
     * 查询司机位置参数
     *
     * @param parameter
     * @return
     */
    @Mapping(source = "orderNo", target = "id")
    Travel fromQueryLocationParameter(QueryLocationParameter parameter);

    /**
     * travel 获取司机位置
     *
     * @param travel
     * @return
     */
    default TravelLocationResponse travelToLocationResponse(Travel travel) {
        if (Objects.isNull(travel)) {
            return null;
        }
        TravelLocationResponse response = new TravelLocationResponse();
        response.setOrderNo(travel.getId());
        DriverLocation driverLocation = travel.getDriverLocation();
        if (Objects.nonNull(driverLocation)) {
            response.setAddress(driverLocation.getAddress());
            response.setLon(driverLocation.getLon());
            response.setLat(driverLocation.getLat());
        }
        return response;
    }
}
