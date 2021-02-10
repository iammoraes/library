package com.raywenderlich.android.majesticreader.database.source

import com.raywenderlich.android.majesticreader.data.document.OpenDocumentDataSource
import com.raywenderlich.android.majesticreader.domain.document.Document

class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument() = openDocument
}