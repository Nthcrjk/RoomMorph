package com.meow.roommorph.screens.general

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun GeneralRoute() {

    val viewmodel = hiltViewModel<GeneralViewModel>()

    val state by viewmodel.state.collectAsStateWithLifecycle()

    GeneralScreen(state)
}