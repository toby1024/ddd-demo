package com.souche.ddddemo.dto.response.travel;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangbin
 */
@Data
public class TravelLocationResponse implements Serializable {

    private static final long serialVersionUID = 2417368599034956875L;
    private Long orderNo;
    private Double lon;
    private Double lat;
    private String address;
}
