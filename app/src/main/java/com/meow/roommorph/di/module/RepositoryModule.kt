package com.meow.roommorph.di.module

import android.app.NotificationManager
import com.meow.roommorph.core.notification.NotificationManagerImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NotificationModule {

    @Binds
    @Singleton
    internal abstract fun bindNotificationManager(
        impl: NotificationManagerImpl
    ): NotificationManager
}