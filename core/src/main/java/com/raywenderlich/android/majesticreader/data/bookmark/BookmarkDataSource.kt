package com.raywenderlich.android.majesticreader.data.bookmark

import com.raywenderlich.android.majesticreader.domain.bookmark.Bookmark
import com.raywenderlich.android.majesticreader.domain.document.Document

interface BookmarkDataSource {
    suspend fun add(document: Document, bookmark: Bookmark)
    suspend fun read(document: Document): List<Bookmark>
    suspend fun remove(document: Document, bookmark: Bookmark)
}