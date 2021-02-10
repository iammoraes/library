package com.raywenderlich.android.majesticreader.di.modules

import androidx.room.Room
import com.raywenderlich.android.majesticreader.data.bookmark.BookmarkDataSource
import com.raywenderlich.android.majesticreader.data.bookmark.BookmarkRepository
import com.raywenderlich.android.majesticreader.data.document.DocumentDataSource
import com.raywenderlich.android.majesticreader.data.document.DocumentRepository
import com.raywenderlich.android.majesticreader.data.document.OpenDocumentDataSource
import com.raywenderlich.android.majesticreader.database.source.InMemoryOpenDocumentDataSource
import com.raywenderlich.android.majesticreader.database.source.RoomBookmarkDataSource
import com.raywenderlich.android.majesticreader.database.source.RoomDocumentDataSource
import com.raywenderlich.android.majesticreader.database.dao.BookmarkDao
import com.raywenderlich.android.majesticreader.database.dao.DocumentDao
import com.raywenderlich.android.majesticreader.database.MajesticReaderDatabase
import com.raywenderlich.android.majesticreader.interactors.bookmark.AddBookmark
import com.raywenderlich.android.majesticreader.interactors.bookmark.GetBookmarks
import com.raywenderlich.android.majesticreader.interactors.bookmark.RemoveBookmark
import com.raywenderlich.android.majesticreader.interactors.document.*
import com.raywenderlich.android.majesticreader.ui.library.LibraryViewModel
import com.raywenderlich.android.majesticreader.ui.reader.ReaderViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

private const val DATABASE_NAME = "reader.db"

val useCasesModule = module {
    single { AddBookmark() }
    single { GetBookmarks() }
    single { RemoveBookmark() }
    single { AddDocument() }
    single { GetDocuments() }
    single { GetOpenDocument() }
    single { RemoveDocument() }
    single { SetOpenDocument() }
}

val viewModelModule = module {
    viewModel<LibraryViewModel> {
        LibraryViewModel(get())
    }

    viewModel<ReaderViewModel> {
        ReaderViewModel(get(), get())
    }

    single<Interactors> {
        Interactors(get(), get(), get(), get(), get(), get(), get(), get())
    }
}

val dataBaseModule = module {

    single<MajesticReaderDatabase> {
        Room.databaseBuilder(
                get(),
                MajesticReaderDatabase::class.java,
                DATABASE_NAME
        ).build()
    }

    single<BookmarkDao> {
        get<MajesticReaderDatabase>().bookmarkDao()
    }

    single<DocumentDao> {
        get<MajesticReaderDatabase>().documentDao()
    }

    single<InMemoryOpenDocumentDataSource> {
        InMemoryOpenDocumentDataSource()
    }

    single<OpenDocumentDataSource> {
        InMemoryOpenDocumentDataSource()
    }

    single<DocumentDataSource> {
        RoomDocumentDataSource(get())
    }

    single<BookmarkDataSource> {
        RoomBookmarkDataSource(get())
    }

    single<BookmarkRepository> {
        BookmarkRepository(get())
    }

    single<DocumentRepository> {
        DocumentRepository(get(), get())
    }
}
