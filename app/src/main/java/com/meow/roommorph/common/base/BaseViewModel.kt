package com.meow.roommorph.common.base

import androidx.lifecycle.ViewModel
import com.meow.roommorph.core.navigation.NavigationManager
import com.meow.roommorph.core.notification.INotificationManager

abstract class BaseViewModel(
    val navigationManager: NavigationManager,
    val notificationManager: INotificationManager,
): ViewModel() {

}