package com.anelcc.widgetpinning

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
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
import com.anelcc.widgetpinning.widget.SampleWidgetReceiver
import com.anelcc.widgetpinning.widget.WidgetPinnedReceiver

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

    @RequiresApi(Build.VERSION_CODES.O)
    private fun callWidgetPinner(context: Context) {
        val appWidgetManager = AppWidgetManager.getInstance(context)
        val widgetProvider = ComponentName(context, SampleWidgetReceiver::class.java)

        val pinnedIntent = Intent(context, WidgetPinnedReceiver::class.java)
        pinnedIntent.putExtra("requestCode", 7)

        if (appWidgetManager.isRequestPinAppWidgetSupported) {
            // Create the PendingIntent object only if your app needs to be notified
            // when the user chooses to pin the widget. Note that if the pinning
            // operation fails, your app isn't notified. This callback receives the ID
            // of the newly pinned widget (EXTRA_APPWIDGET_ID).
            val successCallback = PendingIntent.getBroadcast(
                context,
                0,
                pinnedIntent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
            )

            appWidgetManager.requestPinAppWidget(widgetProvider, null, successCallback)
        }
    }
}
