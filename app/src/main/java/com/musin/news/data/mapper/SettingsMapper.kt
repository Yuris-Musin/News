package com.musin.news.data.mapper

import com.musin.news.domain.entity.RefreshConfig
import com.musin.news.domain.entity.Settings

fun Settings.toRefreshConfig(): RefreshConfig {
    return RefreshConfig(language, interval, wifiOnly)
}