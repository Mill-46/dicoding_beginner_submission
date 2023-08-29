package com.estudiomil.dicodingbeginnersubmission.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.estudiomil.dicodingbeginnersubmission.data.ArticleDatabase
import com.estudiomil.dicodingbeginnersubmission.item.ArticleItem
import com.estudiomil.dicodingbeginnersubmission.model.DetailViewModel
import com.estudiomil.dicodingbeginnersubmission.ui.ArticleApp
import com.estudiomil.dicodingbeginnersubmission.ui.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavHostController = rememberNavController(),
    viewModel: DetailViewModel = DetailViewModel(),
) {
    val listOfArticle = ArticleDatabase().listOfArticleData

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row {
                        Text(
                            text = "Golden",
                            color = Color(253, 219, 42),
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.SemiBold,
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Lamian",
                            color = Color(255, 255, 255),
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    Color(157, 29, 33)
                ),
                actions = {
                    IconButton(onClick = {
                        ArticleApp().push(
                            navController = navController,
                            Screens.AboutScreen.route
                        )
                    }) {
                        Icon(
                            Icons.Filled.Info,
                            contentDescription = "Icon Info",
                            tint = Color(255, 255, 255)
                        )
                    }
                })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color(255, 255, 255))
        ) {
            Text(
                text = "Article Golden Lamian",
                color = Color(157, 29, 33),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
            )
            LazyColumn {
                items(listOfArticle) {
                    ArticleItem(it) {
                        viewModel.setStateArticle(it)
                        ArticleApp().push(
                            navController = navController,
                            Screens.DetailScreen.route
                        )
                    }
                }
            }
        }
    }
}