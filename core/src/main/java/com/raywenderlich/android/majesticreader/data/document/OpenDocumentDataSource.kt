package com.raywenderlich.android.majesticreader.data.document

import com.raywenderlich.android.majesticreader.domain.document.Document

interface OpenDocumentDataSource {
    fun setOpenDocument(document: Document)
    fun getOpenDocument(): Document
}