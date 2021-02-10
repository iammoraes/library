package com.raywenderlich.android.majesticreader.di.modules

import com.raywenderlich.android.majesticreader.interactors.bookmark.AddBookmark
import com.raywenderlich.android.majesticreader.interactors.bookmark.GetBookmarks
import com.raywenderlich.android.majesticreader.interactors.bookmark.RemoveBookmark
import com.raywenderlich.android.majesticreader.interactors.document.*

data class Interactors(
        val addBookmark: AddBookmark,
        val getBookmarks: GetBookmarks,
        val deleteBookmark: RemoveBookmark,
        val addDocument: AddDocument,
        val getDocuments: GetDocuments,
        val removeDocument: RemoveDocument,
        val getOpenDocument: GetOpenDocument,
        val setOpenDocument: SetOpenDocument
)