package com.video.sunny.http;

import com.video.sunny.entity.BaseEntity;
import com.video.sunny.entity.user.request.UserLoginReq;
import com.video.sunny.entity.user.resp.UserLoginResp;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * 请求接口
 * Created by liu on 16/8/4.
 */
public interface Api {

    /**
     * 登录
     * @param userLoginReq
     * @return
     */
    @POST("")
    Observable<BaseEntity<UserLoginResp>> login(@Body UserLoginReq userLoginReq);
}
