package com.raywenderlich.android.majesticreader.ui.library;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/raywenderlich/android/majesticreader/ui/library/LibraryViewModel;", "Landroidx/lifecycle/ViewModel;", "interactors", "Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "(Lcom/raywenderlich/android/majesticreader/framework/Interactors;)V", "documents", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/raywenderlich/android/majesticreader/domain/document/Document;", "getDocuments", "()Landroidx/lifecycle/MutableLiveData;", "addDocument", "", "uri", "Landroid/net/Uri;", "loadDocuments", "setOpenDocument", "document", "app_debug"})
public final class LibraryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.majesticreader.domain.document.Document>> documents = null;
    private final com.raywenderlich.android.majesticreader.framework.Interactors interactors = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.raywenderlich.android.majesticreader.domain.document.Document>> getDocuments() {
        return null;
    }
    
    public final void loadDocuments() {
    }
    
    public final void addDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public final void setOpenDocument(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.domain.document.Document document) {
    }
    
    public LibraryViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.Interactors interactors) {
        super();
    }
}