package com.raywenderlich.android.majesticreader.ui.library;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\"\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010*\u001a\u00020\u000fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lcom/raywenderlich/android/majesticreader/ui/library/LibraryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/raywenderlich/android/majesticreader/ui/library/DocumentsAdapter;", "getAdapter", "()Lcom/raywenderlich/android/majesticreader/ui/library/DocumentsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "openDocument", "Lkotlin/Function1;", "Lcom/raywenderlich/android/majesticreader/domain/document/Document;", "Lkotlin/ParameterName;", "name", "document", "", "getOpenDocument", "()Lkotlin/jvm/functions/Function1;", "setOpenDocument", "(Lkotlin/jvm/functions/Function1;)V", "viewModel", "Lcom/raywenderlich/android/majesticreader/ui/library/LibraryViewModel;", "getViewModel", "()Lcom/raywenderlich/android/majesticreader/ui/library/LibraryViewModel;", "viewModel$delegate", "loadDocuments", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openIntentLibrary", "app_debug"})
public final class LibraryFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.raywenderlich.android.majesticreader.domain.document.Document, kotlin.Unit> openDocument;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.raywenderlich.android.majesticreader.domain.document.Document, kotlin.Unit> getOpenDocument() {
        return null;
    }
    
    public final void setOpenDocument(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.android.majesticreader.domain.document.Document, kotlin.Unit> p0) {
    }
    
    private final com.raywenderlich.android.majesticreader.ui.library.LibraryViewModel getViewModel() {
        return null;
    }
    
    private final com.raywenderlich.android.majesticreader.ui.library.DocumentsAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void loadDocuments() {
    }
    
    private final void openIntentLibrary() {
    }
    
    public LibraryFragment() {
        super();
    }
}