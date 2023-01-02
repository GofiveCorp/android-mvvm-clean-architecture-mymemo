package com.noobdev.mymemo.framework.di

import com.noobdev.mymemo.framework.ListViewModel
import com.noobdev.mymemo.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}