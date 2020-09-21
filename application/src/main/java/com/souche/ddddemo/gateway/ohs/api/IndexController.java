package com.souche.ddddemo.gateway.ohs.api;

import com.souche.ddddemo.dto.request.QueryUserParameter;
import com.souche.ddddemo.dto.response.Result;
import com.souche.ddddemo.dto.response.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangbin
 * @since: 2020/9/18
 */
@RestController
public class IndexController {
    @GetMapping("/index")
    public Result<UserResponse> index(QueryUserParameter queryUserParameter) {
        UserResponse userResponse = new UserResponse();
        userResponse.setUsername(queryUserParameter.getUsername());
        userResponse.setPhone("1312341234");
        return Result.success(userResponse);
    }
}
