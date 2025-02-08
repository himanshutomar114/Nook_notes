package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.util.Screen
import com.plcoding.cleanarchitecturenoteapp.ui.theme.Brown
import kotlinx.coroutines.delay
import com.plcoding.cleanarchitecturenoteapp.R


@Composable
fun SplashScreen(navController: NavController) {
    // Trigger navigation after a delay
    LaunchedEffect(key1 = true) {
        delay(3000L)  // 3-second delay
        navController.navigate(Screen.NotesScreen.route) {
            popUpTo(Screen.SplashScreen.route) { inclusive = true }  // Remove SplashScreen from backstack
        }
    }

    // UI for Splash Screen
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Brown),
        Arrangement.Center,
        Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.splashlogo),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "NookNotes",
            fontFamily =  FontFamily.Serif,
            style = MaterialTheme.typography.h3,
            fontSize = 40.sp
        )


    }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Brown)
            .padding(0.dp,0.dp,0.dp,25.dp),
        Arrangement.Bottom,
        Alignment.CenterHorizontally
        
    ){ Text(
        text = "Created by Himanshu",
        style = MaterialTheme.typography.h3,
        fontSize = 15.sp
    )  }
}
