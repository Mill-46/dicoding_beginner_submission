package com.estudiomil.dicodingbeginnersubmission.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.estudiomil.dicodingbeginnersubmission.R
import com.estudiomil.dicodingbeginnersubmission.ui.ArticleApp
import com.estudiomil.dicodingbeginnersubmission.ui.Screens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavHostController = rememberNavController()
) {

    LaunchedEffect(true) {
        delay(2000)
        ArticleApp().pushAndReplace(navController = navController, Screens.HomeScreen.route)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(
                    157, 29, 33
                )
            ),
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Application Logo"
        )
        Row {
            Text(
                text = "Golden",
                color = Color(253, 219, 42),
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.displaySmall
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Lamian",
                color = Color(255, 255, 255),
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.displaySmall
            )
        }
        Text(
            text = "by estudio.mil",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.SemiBold,
            color = Color(255, 255, 255),
        )
    }
}
