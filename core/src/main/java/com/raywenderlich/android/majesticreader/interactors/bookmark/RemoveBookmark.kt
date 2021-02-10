package com.raywenderlich.android.majesticreader.interactors.bookmark

import com.raywenderlich.android.majesticreader.data.bookmark.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.bookmark.Bookmark
import com.raywenderlich.android.majesticreader.domain.document.Document
import org.koin.core.Koin
import org.koin.core.KoinComponent
import org.koin.core.inject

class RemoveBookmark: KoinComponent {
    private val bookmarkRepository: BookmarkRepository by inject()
    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarkRepository.removeBookmark(document, bookmark)
}