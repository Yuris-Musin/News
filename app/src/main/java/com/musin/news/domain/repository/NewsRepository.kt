package com.musin.news.domain.repository

import com.musin.news.domain.entity.Article
import com.musin.news.domain.entity.RefreshConfig
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getAllSubscriptions() : Flow<List<String>>

    fun startBackgroundRefresh(refreshConfig: RefreshConfig)

    suspend fun addSubscription(topic: String)

    suspend fun updateArticlesForTopic(topic: String)

    suspend fun removeSubscription(topic: String)

    suspend fun updateArticlesForAllSubscriptions()

    fun getArticlesByTopic(topics: List<String>) : Flow<List<Article>>

    suspend fun clearAllArticles(topics: List<String>)
}