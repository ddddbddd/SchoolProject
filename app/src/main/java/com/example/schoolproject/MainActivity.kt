package com.example.schoolproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.schoolproject.ui.theme.SchoolProjectTheme
import com.example.schoolproject.otherScreens.Performance
import com.example.schoolproject.otherScreens.ProjectGoal
import com.example.schoolproject.otherScreens.ProjectTopic
import com.example.schoolproject.otherScreens.UsefulVideos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            SchoolProjectTheme {
                NavHost(navController = navController, startDestination = "main_screen") {
                    composable("main_screen") {
                        FullScreen(
                            projectGoal = {
                                navController.navigate("project_goal")
                            },
                            projectTopic = {
                                navController.navigate("project_topic")
                            },
                            usefulVideos = {
                                navController.navigate("useful_videos")
                            },
                            performance = {
                                navController.navigate("performance")
                            }
                        )
                    }
                    composable("project_goal") {
                        ProjectGoal(click = {
                            navController.navigate("main_screen")
                        })
                    }
                    composable("project_topic") {
                        ProjectTopic(click = {
                                navController.navigate("main_screen")
                            }
                        )
                    }
                    composable("useful_videos") {
                        UsefulVideos(click = {
                            navController.navigate("main_screen")
                        })
                    }
                    composable("performance") {
                        Performance(click = {
                                navController.navigate("main_screen")
                            }
                        )
                    }
                }
            }
        }
    }
}

