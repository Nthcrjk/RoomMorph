package com.meow.roommorph.screens.nav_graph

import com.meow.roommorph.common.base.BaseViewModel
import com.meow.roommorph.core.navigation.NavigationManager
import com.meow.roommorph.core.notification.INotificationManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NavGraphViewModel @Inject constructor(
    navigationManager: NavigationManager,
    notificationManager: INotificationManager
): BaseViewModel(navigationManager, notificationManager) {
}