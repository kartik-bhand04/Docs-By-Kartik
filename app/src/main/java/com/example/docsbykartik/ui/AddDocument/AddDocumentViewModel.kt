package com.example.docsbykartik.ui.AddDocument

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddDocumentFragmentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is add doc  Fragment"
    }
    val text: LiveData<String> = _text
}