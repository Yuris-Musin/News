package com.musin.news.domain.usecase

import com.musin.news.domain.repository.NewsRepository
import javax.inject.Inject

class AddSubscriptionUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke(topic: String) {

        newsRepository.addSubscription(topic = topic)
        newsRepository.updateArticlesForTopic(topic = topic)
    }

}