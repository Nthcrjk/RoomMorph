package com.meow.roommorph.common.base

import androidx.lifecycle.ViewModel
import com.meow.roommorph.core.navigation.INavigationManager
import com.meow.roommorph.core.navigation.NavigationManagerImpl
import com.meow.roommorph.core.notification.INotificationManager
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow

abstract class BaseViewModel<STATE, EVENT, EFFECT>(
    val navigationManagerImpl: INavigationManager,
    val notificationManager: INotificationManager,
): ViewModel() {
    protected val _state: MutableStateFlow<STATE> = initUiState()
    val state = _state.asStateFlow()

    protected val _effect = Channel<EFFECT>(Channel.BUFFERED)
    val effect = _effect.receiveAsFlow()

    protected abstract fun initUiState(): MutableStateFlow<STATE>

    abstract fun onEvent(event: EVENT): Unit
}