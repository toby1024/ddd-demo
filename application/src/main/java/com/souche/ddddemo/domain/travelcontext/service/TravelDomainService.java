package com.souche.ddddemo.domain.travelcontext.service;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;
import com.souche.ddddemo.interfaces.persistence.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Component
public class TravelDomainService {

    @Autowired
    private TravelRepository travelRepository;

    /**
     * 保存行程信息
     *
     * @param travel
     * @return
     */
    public Optional<Travel> create(Travel travel) {
        int saveCnt = travelRepository.save(travel);
        if (1 == saveCnt) {
            return Optional.of(travelRepository.findById(travel.getId()));
        }
        return Optional.empty();
    }
}
