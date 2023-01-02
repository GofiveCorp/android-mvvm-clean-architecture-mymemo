package com.noobdev.mymemo.framework.di

import com.noobdev.core.repository.NoteRepository
import com.noobdev.core.usecase.*
import com.noobdev.mymemo.framework.UseCases
import com.noobdev.core.usecase.*
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {
    @Provides
    fun getUseCases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository),
        GetWordCount()
    )
}