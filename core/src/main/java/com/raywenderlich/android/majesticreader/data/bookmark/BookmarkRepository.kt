package com.raywenderlich.android.majesticreader.data.bookmark

import com.raywenderlich.android.majesticreader.domain.bookmark.Bookmark
import com.raywenderlich.android.majesticreader.domain.document.Document

class BookmarkRepository(private val dataSource: BookmarkDataSource) {
//    suspend permite usar mecanismos coroutine-powered no Room para encadeamento mais simples
    suspend fun addBookmark(document: Document, bookmark: Bookmark) = dataSource.add(document, bookmark)
    suspend fun getBookmarks(document: Document) = dataSource.read(document)
    suspend fun removeBookmark(document: Document, bookmark: Bookmark) = dataSource.remove(document, bookmark)
}