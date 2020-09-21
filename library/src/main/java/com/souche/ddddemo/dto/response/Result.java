package com.souche.ddddemo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private int code;
    private String messaage;

    private T data;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>(200, "success", data);
        return  result;
    }
}
