package com.example.coinapp.ui.articles
import android.R
import com.example.coinapp.models.Coin
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import com.example.coinapp.ui.theme.CoinAppTheme
import java.security.AccessController

@Composable
fun CoinListCell(
    coin: Coin,
    modifier : Modifier = Modifier,
    onClick: () -> Unit,
    source: String = ""
){
    Card(
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
            .clickable{
                onClick() },
            shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onSurface
        )
    ){
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Text(text = coin.name ?: "",
                modifier = Modifier.padding(bottom = 10.dp),
                fontSize = 20.sp)
            AsyncImage(
                model = coin.image,
                contentDescription = coin.name
            )
        }
    }

}
