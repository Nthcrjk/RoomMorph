package com.meow.roommorph.screens.nav_graph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.compose.rememberNavController
import com.meow.roommorph.R
import com.meow.roommorph.core.navigation.NavigationEvent
import com.meow.roommorph.screens.general.GeneralRoute
import com.meow.roommorph.screens.general.GeneralScreen
import com.meow.roommorph.screens.general.ui.PresetItem

@Composable
fun NavGraphScreen(
    viewModel: NavGraphViewModel = hiltViewModel(),
) {
    val navController = rememberNavController()
    val lifecycleOwner = LocalLifecycleOwner.current

    var isSelected by remember { mutableStateOf(false) }

    LaunchedEffect(viewModel.navigationManager.events, lifecycleOwner) {
        lifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
            viewModel.navigationManager.events.collect { event ->
                when (event) {
                    is NavigationEvent.NavigateTo -> {
                        navController.navigate(event.route) {
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                    is NavigationEvent.PopUpTo -> {
                        navController.navigate(event.route) {
                            popUpTo(0) { inclusive = true }
                            launchSingleTop = true
                        }
                    }
                }
            }
        }
    }
    GeneralRoute()
    /*
    PresetItem(
        "Английский Английский Английский",
        painterResource(R.drawable.test_room),
        isSelected,
        {isSelected = !isSelected}
    )
    */
    /*
    NavHost(
        navController = navController,
        startDestination = "meow"
    ) {

    }

     */
}

@Preview
@Composable
fun PreviewGreeting() {

}