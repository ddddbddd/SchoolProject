package com.example.schoolproject.otherScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.LifecycleOwner
import com.example.schoolproject.GreenGradient
import com.example.schoolproject.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

@Composable
fun UsefulVideos(
    modifier: Modifier = Modifier,
    click: () -> Unit
) {
    Box(
        modifier = modifier.background(GreenGradient())
    ) {

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(1) {
            TopBar(text = stringResource(id = R.string.videos), click = click)

            Text(text = stringResource(id = R.string.find_videos),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                modifier = modifier.padding(bottom = 15.dp))

            YoutubePlayer(
                youtubeVideoId = "nW6hw3oFZUs" ,
                lifecycleOwner = LocalLifecycleOwner.current
            )

            YoutubePlayer(
                youtubeVideoId = "3jF6XIjrzsY" ,
                lifecycleOwner = LocalLifecycleOwner.current
            )

            YoutubePlayer(
                youtubeVideoId = "hyBgjqsuZcM" ,
                lifecycleOwner = LocalLifecycleOwner.current
            )
        }
    }
    }
}

@Composable
fun YoutubePlayer(
    youtubeVideoId: String,
    lifecycleOwner: LifecycleOwner
) {

    AndroidView(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp)),
        factory = { context ->
            YouTubePlayerView(context = context).apply {
                lifecycleOwner.lifecycle.addObserver(this)

                addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                    override fun onReady(youTubePlayer: YouTubePlayer) {
                        youTubePlayer.loadVideo(youtubeVideoId, 100f)
                        youTubePlayer.pause()
                    }
                })
            }
        })

}