package com.meow.roommorph.core.navigation

sealed interface NavigationEvent {

    data class NavigateTo(val route: Any) : NavigationEvent

    data class PopUpTo(val route: Any): NavigationEvent

}
