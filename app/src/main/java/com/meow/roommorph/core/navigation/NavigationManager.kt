package com.meow.roommorph.core.navigation

import jakarta.inject.Inject
import jakarta.inject.Singleton
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

@Singleton
class NavigationManager @Inject constructor() {
    private val _events = Channel<NavigationEvent>(Channel.BUFFERED)
    val events = _events.receiveAsFlow()

    fun navigate(event: NavigationEvent) {
        _events.trySend(event)
    }
}