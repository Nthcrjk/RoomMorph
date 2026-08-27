package com.meow.roommorph.common.base

import androidx.lifecycle.ViewModel
import com.meow.roommorph.core.navigation.NavigationManager
import com.meow.roommorph.core.notification.INotificationManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseViewModel<S>(
    val navigationManager: NavigationManager,
    val notificationManager: INotificationManager,
): ViewModel() {
    protected val _state: MutableStateFlow<S> = initUiState()
    val state = _state.asStateFlow()

    protected abstract fun initUiState(): MutableStateFlow<S>
}