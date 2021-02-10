package com.raywenderlich.android.majesticreader.interactors.document

import com.raywenderlich.android.majesticreader.data.document.DocumentRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

class GetDocuments: KoinComponent {
    private val documentRepository: DocumentRepository by inject()
    suspend operator fun invoke() = documentRepository.getDocuments()
}