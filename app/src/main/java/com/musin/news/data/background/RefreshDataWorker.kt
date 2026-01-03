package com.musin.news.data.background

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.musin.news.domain.usecase.UpdatedSubscribedArticlesUseCase
import com.musin.news.domain.usecase.settings.GetSettingsUseCase
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.first

@HiltWorker
class RefreshDataWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParameters: WorkerParameters,
    private val updatedSubscribedArticlesUseCase: UpdatedSubscribedArticlesUseCase,
    private val getSettingsUseCase: GetSettingsUseCase,
    private val notificationsHelper: NotificationsHelper
): CoroutineWorker(context, workerParameters) {

    override suspend fun doWork(): Result {
        Log.d("RefreshDataWorker", "Start")
        val settings = getSettingsUseCase().first()
        val updatedTopics = updatedSubscribedArticlesUseCase()
        if (updatedTopics.isNotEmpty() && settings.notificationsEnabled) {
            notificationsHelper.showNewArticlesNotification(updatedTopics)
        }
        Log.d("RefreshDataWorker", "Finish")
        return Result.success()
    }
}