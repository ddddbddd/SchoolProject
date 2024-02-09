package com.example.schoolproject.otherScreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.schoolproject.ui.theme.SchoolProjectTheme

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    text: String,
    click: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 40.dp, top = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
            IconButton(
                onClick = click,
                modifier = modifier.size(35.dp)
            ) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null,
                    modifier = modifier.size(35.dp))
            }
            Text(text = text,
                fontSize = 23.sp)

            Text(text = "   ")
    }
}

@Preview
@Composable
fun sdfs() {
    SchoolProjectTheme {
        TopBar(text = "Цекль проекта") {
            
        }
    }
}