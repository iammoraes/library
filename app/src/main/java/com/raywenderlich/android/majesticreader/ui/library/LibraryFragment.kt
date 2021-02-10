/*
 * Copyright (c) 2019 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.majesticreader.ui.library

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.raywenderlich.android.majesticreader.R
import com.raywenderlich.android.majesticreader.domain.document.Document
import com.raywenderlich.android.majesticreader.util.IntentUtil.createOpenIntent
import com.raywenderlich.android.majesticreader.util.INVALID_CONTEXT
import com.raywenderlich.android.majesticreader.util.READ_REQUEST_CODE
import kotlinx.android.synthetic.main.fragment_library.*
import org.koin.android.viewmodel.ext.android.viewModel

class LibraryFragment : Fragment() {

    var openDocument: (document: Document) -> Unit = {}

    private val viewModel: LibraryViewModel by viewModel()

    private val adapter by lazy {
        context?.let {
            DocumentsAdapter(glide = Glide.with(it)){document ->
                openDocument(document)
            }
        } ?: throw IllegalArgumentException(INVALID_CONTEXT)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        documentsRecyclerView.adapter = adapter

        loadDocuments()
        openIntentLibrary()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == READ_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            data?.data?.also { uri -> viewModel.addDocument(uri) }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    private fun loadDocuments() {
        viewModel.documents.observe(this, Observer { adapter.update(it) })
        viewModel.loadDocuments()
    }

    private fun openIntentLibrary() {
        fab.setOnClickListener {
            startActivityForResult(createOpenIntent(), READ_REQUEST_CODE)
        }
    }

}
