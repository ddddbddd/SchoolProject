package com.example.schoolproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.colorResource

@Composable
fun BackgroundGradient() : Brush {
    return Brush.linearGradient(
        0.0f to colorResource(id = R.color.purple),
        500.00f to colorResource(id = R.color.purple_black),
        start = Offset.Zero,
        end = Offset.Infinite,
    )
}


@Composable
fun CyanGradient() : Brush {
    return Brush.linearGradient(
        0.0f to colorResource(id = R.color.cyan),
        500.00f to colorResource(id = R.color.cyan_black),
        start = Offset.Zero,
        end = Offset.Infinite,
    )
}

@Composable
fun GreenGradient() : Brush {
    return Brush.linearGradient(
        0.0f to colorResource(id = R.color.green),
        500.00f to colorResource(id = R.color.green_black),
        start = Offset.Zero,
        end = Offset.Infinite,
    )
}

@Composable
fun YellowGradient() : Brush {
    return Brush.linearGradient(
        0.0f to colorResource(id = R.color.yellow),
        500.00f to colorResource(id = R.color.yellow_black),
        start = Offset.Zero,
        end = Offset.Infinite,
    )
}

@Composable
fun RedGradient() : Brush {
    return Brush.linearGradient(
        0.0f to colorResource(id = R.color.red),
        500.00f to colorResource(id = R.color.red_black),
        start = Offset.Zero,
        end = Offset.Infinite,
    )
}

