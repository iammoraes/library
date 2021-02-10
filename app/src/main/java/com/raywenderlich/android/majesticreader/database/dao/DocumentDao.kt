package com.raywenderlich.android.majesticreader.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.raywenderlich.android.majesticreader.database.entity.DocumentEntity

@Dao
interface DocumentDao {

  @Insert(onConflict = REPLACE)
  suspend fun addDocument(document: DocumentEntity)

  @Query("SELECT * FROM document")
  suspend fun getDocuments(): List<DocumentEntity>

  @Delete
  suspend fun removeDocument(document: DocumentEntity)
}
