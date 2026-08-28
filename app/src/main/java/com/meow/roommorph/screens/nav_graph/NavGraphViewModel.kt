package com.meow.roommorph.screens.nav_graph

import com.meow.roommorph.common.base.BaseViewModel
import com.meow.roommorph.core.navigation.INavigationManager
import com.meow.roommorph.core.navigation.NavigationManagerImpl
import com.meow.roommorph.core.notification.INotificationManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class NavGraphViewModel @Inject constructor(
    navigationManager: INavigationManager,
    notificationManager: INotificationManager
): BaseViewModel<Unit, Unit, Unit>(navigationManager, notificationManager) {
    override fun initUiState(): MutableStateFlow<Unit> {
        return MutableStateFlow((Unit))
    }

    override fun onEvent(event: Unit) {

    }

}