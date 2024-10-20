package com.jesse.c24kknavguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jesse.c24kknavguide.core.navigation.NavigationWrapper
import com.jesse.c24kknavguide.ui.theme.C24kKnavGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            C24kKnavGuideTheme {
                NavigationWrapper()
            }
        }
    }
}


