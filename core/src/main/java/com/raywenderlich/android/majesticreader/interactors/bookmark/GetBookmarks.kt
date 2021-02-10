package com.raywenderlich.android.majesticreader.interactors.bookmark

import com.raywenderlich.android.majesticreader.data.bookmark.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.document.Document
import org.koin.core.KoinComponent
import org.koin.core.inject

class GetBookmarks: KoinComponent {
    private val bookmarkRepository: BookmarkRepository by inject()
    suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}