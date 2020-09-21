package com.souche.ddddemo.gateway.ohs.api.rest;

import com.souche.ddddemo.appservice.travelctx.TravelAppService;
import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.dto.request.travel.CreateTravelParameter;
import com.souche.ddddemo.dto.response.Result;
import com.souche.ddddemo.dto.response.travel.TravelResponse;
import com.souche.ddddemo.gateway.ohs.assembler.TravelAssembler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/21
 */
@Slf4j
@RestController
@RequestMapping("travel")
public class TravelController {
    @Autowired
    private TravelAppService travelAppService;

    @PostMapping("create")
    public Result<TravelResponse> createTravel(@RequestBody CreateTravelParameter parameter) {
        log.info("[REST]乘客创建行程=>{}", parameter);
        Travel travel = TravelAssembler.INSTANCE.fromRequestParameter(parameter);
        Travel travelResult = travelAppService.create(travel);
        return Result.success(TravelAssembler.INSTANCE.fromTravel(travelResult));
    }
}
