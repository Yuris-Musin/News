package com.musin.news.domain.usecase

import com.musin.news.domain.repository.NewsRepository
import javax.inject.Inject

class GetArticlesByTopicsUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {

    operator fun invoke(topics: List<String>) = newsRepository.getArticlesByTopic(topics)

}