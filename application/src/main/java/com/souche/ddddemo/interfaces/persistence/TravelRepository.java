package com.souche.ddddemo.interfaces.persistence;

import com.souche.ddddemo.domain.travelcontext.entity.Travel;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
public interface TravelRepository {
    /**
     * 保存行程
     *
     * @param travel
     * @return
     */
    int save(Travel travel);

    /**
     * 查询行程
     *
     * @param id
     * @return
     */
    Travel findById(Long id);

    Travel findByOrderNo(Long orderNo);
}
