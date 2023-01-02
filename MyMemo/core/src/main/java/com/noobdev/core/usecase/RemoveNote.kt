package com.noobdev.core.usecase

import com.noobdev.core.data.Note
import com.noobdev.core.repository.NoteRepository


class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}