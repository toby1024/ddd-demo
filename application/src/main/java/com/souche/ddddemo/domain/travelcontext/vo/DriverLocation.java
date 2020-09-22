package com.souche.ddddemo.domain.travelcontext.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangbin
 */
@Data
public class DriverLocation implements Serializable {

    private static final long serialVersionUID = 2694825188627964293L;

    private Long driverId;
    private Double lon;
    private Double lat;
    private String address;
}
