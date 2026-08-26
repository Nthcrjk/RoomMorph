package com.meow.roommorph.core.notification

import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class NotificationManagerImpl @Inject constructor() : INotificationManager {
    private val _events = MutableSharedFlow<NotificationEvent>()
    override val events: SharedFlow<NotificationEvent> = _events.asSharedFlow()

    override suspend fun notify(event: NotificationEvent) {
        _events.emit(event)
    }
}