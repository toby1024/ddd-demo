package com.souche.ddddemo.api;

import com.souche.ddddemo.dto.request.travel.CreateTravelParameter;
import com.souche.ddddemo.dto.request.travel.QueryLocationParameter;
import com.souche.ddddemo.dto.response.travel.TravelLocationResponse;
import com.souche.ddddemo.dto.response.travel.TravelResponse;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/21
 */
public interface TravelRpcService {
    TravelResponse createTravel(CreateTravelParameter parameter);

    TravelLocationResponse getTravelLocation(QueryLocationParameter parameter);
}
