package com.anelcc.widgetpinning

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.anelcc.widgetpinning.ui.theme.WidgetPinningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WidgetPinningTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        AddWidgetButton()
                    }
                }
            }
        }
    }

    @Composable
    fun AddWidgetButton() {
        val context = (LocalContext.current)
        Button(modifier = Modifier.fillMaxWidth(),
            onClick = {
                callWidgetPinner(context)
            },
            content = { Text(text = "Add Widget") }
        )
    }


    private fun callWidgetPinner(context: Context) {

    }
}
