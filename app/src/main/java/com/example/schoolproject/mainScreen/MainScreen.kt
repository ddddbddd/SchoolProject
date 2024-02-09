package com.example.schoolproject.mainScreen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.schoolproject.CyanGradient
import com.example.schoolproject.GreenGradient
import com.example.schoolproject.R
import com.example.schoolproject.RedGradient
import com.example.schoolproject.YellowGradient
import com.example.schoolproject.ui.theme.SchoolProjectTheme

@Composable
fun TopOfScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(
                top = 15.dp, bottom = 15.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.helper),
            style = MaterialTheme.typography.titleLarge
        )
        Image(
            painter = painterResource(id = R.drawable.white_book),
            contentDescription = null,
            modifier = modifier.size(130.dp)
        )
        Text(
            text = stringResource(id = R.string.its_my_project),
            style = MaterialTheme.typography.bodyMedium
        )

        Text(text = stringResource(id = R.string.how_help),
            textAlign = TextAlign.Center,
            modifier = modifier.padding(top = 10.dp),
            fontSize = 18.sp)
    }
}

@Composable
fun LinksToOtherScreens(
    modifier: Modifier = Modifier,
    projectGoal: () -> Unit,
    projectTopic: () -> Unit,
    usefulVideos: () -> Unit,
    performance: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Cards(
                text = stringResource(id = R.string.goal),
                img = R.drawable.idea,
                color = CyanGradient(),
                link = projectGoal
            )

            Spacer(modifier = modifier.width(15.dp))

            Cards(
                text = stringResource(id = R.string.topic),
                img = R.drawable.goal,
                color = RedGradient(),
                link = projectTopic
            )
        }

        Spacer(modifier = modifier.height(20.dp))

        Row {
            Cards(
                text = stringResource(id = R.string.videos),
                img = R.drawable.play,
                color = GreenGradient(),
                link = usefulVideos
            )

            Spacer(modifier = modifier.width(15.dp))

            Cards(
                text = stringResource(id = R.string.additional),
                img = R.drawable.book,
                color = YellowGradient(),
                link = performance
            )
        }
    }
}



@Composable
fun Cards(
    modifier: Modifier = Modifier,
    text: String,
    @DrawableRes img: Int,
    color: Brush,
    link: () -> Unit
) {

    Card(
        modifier
            .width(170.dp)
            .height(210.dp)
            .clickable(
                onClick = link
            ),
        elevation = CardDefaults.cardElevation(10.dp),
    ) {
        Box(
            modifier = modifier.background(color)
        ) {
            Column(
                modifier = modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = null,
                    modifier = modifier.size(110.dp)
                )

                Text(text = text,
                    style = MaterialTheme.typography.labelMedium,
                    textAlign = TextAlign.Center,
                    color = colorResource(id = R.color.light_black))
            }
        }
    }
}

@Preview
@Composable
fun sdf(){
    Cards(
        text = stringResource(id = R.string.topic),
        img = R.drawable.goal,
        color = RedGradient(),
        link = {

        }
    )
}

//TODO этот экран

//TODO сделать картинки для разных экравнов