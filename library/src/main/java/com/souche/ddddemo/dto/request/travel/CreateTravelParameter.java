package com.souche.ddddemo.dto.request.travel;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/20
 */
@Data
public class CreateTravelParameter implements Serializable {

    private static final long serialVersionUID = -5393551649160879962L;

    private Long passengerId;
    private Double startLat;
    private Double startLon;
    private String startAddress;
    private Double endLat;
    private Double endLon;
    private String endAddress;
}
