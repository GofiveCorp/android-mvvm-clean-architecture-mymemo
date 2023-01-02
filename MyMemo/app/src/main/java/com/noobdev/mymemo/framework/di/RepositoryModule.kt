package com.noobdev.mymemo.framework.di

import android.app.Application
import com.noobdev.core.repository.NoteRepository
import com.noobdev.mymemo.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}