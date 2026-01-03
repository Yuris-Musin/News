package com.musin.news.domain.repository

import com.musin.news.domain.entity.Article
import com.musin.news.domain.entity.Language
import com.musin.news.domain.entity.RefreshConfig
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getAllSubscriptions() : Flow<List<String>>

    fun startBackgroundRefresh(refreshConfig: RefreshConfig)

    suspend fun addSubscription(topic: String)

    suspend fun updateArticlesForTopic(topic: String, language: Language): Boolean

    suspend fun removeSubscription(topic: String)

    suspend fun updateArticlesForAllSubscriptions(language: Language): List<String>

    fun getArticlesByTopic(topics: List<String>) : Flow<List<Article>>

    suspend fun clearAllArticles(topics: List<String>)
}