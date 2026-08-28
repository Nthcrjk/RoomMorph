package com.meow.roommorph.core.notification

import kotlinx.coroutines.flow.SharedFlow

interface INotificationManager {
    val events: SharedFlow<NotificationEvent>
    suspend fun notify(event: NotificationEvent)
}