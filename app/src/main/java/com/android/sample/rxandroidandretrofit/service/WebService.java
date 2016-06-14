package com.android.sample.rxandroidandretrofit.service;

import com.android.sample.rxandroidandretrofit.model.Model;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by mayowa.adegeye on 08/06/2016.
 */
public interface WebService {
    @GET("users/{user}")
    Observable<Model> getUser(@Path("user") String username);
}
