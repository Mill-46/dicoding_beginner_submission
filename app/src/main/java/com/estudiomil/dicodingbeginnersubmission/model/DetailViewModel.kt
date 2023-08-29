package com.estudiomil.dicodingbeginnersubmission.model

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.estudiomil.dicodingbeginnersubmission.data.ArticleData

class DetailViewModel : ViewModel() {

    private val _currentArticle = mutableStateOf(ArticleData())
    val currentArticle: State<ArticleData> = _currentArticle

    fun setStateArticle(article: ArticleData) {
        _currentArticle.value = article
    }
}