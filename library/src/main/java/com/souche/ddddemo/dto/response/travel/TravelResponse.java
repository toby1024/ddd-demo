package com.souche.ddddemo.dto.response.travel;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/21
 */
@Data
public class TravelResponse implements Serializable {
    private static final long serialVersionUID = -5173245520811169753L;
    private Long travelId;
    private Long passengerId;
    private Double startLat;
    private Double startLon;
    private String startAddress;
    private Date requestTime;

    private Double endLat;
    private Double endLon;
    private String endAddress;
    private Integer status;
}
