package com.raposo.pmdmud5p2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.raposo.pmdmud5p2.ui.theme.PmdmUD5P2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PmdmUD5P2Theme {
                Column(
                    modifier = Modifier.padding(25.dp),
                ) {
                    LocationScreen()
                }
            }
        }
    }
}