package com.musin.news.domain.usecase

import com.musin.news.domain.repository.NewsRepository
import javax.inject.Inject

class UpdatedSubscribedArticlesUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke() {
        newsRepository.updateArticlesForAllSubscriptions()
    }
}