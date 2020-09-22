package com.souche.ddddemo.dto.request.travel;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangbin
 */
@Data
public class QueryLocationParameter implements Serializable {
    private static final long serialVersionUID = -1063046966922743057L;
    private Long orderNo;
}
