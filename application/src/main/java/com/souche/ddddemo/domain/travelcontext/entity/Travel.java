package com.souche.ddddemo.domain.travelcontext.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Data
public class Travel {

    private Long id;
    private Long passengerId;
    private Integer status;

    private Double startLat;
    private Double startLon;
    private String startAddress;
    private Date requestTime;

    private Double endLat;
    private Double endLon;
    private String endAddress;

    public void init(){
        this.setId(System.currentTimeMillis());
        this.setRequestTime(new Date());
        this.setStatus(0);
    }
}
