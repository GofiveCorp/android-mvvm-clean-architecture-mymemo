package com.noobdev.core.usecase

import com.noobdev.core.repository.NoteRepository


class GetAllNotes(private val noteRepository: NoteRepository) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}