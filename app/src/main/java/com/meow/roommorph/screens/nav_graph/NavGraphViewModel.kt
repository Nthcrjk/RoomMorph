package com.meow.roommorph.screens.nav_graph

import com.meow.roommorph.common.base.BaseViewModel
import com.meow.roommorph.core.navigation.NavigationManager
import com.meow.roommorph.core.notification.INotificationManager
import com.meow.roommorph.screens.general.GeneralUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class NavGraphViewModel @Inject constructor(
    navigationManager: NavigationManager,
    notificationManager: INotificationManager
): BaseViewModel<Unit>(navigationManager, notificationManager) {
    override fun initUiState(): MutableStateFlow<Unit> {
        return MutableStateFlow((Unit))
    }

}