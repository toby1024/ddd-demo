package com.souche.ddddemo.appservice.travelctx;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.domain.travelcontext.service.TravelDomainService;
import com.souche.ddddemo.exception.TravelCreateException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Slf4j
@Service
public class TravelAppService {
    @Autowired
    private TravelDomainService travelDomainService;

    /**
     * 创建行程
     *
     * @param travel
     * @return
     */
    public Travel create(Travel travel) {
        //设置订单号和时间
        travel.init();

        Optional<Travel> result = travelDomainService.save(travel);
        if (result.isPresent()) {
            return result.get();
        }
        throw new TravelCreateException("创建行程异常");
    }

    /**
     * 查询行程的司机位置
     *
     * @param travel
     * @return
     */
    public Travel findDriverLocation(Travel travel) {
        Optional<Travel> location = travelDomainService.findLocation(travel);
        if (location.isPresent()) {
            return location.get();
        }
        log.info("行程:{}信息不存在", travel.getId());
        return null;
    }

}
