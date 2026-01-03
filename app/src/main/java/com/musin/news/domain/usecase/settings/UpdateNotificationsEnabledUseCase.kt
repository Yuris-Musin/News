package com.musin.news.domain.usecase.settings

import com.musin.news.domain.repository.SettingsRepository
import javax.inject.Inject

class UpdateNotificationsEnabledUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {

    suspend operator fun invoke(enabled: Boolean) {
        settingsRepository.updateNotificationsEnabled(enabled)
    }
}