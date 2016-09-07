package com.liguofu.retorfit_test;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by my on 2016/8/23.
 */
public interface HttpService {

    @POST("/majax.action?method=getGiftList")
    Call<GiftBean> queryGiftList(@Query("pageno")int nopager);
}
