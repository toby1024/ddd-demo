package com.souche.ddddemo.infrastructure.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEntity {
    private Long id;

    private Long orderNo;
    private Double startLat;
    private Double startLon;
    private String startAddress;
    private Date requestTime;
    private Double endLat;
    private Double endLon;
    private String endAddress;
    private Long passengerId;

    private Double getInLat;
    private Double getInLon;
    private String getInAddress;
    private Date getInTime;
    private Double getOutLat;
    private Double getOutLon;
    private String getOutAddress;
    private Date getOutTime;
    private Long driverId;

    private Integer status;

    private Date createdAt;
    private Date updatedAt;

}
