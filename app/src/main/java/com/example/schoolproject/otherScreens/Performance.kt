package com.example.schoolproject.otherScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.schoolproject.R
import com.example.schoolproject.YellowGradient

@Composable
fun Performance(
    modifier: Modifier = Modifier,
    click: () -> Unit
) {

    Box(
        modifier = modifier.background(YellowGradient())
    ) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(start = 10.dp, end = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                TopBar(text = stringResource(id = R.string.additional), click = click)

                Text(
                    text = stringResource(id = R.string.how_defend),
                    style = MaterialTheme.typography.titleLarge,
                    modifier = modifier.padding(top = 10.dp, bottom = 10.dp)
                )

                Divider(color = Color.Black, thickness = 2.dp,
                    modifier = modifier.padding(bottom = 20.dp, top = 20.dp))

                Text(text = stringResource(id = R.string.project_additional_info))

                Divider(color = Color.Black, thickness = 2.dp,
                    modifier = modifier.padding(bottom = 20.dp, top = 20.dp))
            }
        }
    }
}

