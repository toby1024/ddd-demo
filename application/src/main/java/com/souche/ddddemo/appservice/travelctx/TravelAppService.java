package com.souche.ddddemo.appservice.travelctx;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.domain.travelcontext.service.TravelDomainService;
import com.souche.ddddemo.exception.TravelCreateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
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
        travel.setId(System.currentTimeMillis());
        travel.setRequestTime(new Date());
        travel.setStatus(0);

        Optional<Travel> result = travelDomainService.save(travel);
        if (result.isPresent()) {
            return result.get();
        }
        throw new TravelCreateException("创建行程异常");
    }

}
