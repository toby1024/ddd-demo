package com.souche.consumer.web;

import com.souche.ddddemo.api.TravelRpcService;
import com.souche.ddddemo.dto.request.travel.CreateTravelParameter;
import com.souche.ddddemo.dto.response.travel.TravelResponse;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/21
 */
@RestController
@RequestMapping("rpc")
public class RpcCreateTravelController {
    @DubboReference(version = "1.0.0", url="dubbo://127.0.0.1:20880")
    private TravelRpcService travelRpcService;

    @PostMapping("createTravel")
    public TravelResponse create(@RequestBody CreateTravelParameter parameter){
        return travelRpcService.createTravel(parameter);
    }
}
