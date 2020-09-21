package com.souche.ddddemo.gateway.ohs.assembler;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.dto.request.travel.CreateTravelParameter;
import com.souche.ddddemo.dto.response.travel.TravelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

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
}
