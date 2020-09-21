package com.souche.ddddemo.gateway.ohs.api.rpc;

import com.souche.ddddemo.appservice.travelctx.TravelAppService;
import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.dto.request.travel.CreateTravelParameter;
import com.souche.ddddemo.dto.response.travel.TravelResponse;
import com.souche.ddddemo.gateway.ohs.assembler.TravelAssembler;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/21
 */
@Slf4j
@DubboService(version = "1.0.0")
public class TravelRpcService implements com.souche.ddddemo.api.TravelRpcService {
    @Autowired
    private TravelAppService travelAppService;

    @Override
    public TravelResponse createTravel(CreateTravelParameter parameter) {
        log.info("[RPC]乘客创建行程=>{}", parameter);
        Travel travel = TravelAssembler.INSTANCE.fromRequestParameter(parameter);
        Travel travelResult = travelAppService.create(travel);
        return TravelAssembler.INSTANCE.fromTravel(travelResult);
    }
}
