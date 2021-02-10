package com.raywenderlich.android.majesticreader.data.document

import com.raywenderlich.android.majesticreader.domain.document.Document

interface DocumentDataSource {
    suspend fun add(document: Document)
    suspend fun readAll(): List<Document>
    suspend fun remove(document: Document)
}