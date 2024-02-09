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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.schoolproject.CyanGradient
import com.example.schoolproject.R

@Composable
fun ProjectGoal(
    modifier: Modifier = Modifier,
    click: () -> Unit
) {
    Box(
        modifier = modifier.background(CyanGradient())
    ) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(start = 10.dp, end = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(1) {
                TopBar(text = stringResource(id = R.string.goal),
                    click = click)

                Text(
                    text = stringResource(id = R.string.why_need),
                    style = MaterialTheme.typography.labelMedium,
                    modifier = modifier.padding(top = 15.dp, bottom = 15.dp))

                Text(text = stringResource(id = R.string.ask_many_students),
                    textAlign = TextAlign.Center,
                     fontSize = 18.sp)

                Divider(color = Color.Black, thickness = 2.dp,
                    modifier = modifier.padding(bottom = 20.dp, top = 20.dp))

                Text(text = stringResource(id = R.string.project_goal),
                     textAlign = TextAlign.Center)

                Divider(color = Color.Black, thickness = 2.dp,
                    modifier = modifier.padding(bottom = 20.dp, top = 10.dp))
            }
        }
    }
}
