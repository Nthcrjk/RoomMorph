package com.meow.roommorph.screens.history

import com.meow.roommorph.common.base.BaseViewModel
import com.meow.roommorph.core.navigation.INavigationManager
import com.meow.roommorph.core.notification.INotificationManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class HistoryViewModel @Inject constructor(
    navigationManagerImpl: INavigationManager,
    notificationManager: INotificationManager
): BaseViewModel<Unit, Unit, Unit>(
    navigationManagerImpl, notificationManager
) {
    override fun initUiState(): MutableStateFlow<Unit> {
        return MutableStateFlow(Unit)
    }

    override fun onEvent(event: Unit) {

    }

}