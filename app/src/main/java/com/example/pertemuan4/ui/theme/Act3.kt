package com.example.pertemuan4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource


@Composable
fun ActivityPertama(modifier: Modifier) {
    Column(
        modifier = modifier.padding(top = 100.dp)
            .fillMaxSize()
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource( id = R.string.prodi),
            fontSize = 35.sp
        )
    }
}