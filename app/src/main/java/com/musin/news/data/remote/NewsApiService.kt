package com.musin.news.data.remote

import com.musin.news.domain.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET(value = "v2/everything?apiKey=$API_KEY")
    suspend fun loadArticles(
        @Query("q") topic: String
    ): NewsResponseDto
}