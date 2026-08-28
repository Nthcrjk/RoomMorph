package com.meow.roommorph.core.navigation

import jakarta.inject.Inject
import jakarta.inject.Singleton
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

@Singleton
class NavigationManagerImpl @Inject constructor(): INavigationManager {
    private val _events = Channel<NavigationEvent>(Channel.BUFFERED)
    override val events = _events.receiveAsFlow()

    override fun navigate(event: NavigationEvent) {
        _events.trySend(event)
    }
}