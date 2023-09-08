package com.anelcc.widgetpinning

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Alignment
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize

class SampleWidget: GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            WidgetContent(context)
        }
    }

    override suspend fun onDelete(context: Context, glanceId: GlanceId) {
        super.onDelete(context, glanceId)
        // This is where you could log that a widget has been removed or some other logic such as
        // setting a value that denotes a recommendation should be shown in the app to add the
        // widget the next time the user opens the app.
    }

    @Composable
    private fun WidgetContent(context: Context) {
        // For a widget that needs to update based on changes to data
        // referer to: https://developer.android.com/develop/ui/compose/glance/glance-app-widget#use-application
        Row(
            horizontalAlignment = Alignment.Horizontal.CenterHorizontally,
            verticalAlignment = Alignment.Vertical.CenterVertically,
            modifier = GlanceModifier.fillMaxSize()
        ) {
            Button(
                text = context.getString(R.string.app_name),
                onClick = actionStartActivity<MainActivity>()
            )
        }
    }
}