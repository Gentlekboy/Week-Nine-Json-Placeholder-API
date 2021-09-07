package com.gentlekboy.weeknine_jsonplaceholderapi.firstimplementation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gentlekboy.weeknine_jsonplaceholderapi.firstimplementation.repository.Repository

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}