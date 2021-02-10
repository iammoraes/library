package com.raywenderlich.android.majesticreader.interactors.document

import com.raywenderlich.android.majesticreader.data.document.DocumentRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class GetOpenDocument: KoinComponent {
    private val documentRepository: DocumentRepository by inject()
    operator fun invoke() = documentRepository.getOpenDocument()
}