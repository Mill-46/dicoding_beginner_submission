package com.estudiomil.dicodingbeginnersubmission

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.estudiomil.dicodingbeginnersubmission.model.DetailViewModel
import com.estudiomil.dicodingbeginnersubmission.ui.ArticleApp
import com.estudiomil.dicodingbeginnersubmission.ui.theme.DicodingBeginnerSubmissionTheme

class MainActivity : ComponentActivity() {

    private lateinit var detailViewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detailViewModel = ViewModelProvider(this).get(DetailViewModel::class.java)

        setContent {
            DicodingBeginnerSubmissionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleApp().Route(detailViewModel)
                }
            }
        }
    }
}