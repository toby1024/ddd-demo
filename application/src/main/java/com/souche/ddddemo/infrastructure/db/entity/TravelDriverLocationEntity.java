package com.souche.ddddemo.infrastructure.db.entity;

import lombok.Data;

/**
 * @author zhangbin
 */
@Data
public class TravelDriverLocationEntity {
    private Long id;
    private Long orderNo;
    private Long driverId;
    private Double lon;
    private Double lat;
    private String address;
}
