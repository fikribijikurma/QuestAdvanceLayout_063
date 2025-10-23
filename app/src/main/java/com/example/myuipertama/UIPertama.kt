package com.example.myuipertama

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ActivitasPertama(modifier: Modifier){
    Column (modifier = Modifier.padding(top=110.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(stringResource(R.string.univ),
            fontSize = 22.sp)
        Spacer(modifier = Modifier.height(25.dp))
        Card (modifier = Modifier
            .fillMaxSize(1f)
            .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )) {

        }

    }
}