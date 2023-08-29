@file:OptIn(ExperimentalMaterial3Api::class)

package com.estudiomil.dicodingbeginnersubmission.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.estudiomil.dicodingbeginnersubmission.R
import com.estudiomil.dicodingbeginnersubmission.ui.ArticleApp

@Composable
fun AboutScreen(
    navController: NavHostController = rememberNavController(),
) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "About", color = Color(255, 255, 255))
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    Color(157, 29, 33)
                ),
                navigationIcon = {
                    IconButton(onClick = { ArticleApp().pop(navController) }) {
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
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .verticalScroll(scrollState)
                .background(Color(255, 255, 255))
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_about),
                    contentDescription = "Image About",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Jamilurrahman | Software Developer",
                    color = Color(157, 29, 33),
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Box {
                        Column {
                            Text(
                                text = "Username",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Black,
                            )
                            Spacer(modifier = Modifier.size(3.dp))
                            Text(
                                text = "jamilurrahman46",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Box {
                        Column {
                            Text(
                                text = "Email",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Black,
                            )
                            Spacer(modifier = Modifier.size(3.dp))
                            Text(
                                text = "rahmanjamil370@gmail.com",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Box {
                        Column {
                            Text(
                                text = "No. Telephone",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Black,
                            )
                            Spacer(modifier = Modifier.size(3.dp))
                            Text(
                                text = "+6281219825332",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Box {
                        Column {
                            Text(
                                text = "Tempat, Tanggal Lahir",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Black,
                            )
                            Spacer(modifier = Modifier.size(3.dp))
                            Text(
                                text = "Jakarta, 28 Maret 2006",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Box {
                        Column {
                            Text(
                                text = "Pekerjaan/profesi",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Black,
                            )
                            Spacer(modifier = Modifier.size(3.dp))
                            Text(
                                text = "Pelajar/Mahasiswa",
                                color = Color(157, 29, 33),
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold,
                            )
                        }
                    }
                }
            }
        }
    }
}
