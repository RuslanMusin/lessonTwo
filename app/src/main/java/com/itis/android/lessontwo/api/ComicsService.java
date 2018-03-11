package com.itis.android.lessontwo.api;

import com.itis.android.lessontwo.model.entity.character.CharactersResponse;
import com.itis.android.lessontwo.model.entity.comics.ComicsResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Nail Shaykhraziev on 25.02.2018.
 */

public interface ComicsService {

    @GET("comics")
    Single<ComicsResponse> comics(@Query("offset") Long offset, @Query("limit") Long limit,
                                  @Query("orderBy") String orderBy);

    @GET("comics/{comicsId}")
    Single<ComicsResponse> comics(@Path("comicsId") Long id);

    @GET("comics/{comicsId}/characters")
    Single<CharactersResponse> characters(@Path("comicsId") Long id);
}
