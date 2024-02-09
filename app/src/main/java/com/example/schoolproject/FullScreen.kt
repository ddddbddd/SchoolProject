package com.example.schoolproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.schoolproject.mainScreen.LinksToOtherScreens
import com.example.schoolproject.mainScreen.TopOfScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FullScreen(
    modifier: Modifier = Modifier,
    projectGoal: () -> Unit,
    projectTopic: () -> Unit,
    usefulVideos: () -> Unit,
    performance: () -> Unit
) {


    Scaffold{ padding ->
        Box(modifier = modifier.background(BackgroundGradient())) {
            Column {
                    TopOfScreen(modifier = Modifier.padding(padding))
                    LinksToOtherScreens(
                        projectGoal = projectGoal,
                        projectTopic = projectTopic,
                        usefulVideos = usefulVideos,
                        performance = performance
                    )
            }
        }

    }
}
