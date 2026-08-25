package com.meow.roommorph.core.notification

sealed class NotificationEvent {
    data class ShowToast(
        val text: String
    ) : NotificationEvent()
}