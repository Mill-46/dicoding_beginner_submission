package com.estudiomil.dicodingbeginnersubmission.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.estudiomil.dicodingbeginnersubmission.model.DetailViewModel
import com.estudiomil.dicodingbeginnersubmission.ui.ArticleApp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    viewModel: DetailViewModel = DetailViewModel(),
    navController: NavHostController = rememberNavController(),
) {

    val article = viewModel.currentArticle.value
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Detail", color = Color(255, 255, 255))
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    Color(157, 29, 33)
                ),
                navigationIcon = {
                    IconButton(onClick = {
                        ArticleApp().pop(navController)
                    }) {
                        Icon(
                            Icons.Filled.ArrowBack,
                            contentDescription = "Icon Back",
                            tint = Color(255, 255, 255)
                        )
                    }
                },
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .verticalScroll(scrollState)
        ) {
            Column {
                Image(
                    painter = painterResource(id = article.img),
                    contentDescription = "Image Article",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .aspectRatio(16 / 9f)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = article.title,
                    color = Color(157, 29, 33),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = article.description,
                    color = Color(157, 29, 33),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(horizontal = 20.dp)
                )
            }
        }
    }
}