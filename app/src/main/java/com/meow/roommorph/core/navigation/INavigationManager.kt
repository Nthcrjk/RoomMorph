package com.meow.roommorph.core.navigation

import kotlinx.coroutines.flow.Flow

interface INavigationManager {
    val events: Flow<NavigationEvent>
    fun navigate(event: NavigationEvent)
}