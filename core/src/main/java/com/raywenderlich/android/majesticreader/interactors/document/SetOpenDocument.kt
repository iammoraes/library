package com.raywenderlich.android.majesticreader.interactors.document

import com.raywenderlich.android.majesticreader.data.document.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.document.Document
import org.koin.core.KoinComponent
import org.koin.core.inject

class SetOpenDocument: KoinComponent {
    private val documentRepository: DocumentRepository by inject()
    operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}