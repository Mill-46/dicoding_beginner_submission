package com.estudiomil.dicodingbeginnersubmission.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.estudiomil.dicodingbeginnersubmission.data.ArticleData

@Composable
fun ArticleItem(articleData: ArticleData, modifier: Modifier = Modifier, onTap: () -> Unit) {

    Card(
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(Color(255, 255, 255)),
        modifier = modifier
            .fillMaxWidth()
            .size(120.dp)
            .clickable { onTap() }
            .padding(horizontal = 10.dp, vertical = 10.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = articleData.img),
                contentDescription = "Img Menu",
                contentScale = ContentScale.None,
                modifier = modifier.size(100.dp),
            )
            Column(
                modifier = modifier
                    .weight(1F)
                    .padding(horizontal = 10.dp)
            ) {
                Spacer(modifier = modifier.size(5.dp))
                Text(
                    text = articleData.title,
                    color = Color(157, 29, 33),
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Black
                )
                Spacer(modifier = modifier.size(5.dp))
                Text(
                    text = articleData.description,
                    color = Color(157, 29, 33),
                    style = MaterialTheme.typography.labelMedium,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.SemiBold,
                )
            }
        }
    }
}