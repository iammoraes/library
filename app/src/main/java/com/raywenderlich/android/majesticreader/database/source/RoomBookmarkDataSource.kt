package com.raywenderlich.android.majesticreader.database.source

import android.content.Context
import com.raywenderlich.android.majesticreader.data.bookmark.BookmarkDataSource
import com.raywenderlich.android.majesticreader.domain.bookmark.Bookmark
import com.raywenderlich.android.majesticreader.domain.document.Document
import com.raywenderlich.android.majesticreader.database.entity.BookmarkEntity
import com.raywenderlich.android.majesticreader.database.MajesticReaderDatabase

class RoomBookmarkDataSource(context: Context) : BookmarkDataSource {

    private val bookmarkDao = MajesticReaderDatabase.getInstance(context).bookmarkDao()

    override suspend fun add(document: Document, bookmark: Bookmark) =
            bookmarkDao.addBookmark(
                    BookmarkEntity(documentUri = document.url, page = bookmark.page))

    override suspend fun read(document: Document): List<Bookmark> =
            bookmarkDao.getBookmarks(document.url).map { Bookmark(it.id, it.page)
    }

    override suspend fun remove(document: Document, bookmark: Bookmark) =
            bookmarkDao.removeBookmark(BookmarkEntity(
                    id = bookmark.id,
                    documentUri = document.url,
                    page = bookmark.page)
            )
}